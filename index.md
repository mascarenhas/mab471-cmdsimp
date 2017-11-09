---
layout: default
title: MAB 471 - Compiladores I
relpath: ..
---

MAB 471 - Compiladores I
------------------------

### Apresentação

Está é a página da disciplina Compiladores I, MAB 471, do professor
Fabio Mascarenhas, para o semestre de *2017.2*. As aulas da disciplina são
às segundas e quartas, das 10 às 12 horas, na sala 11 do bloco F2 do CCMN.

### Avaliação

A avaliação será feita por provas e por pequenos trabalhos práticos. A
nota das provas corresponderá a 80% da nota final (8 pontos) e a dos
trabalhos a 20% (2 pontos). Serão três provas, uma na metade do período
e as outras duas no final, e será feita uma média aritmética das duas
maiores notas. Não haverá prova final ou segunda chamada. A média
final é 5,0. 

### Datas das Provas

P1: **27/09/2017**

P2: 22/11/2017

P3: 29/11/2017

Todas as provas serão feitas no mesmo horário e local das aulas.

### Trabalhos Práticos

Os trabalhos práticos correspondem às diferentes fases de um
compilador de [MiniJava](minijava.html). Os trabalhos podem ser feitos
individualmente ou em dupla. As mesmas duplas valerão para todos
os quatro trabalhos, exceto em casos de trancamento ou abandono, que serão
resolvidos caso a caso.


#### Analisador Léxico e Sintático

