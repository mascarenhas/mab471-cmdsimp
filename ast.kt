
import java.util.ArrayList

interface Exp
interface Cmd

data class Prog(val main: String, val args: String, val cmd: Cmd,
                val classes: List<Classe>) {
    override fun toString(): String {
        var res = "class " + main + " {\n  public static void main(String[] " + args +
                ") {\n" + cmd + "\n  }\n}\n"
        for (classe in classes)
            res += classe.toString() + "\n"
        return res
    }
}

data class Soma(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 + $e2)"
    }
}

data class Sub(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 - $e2)"
    }
}

data class Div(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 / $e2)"
    }
}

data class Mult(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 * $e2)"
    }
}

data class Menor(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 < $e2)"
    }
}

data class Igual(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 == $e2)"
    }
}

data class Dif(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 != $e2)"
    }
}

data class ELog(val e1: Exp, val e2: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "($e1 && $e2)"
    }
}

data class Neg(val e: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "(-$e)"
    }
}

data class Nao(val e: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "(!$e)"
    }
}

data class Id(val nome: String, val lin: Int) : Exp {
    override fun toString(): String {
        return nome
    }
}

data class Indexa(val vet: Exp, val ind: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return vet.toString() + "[" + ind + "]"
    }

}

data class If(val cond: Exp, val cthen: Cmd, val celse: Cmd?, val lin: Int) : Cmd {
    override fun toString(): String {
        return "if(" + cond + ") " + cthen +
                if (celse == null) "" else " else " + celse
    }
}

data class Length(val exp: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return exp.toString() + ".length"
    }
}

data class Classe(val nome: String, var pai: String = "Object", val campos: List<Var>,
                  val metodos: List<Metodo>, val lin: Int = 0) {
    var ncampos: MutableList<String> = ArrayList()
    var tcampos: MutableList<String> = ArrayList()

    var nmetodos: MutableList<String> = ArrayList()
    var pmetodos: MutableList<Metodo> = ArrayList()

    override fun toString(): String {
        var res = "class $nome extends $pai{\n"
        for (campo in campos) {
            res += campo.toString() + ";\n"
        }
        for (metodo in metodos) {
            res += metodo.toString() + "\n"
        }
        res += "}"
        return res
    }
}

data class Var(val tipo: String, val nome: String, val lin: Int) {
    override fun toString(): String {
        return tipo + " " + nome
    }
}

data class Vetor(val tam: Exp, val lin: Int) : Exp {
    override fun toString(): String {
        return "new int[$tam]"
    }
}

data class While(val cond: Exp, val corpo: Cmd, val lin: Int) : Cmd {
    override fun toString(): String {
        return "while($cond) $corpo"
    }
}

data class Atrib(val nome: String, val exp: Exp, val lin: Int) : Cmd {
    override fun toString(): String {
        return "$nome = $exp;"
    }
}

data class AtribVetor(val nome: String, val ind: Exp, val rval: Exp, val lin: Int) : Cmd {
    override fun toString(): String {
        return "$nome[$ind] = $rval;"
    }
}

data class Bloco(val cmds: List<Cmd>) : Cmd {
    override fun toString(): String {
        var res = "{\n "
        for (cmd in cmds) {
            res += cmd.toString() + "\n"
        }
        res += "}"
        return res
    }
}

data class Campo(val obj: Exp, val nome: String, val lin: Int) : Exp {
    override fun toString(): String {
        return obj.toString() + "." + nome
    }
}

data class Chamada(val obj: Exp, val nome: String, val args: List<Exp>,
                   val lin: Int) : Exp {
    override fun toString(): String {
        var res = obj.toString() + "." + nome + "("
        if (!args.isEmpty())
            res += args[0]
        for (i in 1 until args.size)
            res += ", " + args[i]
        res += ")"
        return res
    }
}

data class Metodo(val tret: String, val nome: String, val params: List<Var>,
                  val vars: List<Var>, val cmds: List<Cmd>, val ret: Exp, val lin: Int) {
    override fun toString(): String {
        var res = "public $tret $nome("
        if (!params.isEmpty())
            res += params[0]
        for (i in 1 until params.size)
            res += ", " + params[i]
        res += ") {\n"
        for (`var` in vars)
            res += `var`.toString() + ";\n"
        for (cmd in cmds)
            res += cmd.toString() + "\n"
        res += "return $ret;\n}"
        return res
    }
}

