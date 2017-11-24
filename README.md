
Análise Semântica de MiniJava
=============================

O segundo trabalho é completar o analisador de escopo e tipos para
a linguagem MiniJava (http://www.dcc.ufrj.br/~fabiom/comp/minijava.html).
Essa pasta contém o esqueleto do analisador, na função `tipo` do arquivo
`ast.kt`

As regras de escopo e tipos de MiniJava seguem as de Java, dadas
as simplificações que foram feitas para obter a gramática de MiniJava.

As partes que estão faltando correspondem à tipagem de 
diversos nós da árvore sintática abstrata. Todas as partes estão marcadas
com um comentário "TODO".

Caso o programa esteja correto a análise não produz nenhuma saída,
caso ele tenha erros de tipo ele imprime os
erros na saída padrão de erros. Use a função `check` em `testchecker.kt`
para rodar a análise em algum arquivo fonte MiniJava.

