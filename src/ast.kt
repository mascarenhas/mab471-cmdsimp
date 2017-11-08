
interface Exp {
    var tipo: String?
}

interface Cmd

fun <T> duplicadas(l: List<T>): Set<T> {
    val s = mutableSetOf<T>()
    val dups = mutableSetOf<T>()
    for(item in l) {
        if(s.contains(item)) dups.add(item);
        else s.add(item);
    }
    return dups;
}

data class Tiny(val classes: List<Classe>,
                val procs: List<Proc>,
                val corpo: Bloco) {
    fun escopo(): MutableList<String> {
        val erros = mutableListOf<String>()
        // Primeira passada
        val dclasses = duplicadas(classes.map { c -> c.nome })
        for(cls in dclasses) {
            erros.add("classe $cls declarada mais de uma vez")
        }
        val classes = classes.map{ cls -> Pair(cls.nome, cls) }.toMap()
        val dvars = duplicadas(corpo.vars)
        for(v in dvars) {
            erros.add("variável global $v declarada mais de uma vez")
        }
        val vars =
                (corpo.vars.map { v -> Pair(v.nome, corpo) }).toMap()
        val dprocs = duplicadas(procs.map { p -> p.nome })
        for(proc in dprocs) {
            erros.add("procedimento $proc declarado mais de uma vez")
        }
        val procs =
                (procs.map { p -> Pair(p.nome, p) }).toMap()
        // Segunda passada
        for(proc in this.procs) {
            val pvars = vars.plus(
                    proc.params.map{d -> Pair(d.nome, proc.corpo)}).plus(Pair(proc.nome, proc.corpo))
            escopo(proc.corpo, classes, procs, pvars, erros)
        }
        for(classe in classes.values) {
            escopo(classe, classes, procs, vars, erros)
        }
        for(cmd in corpo.cmds)
            escopo(cmd, classes, procs, vars, erros)
        return erros
    }

    fun tipos(erros: MutableList<String>): List<String> {
        val procs =
                (procs.map { p -> Pair(p.nome, p) }).toMap()
        val classes = classes.map{ cls -> Pair(cls.nome, cls) }.toMap()
        val vars = tipo(corpo, classes, procs, emptyMap(), erros)
        for(proc in this.procs) {
            val pvars = vars.plus(
                    proc.params.map{ d -> Pair(d.nome, d.tipo) }).plus(Pair(proc.nome, proc.tret))
            tipo(proc.corpo, classes, procs, pvars, erros)
        }
        for(classe in this.classes) {
            tipo(classe, classes, procs, vars, erros)
        }
        return erros
    }
}

data class Classe(val nome: String, var sup: String?,
                  val campos: List<Decl>, val metodos: List<Proc>,
                  val lin: Int) {
    var tabmetodos: Map<String, Proc>? = null
    var todosmetodos: List<Proc>? = null
    var todoscampos: List<Decl>? = null
}


data class Bloco(val vars: List<Decl>,
                 val cmds: MutableList<Cmd>, val lin: Int) {
    fun add(cmd: Cmd) {
        cmds.add(cmd)
    }
}

data class Decl(val nome: String, val tipo: String)

data class Proc(val nome: String, val params: List<Decl>,
                val tret: String, val corpo: Bloco, val lin: Int)

data class Chamada(val nome: String, val args: List<Exp>, val lin: Int):
        Cmd, Exp {
    var proc: Proc? = null
    override var tipo: String? = null
}

data class ChamadaMetodo(val rec: Exp, val nome: String,
                         val args: List<Exp>, val lin: Int):
        Cmd, Exp {
    override var tipo: String? = null
}

data class Cons(val cls: String, val args: List<Exp>, val lin: Int): Exp {
    override var tipo: String? = cls
}

object Nil: Exp {
    override var tipo: String? = null
}

data class If(val cond: Exp, val th: Bloco, val els: Bloco, val lin: Int) : Cmd