data class Println(val exp: Exp, val lin: Int) : Cmd {
    override fun toString(): String {
        return "System.out.println($exp);"
    }
}

data class New(val classe: String, val lin: Int) : Exp {
    override fun toString(): String {
        return "new $classe()"
    }
}

class Num(val value: String) : Exp {
    override fun toString(): String {
        return value
    }
}

object False : Exp {
    override fun toString(): String {
        return "false"
    }
}

object Null : Exp {
    override fun toString(): String {
        return "null"
    }
}

object This : Exp {
    override fun toString(): String {
        return "this"
    }
}

object True : Exp {
    override fun toString(): String {
        return "true"
    }
}

val classes: MutableMap<String, Classe> = mutableMapOf()
val supertypes: MutableMap<String, String> = mutableMapOf()
var nomeCiclo: String? = null

fun subtype(t1: String, t2: String): Boolean {
    if (t1 == t2) return true // reflexivo
    if (t2 == "Object" && !(t1 == "int" || t1 == "int[]" || t1 == "boolean"))
        return true
    if (t1 == "null" && !(t2 == "int" || t2 == "int[]" || t2 == "boolean"))
        return true
    val supt1 = supertypes.get(t1)
    if (t2 == supt1) return true
    return if (supt1 == null) false else subtype(supt1, t2) // transitivo
}

