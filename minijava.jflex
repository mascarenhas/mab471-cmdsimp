/* 
* A primeira seção da especificação vai até o primeiro %%,
* e consiste de código Java que é copiado ao pé da letra
*
*/
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

%%

/*
* A segunda seção vai até o próximo %%, e são diversos parâmetros
* de configuração, além de código Java copiado para o corpo da
* classe do analisador léxico
*
*/

%class Scanner          // nome da classe do analisador
%public                 // classe deve ser pública
%line                   // guarde número da linha em yyline
%column                 // guarde número da coluna em yycolumn
%function nextToken     // nome do método que vai fornecer um token
%type Token             // classe usado para tokens

// Código Java entre %{ e %} é copiado pro corpo da classe
// do analisador
%{ 

	public Scanner() { }

	public void input(String input) {
	    // inicializa entrada pro analisador
		yyreset(new StringReader(input));
	}
	
	public List<Token> tokens() throws IOException {
		List<Token> tokens = new ArrayList<Token>();
		Token tok = nextToken();
		while(tok.getTipo() != Token.EOF) {
			tokens.add(tok);
			tok = nextToken();
		}
		tokens.add(tok);
		return tokens;
	}

%}

%%

/*
* A última seção contém as regras léxicas, cada regra é um
* par com uma expressão regular e um trecho de código Java
* entre { e }.
*
*/

// Espaços são ignorados
[ \r\n\t\f]    { }

// Exemplo de regra
"boolean"      { return new Token(Token.BOOLEAN, yytext(), yyline, yycolumn); }

// Identificadores e numerais devem ser retornados com
// return new Token(Token.ID, yytext(), yyline, yycolumn)
// e return new Token(Token.NUM, yytext(), yyline, yycolumn)

// Regra para EOF
<<EOF>>      { return new Token(Token.EOF, "<<EOF>>", yyline, yycolumn); }

// Erros léxicos 
.            { throw new RuntimeException("erro léxico, linha: " + 
               (yyline+1) + ", coluna : " + (yycolumn+1) + ", char: " + 
               yytext()); }