data class Repeat(val corpo: Bloco, val cond: Exp,
                  val lin: Int): Cmd

data class Atrib(val lval: String, val rval: Exp,
                 val lin: Int): Cmd {
    var escopo: Bloco? = null
}

data class Read(val lval: String, val lin: Int): Cmd {
    var escopo: Bloco? = null
}

data class Write(val exp: Exp, val lin: Int): Cmd

data class Menor(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Igual(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Soma(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Sub(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Mult(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Div(val e1: Exp, val e2: Exp, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Num(val num: String, val lin: Int): Exp {
    override var tipo: String? = null
}

data class Var(val nome: String, val lin: Int): Exp {
    var escopo: Bloco? = null
    override var tipo: String? = null
}

fun subtipo(t1: String, t2: String, classes: Map<String, Classe>): Boolean {
    if(t1 == t2) return true;
    else {
        val sup = classes.get(t1)?.sup
        if(sup != null) {
            if(sup == t2) return true;
            return subtipo(sup, t2, classes)
        } else return false;
    }
}

fun campos(cls: Classe, classes: Map<String, Classe>): List<Decl> {
    val sup = cls.sup
    if(sup != null) {
        val csup = classes.get(sup)
        if(csup != null)
            return cls.campos.plus(campos(csup, classes))
        else return cls.campos;
    } else return cls.campos;
}

fun metodos(cls: Classe, classes: Map<String, Classe>, erros: MutableList<String>): List<Proc> {
    if(cls.todosmetodos != null) return cls.todosmetodos!!
    val sup = cls.sup
    val dmetodos = duplicadas(cls.metodos.map { p -> p.nome })
    for(metodo in dmetodos) {
        erros.add("método $metodo declarado mais de uma vez na classe ${cls.nome}")
    }
    if(sup != null && classes.containsKey(sup)) {
        val smetodos = metodos(classes[sup]!!, classes, erros)
        val tabsmetodos = smetodos.map{ m -> Pair(m.nome, m) }.toMap()
        for(metodo in cls.metodos) {
            if(tabsmetodos.containsKey(metodo.nome)) {
                // redefinição
                val smetodo = tabsmetodos[metodo.nome]!!
                if(!subtipo(metodo.tret, smetodo.tret, classes)) {
                    erros.add("tipo de retorno não bate na redefinição do método ${metodo.nome} na classe ${cls.nome}")
                }
                if(smetodo.params.size != metodo.params.size) {
                    erros.add("número de parâmetros não bate na redefinição do método ${metodo.nome} na classe ${cls.nome}")
                } else {
                    for(i in 0..(smetodo.params.size-1)) {
                        if(!subtipo(smetodo.params[i].tipo, metodo.params[i].tipo, classes)) {
                            erros.add("tipo do $i-ésimo parâmetro não bate na redefinição do método ${metodo.nome} na classe ${cls.nome}")
                        }
                    }
                }
            }
        }
        val tabmetodos = cls.metodos.map{ m -> Pair(m.nome, m) }.toMap()
        val smetodosredef = smetodos.map{ m ->
            if(tabmetodos.containsKey(m.nome))
                tabmetodos[m.nome]!!
            else
                m
        }
        cls.todosmetodos = smetodosredef + cls.metodos.filterNot{
            m -> tabsmetodos.containsKey(m.nome)
        }
    } else {
        cls.todosmetodos = cls.metodos.toSet().toList()
    }
    return cls.todosmetodos!!
}


fun escopo(no: Any, classes: Map<String, Classe>,
           procs: Map<String, Proc>, vars: Map<String, Bloco>, erros: MutableList<String>): Map<String, Bloco> {
    when(no) {
        is Var -> {
            if(vars.containsKey(no.nome)) {
                no.escopo = vars.get(no.nome)
            } else {
                erros.add("variável ${no.nome} não definida na linha ${no.lin}")
            }
        }
        is Soma -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Sub -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Mult -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Div -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Menor -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Igual -> {
            escopo(no.e1, classes, procs, vars, erros)
            escopo(no.e2, classes, procs, vars, erros)
        }
        is Num -> {}
        is If -> {
            escopo(no.cond, classes, procs, vars, erros)
            escopo(no.th, classes, procs, vars, erros)
            escopo(no.els, classes, procs, vars, erros)
        }
        is Atrib -> {
            if(vars.containsKey(no.lval)) {
                no.escopo = vars.get(no.lval)
            } else {
                erros.add("variável ${no.lval} não definida na linha ${no.lin}")
            }
            escopo(no.rval, classes, procs, vars, erros)
        }
        is Read -> {
            if (vars.containsKey(no.lval)) {
                no.escopo = vars.get(no.lval)
            } else {
                erros.add("variável ${no.lval} não definida na linha ${no.lin}")
            }
        }
        is Chamada -> {
            if (procs.containsKey(no.nome)) {
                no.proc = procs.get(no.nome)
            } else {
                erros.add("chamada a procedimento ${no.nome} não definido na linha ${no.lin}")
            }
        }
        is Write -> escopo(no.exp, classes, procs, vars, erros)
        is Repeat -> {
            val tabcorpo = escopo(no.corpo, classes, procs, vars, erros)
            escopo(no.cond, classes, procs, tabcorpo, erros)
        }
        is Bloco -> {
            val vset = mutableSetOf<String>()
            for(v in no.vars) {
                if(vset.contains(v.nome)) {
                    erros.add("variável $v duplicada na linha ${no.lin}")
                } else vset.add(v.nome)
            }
            val tabbloco =
                    vars.plus(vset.map { v -> Pair(v, no) })
            for(cmd in no.cmds) {
                escopo(cmd, classes, procs, tabbloco, erros)
            }
            return tabbloco
        }
        is ChamadaMetodo -> {
            escopo(no.rec, classes, procs, vars, erros)
            for(arg in no.args)
                escopo(arg, classes, procs, vars, erros)
        }
        is Cons -> {
            if(!classes.containsKey(no.cls)) {
                erros.add("instanciação de classe ${no.cls} não definida na linha ${no.lin}")
            }
            for(arg in no.args)
                escopo(arg, classes, procs, vars, erros)
        }
        is Classe -> {
            val sup = no.sup
            if(sup != null) {
                if(!classes.containsKey(sup)) {
                    erros.add("supertipo ${sup} não existe na classe ${no.nome} definida na linha ${no.lin}")
                    no.sup = null
                } else if(subtipo(sup, no.nome, classes)) {
                    erros.add("supertipo ${sup} gera um ciclo na classe ${no.nome} definida na linha ${no.lin}")
                    no.sup = null
                }
            }
            val campos = campos(no, classes)
            no.todoscampos = campos.toSet().toList()
            val dcampos = duplicadas(campos.map { c -> c.nome })
            for(campo in dcampos) {
                erros.add("campo $campo redeclarado na classe ${no.nome}")
            }
            val cbloco = Bloco(campos, ArrayList<Cmd>(), no.lin)
            no.tabmetodos =
                    (metodos(no, classes, erros).map { p -> Pair(p.nome, p) }).toMap()
            for(metodo in no.tabmetodos!!.values) {
                val pvars = vars.plus(
                        campos.map{ c -> Pair(c.nome, cbloco) }).plus(metodo.params.map{d -> Pair(d.nome, metodo.corpo)}).plus(Pair(metodo.nome, metodo.corpo))
                escopo(metodo.corpo, classes, procs + no.tabmetodos!!, pvars, erros)
            }
        }
    }
    return vars
}

fun arith(e1: Exp, e2: Exp, classes: Map<String, Classe>, procs: Map<String, Proc>,
          vars: Map<String, String>, erros: MutableList<String>, lin: Int):
        String {
    tipo(e1, classes, procs, vars, erros)
    tipo(e2, classes, procs, vars, erros)
    if (e1.tipo == "int" && e2.tipo == "int") {
        return "int"
    } else if (e1.tipo == "int" && e2.tipo == "real") {
        return "real"
    } else if (e1.tipo == "real" && e2.tipo == "int") {
        return "real"
    } else if (e1.tipo == "real" && e2.tipo == "real") {
        return "real"
    } else {
        if(e1.tipo != "int" && e1.tipo != "real")
            erros.add("lado esquerdo de operação aritmética não é número mas ${e1.tipo} na linha $lin")
        if(e2.tipo != "int" && e2.tipo != "real")
            erros.add("lado direito de operação aritmética não é número mas ${e2.tipo} na linha $lin")
        return "int"
    }
}

fun tipo(no: Any, classes: Map<String, Classe>,
         procs: Map<String, Proc>, vars: Map<String, String>, erros: MutableList<String>):
        Map<String, String> {
    when (no) {
        is Soma -> no.tipo = arith(no.e1, no.e2, classes, procs, vars, erros, no.lin)
        is Sub -> no.tipo = arith(no.e1, no.e2, classes, procs, vars, erros, no.lin)
        is Mult -> no.tipo = arith(no.e1, no.e2, classes, procs, vars, erros, no.lin)
        is Div -> no.tipo =  arith(no.e1, no.e2, classes, procs, vars, erros, no.lin)
        is Menor -> {
            tipo(no.e1, classes, procs, vars, erros)
            tipo(no.e2, classes, procs, vars, erros)
            if(no.e1.tipo != "int" && no.e1.tipo != "real")
                erros.add("lado esquerdo de comparação não é número mas ${no.e1.tipo} na linha ${no.lin}")
            if(no.e2.tipo != "int" && no.e2.tipo != "real")
                erros.add("lado direito de comparação não é número mas ${no.e2.tipo} na linha ${no.lin}")
            no.tipo = "bool"
        }
        is Igual -> {
            tipo(no.e1, classes, procs, vars, erros)
            tipo(no.e2, classes, procs, vars, erros)
            val te1: String = no.e1.tipo!!
            val te2: String = no.e2.tipo!!
            if(te1 != te2 &&
                    (te1 != "int" || te2 != "real") &&
                    (te1 != "real" || te2 != "int")) {
                erros.add("tipos incompatíveis na igualdade da linha ${no.lin}, lado esquerdo é $te1 e lado direito é $te2")
            }
            no.tipo = "bool"
        }
        is Num -> no.tipo = "int"
        is Var -> no.tipo = vars.get(no.nome)
        is If -> {
            tipo(no.cond, classes, procs, vars, erros)
            if(no.cond.tipo != "bool")
                erros.add("condição do if na linha ${no.lin} não é booleana mas ${no.cond.tipo}")
            tipo(no.th, classes, procs, vars, erros)
            tipo(no.els, classes, procs, vars, erros)
        }
        is Bloco -> {
            val tabbloco =
                    vars.plus(no.vars.map{d -> Pair(d.nome, d.tipo)})
            for(cmd in no.cmds) {
                tipo(cmd, classes, procs, tabbloco, erros)
            }
            return tabbloco
        }
        is Repeat -> {
            val tabcorpo = tipo(no.corpo, classes, procs, vars, erros)
            tipo(no.cond, classes, procs, tabcorpo, erros)
            if(no.cond.tipo != "bool")
                erros.add("condição do repeat na linha ${no.lin} não é booleana mas ${no.cond.tipo}")
        }
        is Write -> tipo(no.exp, classes, procs, vars, erros)
        is Read -> {
            val tvar = vars.get(no.lval)
            if(tvar != "int" && tvar != "real")
                erros.add("variável ${no.lval} no read da linha ${no.lin} não é numérica mas ${tvar}")
        }
        is Chamada -> {
            val proc = procs.getValue(no.nome)
            no.args.forEach {
                arg -> tipo(arg, classes, procs, vars, erros)
            }
            val targs = no.args.map{ arg -> arg.tipo }
            if(targs.size != proc.params.size)
                erros.add("número de parâmetros na chamada da linha ${no.lin} não bate com número de argumentos")
            (0..(Math.min(targs.size, proc.params.size)-1)).forEach{
                i -> if(!subtipo(targs[i]!!, proc.params[i].tipo, classes) &&
                        (proc.params[i].tipo != "real" ||
                                targs[i] != "int"))
                    erros.add("tipos incompatíveis no ${i}-ésimo argumento da chamada de procedimento da linha ${no.lin}, parâmetro é ${proc.params[i].tipo} e argumento é ${targs[i]}")
            }
            no.tipo = proc.tret
        }
        is Atrib -> {
            val tlval = vars.get(no.lval)!!
            tipo(no.rval, classes, procs, vars, erros)
            val trval = no.rval.tipo!!
            if(!subtipo(trval, tlval, classes) &&
                    (tlval != "real" || trval != "int")) {
                erros.add("tipos incompatíveis na atribuição da linha ${no.lin}, lado esquerdo é $tlval e lado direito é $trval")
            }
        }
        is ChamadaMetodo -> {
            tipo(no.rec, classes, procs, vars, erros)
            no.tipo = "int"
            for (arg in no.args)
                tipo(arg, classes, procs, vars, erros)
            if(no.rec.tipo in setOf("int", "real", "bool")) {
                erros.add("receiver da chamada do método ${no.nome} na linha ${no.lin} tem tipo primitivo ${no.rec.tipo}")
            } else {
                val cls = classes[no.rec.tipo]
                if (cls != null) {
                    val metodo =
                            cls.todosmetodos?.find{ m -> m.nome == no.nome }
                    if(metodo != null) {
                        val targs = no.args.map{ arg -> arg.tipo }
                        if(targs.size != metodo.params.size)
                            erros.add("número de parâmetros na chamada da linha ${no.lin} não bate com número de argumentos")
                        (0..(Math.min(targs.size, metodo.params.size)-1)).forEach{
                            i -> if(!subtipo(targs[i]!!, metodo.params[i].tipo, classes) &&
                                (metodo.params[i].tipo != "real" ||
                                        targs[i] != "int"))
                            erros.add("tipos incompatíveis no ${i}-ésimo argumento da chamada de método da linha ${no.lin}, parâmetro é ${metodo.params[i].tipo} e argumento é ${targs[i]}")
                        }
                        no.tipo = metodo.tret
                    } else {
                        erros.add("método não existe na classe ${no.rec.tipo} na chamada do método ${no.nome} na linha ${no.lin}")
                    }
                }
            }
        }
        is Cons -> {
            val cls = classes[no.cls]
            if(cls != null) {
                if(no.args.size != cls.todoscampos!!.size) {
                    erros.add("número de argumentos não bate com número de campos na instanciação da classe ${no.cls} na linha ${no.lin}")
                } else {
                    for (i in 1..(no.args.size - 1)) {
                        val arg = no.args[i]
                        val campo = cls.todoscampos!![i]
                        tipo(arg, classes, procs, vars, erros)
                        if (arg.tipo != campo.tipo &&
                                (arg.tipo != "int" || campo.tipo != "real")) {
                            erros.add("tipo ${arg.tipo} do $i-ésimo argumento para o construtor incompatível com tipo ${campo.tipo} do campo ${campo.nome} da classe ${no.cls}")
                        }
                    }
                }
                no.tipo = no.cls
            }
        }
        is Classe -> {
            for(metodo in no.todosmetodos!!) {
                val pvars = vars.plus(
                        no.todoscampos!!.map{ c -> Pair(c.nome, c.tipo) }).plus(metodo.params.map{d -> Pair(d.nome, d.tipo)}).plus(Pair(metodo.nome, metodo.tret))
                tipo(metodo.corpo, classes, procs + no.tabmetodos!!, pvars, erros)
            }
        }
    }
    return vars
}