fun tipo(no: Any, ctx: Map<String, String>, erros: MutableList<String>): String {
    when (no) {
        is Atrib -> {
            val texp = tipo(no.exp, ctx, erros)
            var tvar = ctx[no.nome]
            if (tvar == null) {
                erros.add("variável " + no.nome +
                        " na atribuição da linha " + no.lin +
                        " não declarada")
                tvar = "int"
            }
            if (!subtype(texp, tvar))
                erros.add("tipos na atribuição da linha " + no.lin + " incompatíveis, lado esquerdo é " + tvar + " e lado direito é " + texp)
        }
        is Bloco -> {
            for (c in no.cmds) {
                tipo(c, ctx, erros)
            }
        }
        is Div -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (tesq == "int" && tdir == "int") {
                return "int"
            }
            if (tesq != "int")
                erros.add("lado esquerdo da divisão na linha " + no.lin + " é " + tesq + " e não número")
            if (tdir != "int")
                erros.add("lado direito da divisão na linha " + no.lin + " é " + tdir + " e não número")
            return "int"
        }
        is If -> {
            val tcond = tipo(no.cond, ctx, erros)
            if (tcond != "boolean")
                erros.add("condição do if na linha " + no.lin + " é " + tcond + " e não booleana")
            tipo(no.cthen, ctx, erros)
            if(no.celse != null) tipo(no.celse, ctx, erros)
        }
        is Igual -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (subtype(tesq, tdir) || subtype(tdir, tesq)) {
                return "boolean"
            }
            erros.add("tipos na igualdade da linha " + no.lin + " incompatíveis, lado esquerdo é " + tesq + " e lado direito é " + tdir)
            return "boolean"
        }
        is Menor -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (tesq == "int" && tdir == "int") {
                return "boolean"
            }
            if (tesq != "int")
                erros.add("lado esquerdo da comparação na linha " + no.lin + " é " + tesq + " e não número")
            if (tdir != "int")
                erros.add("lado direito da comparação na linha " + no.lin + " é " + tdir + " e não número")
            return "boolean"
        }
        is Mult -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (tesq == "int" && tdir == "int") {
                return "int"
            }
            if (tesq != "int")
                erros.add("lado esquerdo da multiplicação na linha " + no.lin + " é " + tesq + " e não número")
            if (tdir != "int")
                erros.add("lado direito da multiplicação na linha " + no.lin + " é " + tdir + " e não número")
            return "int"
        }
        is Soma -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (tesq == "int" && tdir == "int") {
                return "int"
            }
            if (tesq != "int")
                erros.add("lado esquerdo da soma na linha " + no.lin + " é " + tesq + " e não número")
            if (tdir != "int")
                erros.add("lado direito da soma na linha " + no.lin + " é " + tdir + " e não número")
            return "int"
        }
        is Sub -> {
            val tesq = tipo(no.e1, ctx, erros)
            val tdir = tipo(no.e2, ctx, erros)
            if (tesq == "int" && tdir == "int") {
                return "int"
            }
            if (tesq != "int")
                erros.add("lado esquerdo da subtração na linha " + no.lin + " é " + tesq + " e não número")
            if (tdir != "int")
                erros.add("lado direito da subtração na linha " + no.lin + " é " + tdir + " e não número")
            return "int"
        }
        is Num -> return "int"
        is Println -> tipo(no.exp, ctx, erros)
        is Prog -> {
            for (cls in no.classes) {
                if (cls.nome == "Object" ||
                        cls.nome == no.main ||
                        classes.containsKey(cls.nome)) {
                    erros.add("classe " + cls.nome + " redeclarada na linha " + cls.lin)
                } else
                    classes.put(cls.nome, cls)
            }
            for (cls in classes.values) {
                nomeCiclo = cls.nome
                tipo(cls, emptyMap(), erros)
            }
            for (cls in classes.values) {
                supertypes.put(cls.nome, cls.pai)
            }
            nomeCiclo = null
            for (cls in classes.values) {
                tipo(cls, emptyMap(), erros)
            }
            tipo(no.cmd, emptyMap(), erros)
        }
        is Id -> {
            var tid = ctx[no.nome]
            if (tid == null) {
                erros.add("variável " + no.nome +
                        " usada na expressão da linha " + no.lin +
                        " não declarada")
                tid = "int"
            }
            return tid
        }
        is Metodo -> {
            val cmetodo: MutableMap<String, String> = mutableMapOf()
            ctx.toMap(cmetodo)
            for ((tipo, nome) in no.params) {
                if (!cmetodo.containsKey(nome)) {
                    cmetodo.put(nome, tipo)
                } else {
                    erros.add("parâmetro " + nome + " redeclarado na linha " + no.lin)
                }
            }
            for ((tipo, nome) in no.vars) {
                if (!cmetodo.containsKey(nome)) {
                    cmetodo.put(nome, tipo)
                } else {
                    erros.add("variável " + nome + " redeclarada na linha " + no.lin)
                }
            }
            for (cmd in no.cmds) {
                tipo(cmd, cmetodo, erros)
            }
            val tret = tipo(no.ret, cmetodo, erros)
            if (!subtype(tret, no.tret))
                erros.add("tipo da expressão de retorno " + tret +
                        " não bate com o tipo de retorno " + no.tret +
                        " declarado no método da linha " + no.lin)
        }
        is Chamada -> {
            val trexp = tipo(no.obj, ctx, erros)
            val cls = classes[trexp]
            if (cls == null) {
                erros.add("objeto da chamada de método " + no.nome + " tem tipo " + trexp + " que não existe ou não é classe na linha " + no.lin)
                for (arg in no.args) tipo(arg, ctx, erros)
                return "int"
            }
            val imetodo = cls.nmetodos.indexOf(no.nome)
            if (imetodo == -1) {
                erros.add("método " + no.nome + " não existe na classe " + trexp + " na linha " + no.lin)
                for (arg in no.args) tipo(arg, ctx, erros)
                return "int"
            }
            val proc = cls.pmetodos.get(imetodo)
            val tparams = arrayOfNulls<String>(proc.params.size)
            for (i in tparams.indices) {
                tparams[i] = proc.params.get(i).tipo
            }
            val targs = arrayOfNulls<String>(no.args.size)
            for (i in targs.indices) {
                targs[i] = tipo(no.args[i], ctx, erros)
            }
            if (tparams.size != targs.size) {
                erros.add("aridade da chamada na linha " + no.lin + " não bate com a do método " + no.nome + " da classe " + trexp)
            } else {
                for (i in tparams.indices) {
                    if (!subtype(targs[i]!!, tparams[i]!!)) {
                        erros.add("tipo " + targs[i] + " do argumento " +
                                i + " da chamada de método " + no.nome + " da classe " + trexp + " na linha " + no.lin + " não é compatível com o tipo " + tparams[i] + " do parâmetro")
                    }
                }
            }
            return proc.tret
        }
        is Null -> return "null"
        is New -> {
            if(no.classe != "Object" && classes[no.classe] == null) {
                erros.add("classe " + no.classe + " no construtor na linha " + no.lin + " não existe");
                return "Object";
            }
            return no.classe;
        }
        is Classe -> {
            if (nomeCiclo != null) {
                if (!no.ncampos.isEmpty()) return "void"
                if (no.pai != "Object") {
                    if (no.pai === nomeCiclo) {
                        erros.add("ciclo na hierarquia de classes entre " + no.nome + " e " + no.pai)
                        no.pai = "Object"
                    } else {
                        val csup = classes[no.pai]
                        if (csup == null) {
                            erros.add("superclasse " + no.pai + " da classe " + no.nome + " não existe na linha " + no.lin)
                        } else {
                            tipo(csup, ctx, erros)
                            no.ncampos.addAll(csup.ncampos)
                            no.tcampos.addAll(csup.tcampos)
                            no.nmetodos.addAll(csup.nmetodos)
                            no.pmetodos.addAll(csup.pmetodos)
                        }
                    }
                }
                for ((tipo, nome, lin) in no.campos) {
                    if (no.ncampos.indexOf(nome) != -1) {
                        erros.add("campo $nome redeclarado na linha $lin")
                    } else {
                        no.ncampos.add(nome)
                        no.tcampos.add(tipo)
                    }
                }
                val nmetodos = ArrayList<String>()
                val pmetodos = ArrayList<Metodo>()
                for (m in no.metodos) {
                    if (nmetodos.indexOf(m.nome) != -1) {
                        erros.add("método " + m.nome + " redeclarado na linha " + m.lin)
                    } else {
                        nmetodos.add(m.nome)
                        pmetodos.add(m)
                    }
                }
                for (i in nmetodos.indices) {
                    if (no.nmetodos.indexOf(nmetodos[i]) == -1) {
                        no.nmetodos.add(nmetodos[i])
                        no.pmetodos.add(pmetodos[i])
                    } else { // método existe em alguma superclasse, mantém índice
                        no.pmetodos[no.nmetodos.indexOf(nmetodos[i])] = pmetodos[i]
                    }
                }
            } else {
                var csup: Classe? = null
                if (!no.pai.equals("Object")) csup = classes[no.pai]
                for (metodo in no.metodos) {
                    if (no.pmetodos.indexOf(metodo) != -1 &&
                            csup != null && csup.nmetodos.indexOf(metodo.nome) != -1) {
                        // método redefinido
                        val (tret, _, params) = csup.pmetodos[csup.nmetodos.indexOf(metodo.nome)]
                        if (params.size != metodo.params.size) {
                            erros.add("tentando redefinir método " + metodo.nome + " na classe " + no.nome + " na linha " + metodo.lin + " com aridade diferente da original")
                        } else {
                            if (!subtype(metodo.tret, tret))
                                erros.add("redefinição do método " + metodo.nome + " na classe " + no.nome + " tem tipo de retorno " + metodo.tret + " incompatível com o tipo original " + tret)
                            for (i in metodo.params.indices) {
                                val told = params[i].tipo
                                val tnew = metodo.params[i].tipo
                                if (told != tnew)
                                // Regra de redefinição de Java
                                    erros.add("redefinição do método " + metodo.nome + " na classe " + no.nome + " tem o parâmetro " + i + " de tipo " + tnew + " incompatível com o tipo original " + told)
                            }
                        }
                    }
                }
                val mctx: MutableMap<String, String> = mutableMapOf()
                ctx.toMap(mctx)
                mctx.put("this", no.nome)
                for (i in 0 until no.ncampos.size) {
                    mctx.put(no.ncampos[i], no.tcampos[i])
                }
                for (m in no.metodos) {
                    if (no.pmetodos.indexOf(m) != -1)
                        tipo(m, mctx, erros)
                }
            }
        }
        is This -> {
            val tthis = ctx["this"]
            if (tthis == null) {
                erros.add("this usado fora de um método")
                return "Object"
            }
            return tthis
        }
        is False -> { // false
            // TODO: implemente esse caso
        }
        is True -> { // true
            // TODO: implemente esse caso
        }
        is Campo -> { // obj.campo
            // TODO: implemente esse caso
        }
        is Dif -> { // !=
            // TODO: implemente esse caso
        }
        is ELog -> { // &&
            // TODO: implemente esse caso
        }
        is Indexa -> { // v[i]
            // TODO: implemente esse caso
        }
        is Length -> { // v.length
            // TODO: implemente esse caso
        }
        is Nao -> { // !
            // TODO: implemente esse caso
        }
        is Neg -> { // -
            // TODO: implemente esse caso
        }
        is Vetor -> { // new int[e]
            // TODO: implemente esse caso
        }
        is AtribVetor -> { // v[i] = e
            // TODO: implemente esse caso
        }
        is While -> { // while(exp) cmd;
            // TODO: implemente esse caso
        }
    }
    return "void"
}