Cada dupla deverá fazer a especificação dos analisadores léxico e sintático para
a linguagem [MiniJava](minijava.html). Clone ou baixe o esqueleto do projeto 
para o trabalho [aqui](https://github.com/mascarenhas/mab471-lecnotes/tree/minijavaparse),
e leia com atenção o arquivos `README.md`. O projeto
já inclui cópias do JFlex e do JACC, com um arquivos .bat para executá-los.

A entrega do trabalho deverá ser feita até o dia 13/11/2017, usando [esse
formulário](https://www.dropbox.com/request/2QdTZKHpFuj6o9sAtZRa). Mande apenas
um arquivo `.zip` contendo três arquivos: o arquivo `.jflex` com a especificação
léxica, o arquivo `.jacc` contendo a especificação sintática, e um arquivo
`README.txt` contendo os nomes dos alunos e qualquer explicação que vocês
queiram acrescentar. O arquivo `.zip` deve ter os nomes da dupla no nome do arquivo
(por exemplo,
se o trabalho foi feito pelo João e pela Maria, o arquivo anexado deve ser "minijava_joao_maria.zip").

Se tiver qualquer dúvida sobre a especificação da linguagem ou o
funcionamento dos analisadores é só perguntar por email ou no
nosso grupo.

### Lista de Discussão

Temos um grupo no Facebook para perguntas e avisos sobre a matéria.
Acessem [aqui](http://www.facebook.com/groups/compiladoresI/).

### Livros

O livro texto da disciplina é o "Construindo Compiladores", de Keith D.
Cooper e Linda Torczon, da Editora Elsevier. O título de sua versão
em inglês é "Engineering a Compiler". Ele não está disponível nas
bibliotecas da UFRJ, então temos um livro texto alternativo, o
"Compiladores: princípios e práticas", de Kenneth C. Louden, que
está disponível na biblioteca do CCMN.

Um bom livro que explica a construção de um compilador usando Java é o
"Modern Compiler Implementation in Java", de Appel e Palsberg. É um
bastante sintético, mas que também vai além do assunto coberto no curso.

"Crafting a Compiler with C" de Charles Fischer também tem uma boa
cobertura dos aspectos práticos da construção de um compilador, e está
disponível na biblioteca do CT e do NCE.

Existe farto material online sobre construção de compiladores, incluindo
livros completos. Um bem sintético e com ênfase em construção manual de
scanners e parsers recursivos é o livro "Compiler Construction" de
Niklaus Wirth, disponível [em PDF
aqui](http://www.ethoberon.ethz.ch/WirthPubl/CBEAll.pdf). Outro livro,
mais detalhista, é o "Basics of Compiler Design" de Torben Mogensen,
disponível [nessa
página](http://www.diku.dk/hjemmesider/ansatte/torbenm/Basics/).

Se conhecer algum outro livro e/ou material e quiser saber quanto à sua
aplicabilidade venha conversar comigo, poderei ajudá-lo.

### Notas de Aula

Os slides das aulas estão no branch *master* do repositório da disciplina
no [Github](https://github.com/mascarenhas/mab471-lecnotes/).
O código fonte de cada aula está em seu próprio branch, esses branches estão
citados abaixo. 

Todo
o código fonte está em projetos do IntelliJ IDEA, baixe a Community Edition
do IDEA [nesse site](https://www.jetbrains.com/idea/download/). A maior
parte dos fontes estará na linguagem [Kotlin](https://kotlinlang.org/).

Você pode baixar um
`.zip` contendo todos os fontes e importar esse projeto no IDEA, ou clonar 
o projeto diretamente de dentro do IDEA [seguindo essas instruções](https://www.jetbrains.com/help/idea/2017.2/using-git-integration.html#clone-repo).


#### 02/08 - [compilador de comandos simples](https://github.com/mascarenhas/mab471-lecnotes/tree/cmdsimp)

#### 07/08 - [explorador de expressões regulares](https://github.com/mascarenhas/mab471-lecnotes/tree/re), [compilador de comandos simples com expressões regulares](https://github.com/mascarenhas/mab471-lecnotes/tree/cmdsimpre)

#### 09/08 - [explorador de autômatos](https://github.com/mascarenhas/mab471-lecnotes/tree/automata), [compilador de comandos simples com scanner de autômato](https://github.com/mascarenhas/mab471-lecnotes/tree/cmdsimpaut)

#### 14/08 - [compilador de comandos simples com scanner JFlex](https://github.com/mascarenhas/mab471-lecnotes/tree/cmdsimpjf)

#### 16/08 - [explorador de gramáticas](https://github.com/mascarenhas/mab471-lecnotes/tree/4389a0db6d464ec587b1cdd30e822e37d584cbe5)

#### 21/08 - [explorador de gramáticas](https://github.com/mascarenhas/mab471-lecnotes/tree/grammar)

#### 28/08 - [gramáticas com expressões de parsing](https://github.com/mascarenhas/mab471-lecnotes/tree/pecfg), [analisador recursivo com retrocesso para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyrec)

#### 30/08 - [analisador recursivo *scannerless* para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinypeg)

#### 04/09 - [analisador recursivo preditivo para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinypred)

#### 06/09 - [explorador de gramáticas com cálculo dos conjuntos LL(1)](https://github.com/mascarenhas/mab471-lecnotes/commit/aaa6fd1a51a459a15640751614a3b4ced848b5de)

#### 11/09 - [explorador de gramáticas com parser LL(1) de tabela](https://github.com/mascarenhas/mab471-lecnotes/tree/grammar), [analisador LL(1) de tabela para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyll1)

#### 13/09 - [explorador de gramáticas com analisador shift-reduce](https://github.com/mascarenhas/mab471-lecnotes/tree/shiftreduce)

#### 25/09 - [revisão da primeira lista de exercícios, para a P1](RevisaoP1.pdf)

#### 09/10 - [analisador SLR para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyslr)

#### 11/10 - [analisador JACC para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyjacc)

#### 16/10 - [TINY com AST](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyast), [análise de escopo para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyescopovar)

#### 18/10 - [análise de escopo para TINY com procedimentos](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyescopoproc)

#### 30/10 - [análise de tipos para TINY](https://github.com/mascarenhas/mab471-lecnotes/tree/tinytipos)

#### 01/11 - [análise de tipos para TINY com procedimentos](https://github.com/mascarenhas/mab471-lecnotes/tree/tinytiposproc)

#### 06/11 - [análise de escopo para TINY com classes](https://github.com/mascarenhas/mab471-lecnotes/tree/tinyclasses)

Listas de Exercício
-------------------


#### 06/09 - [Primeira Lista](lista1.html), cobre o assunto da P1

Provas
------


#### 27/09 - [P1](p1.pdf) e [gabarito](GabaritoP1.pdf)

### Contato

Podem entrar em contato pelo meu [email](mailto:fabiom@dcc.ufrj.br) que
responderei assim que possível. Também tenho um horário de atendimento
de alunos na minha sala, segundas e quartas de 13 às 14 horas. A sala é
a E-2013 do DCC.

* * * * *

Última Atualização: {{ site.time | date: "%Y-%m-%d %H:%M" }}
