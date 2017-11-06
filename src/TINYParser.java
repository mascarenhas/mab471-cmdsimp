// Output created by jacc on Wed Nov 01 10:53:59 BRST 2017


import java.util.List;
import java.util.ArrayList;

class TINYParser implements TINYTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (tipo
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 184;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case ';':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case ';':
                            yyn = 9;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case IF:
                            yyn = 12;
                            continue;
                        case READ:
                            yyn = 13;
                            continue;
                        case REPEAT:
                            yyn = 14;
                            continue;
                        case WRITE:
                            yyn = 15;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case ID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case ID:
                            yyn = 20;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case IF:
                            yyn = 12;
                            continue;
                        case READ:
                            yyn = 13;
                            continue;
                        case REPEAT:
                            yyn = 14;
                            continue;
                        case WRITE:
                            yyn = 15;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    switch (yytok) {
                        case ATRIB:
                            yyn = 24;
                            continue;
                        case '(':
                            yyn = 25;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case ID:
                            yyn = 30;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case '(':
                            yyn = 33;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case ',':
                            yyn = 34;
                            continue;
                        case ';':
                            yyn = 35;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case ',':
                            yyn = 36;
                            continue;
                        case ':':
                            yyn = 37;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case ':':
                        case ',':
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case ';':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                        case ')':
                            yyn = 41;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case UNTIL:
                            yyn = 51;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case ID:
                            yyn = 20;
                            continue;
                        case ')':
                            yyn = 53;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    switch (yytok) {
                        case ID:
                            yyn = 20;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case REPEAT:
                        case IF:
                        case READ:
                        case ID:
                        case WRITE:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case ID:
                            yyn = 55;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    switch (yytok) {
                        case BOOL:
                            yyn = 57;
                            continue;
                        case INT:
                            yyn = 58;
                            continue;
                        case REAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case ')':
                            yyn = 60;
                            continue;
                        case ',':
                            yyn = 61;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                        case ')':
                            yyn = 70;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case ',':
                            yyn = 34;
                            continue;
                        case ')':
                            yyn = 73;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case ':':
                        case ',':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr28();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case NUM:
                            yyn = 28;
                            continue;
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case ELSE:
                            yyn = 77;
                            continue;
                        case END:
                            yyn = 78;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ',':
                            yyn = 61;
                            continue;
                        case ')':
                            yyn = 79;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case END:
                            yyn = 82;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case BOOL:
                            yyn = 57;
                            continue;
                        case INT:
                            yyn = 58;
                            continue;
                        case REAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case END:
                            yyn = 85;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case BOOL:
                            yyn = 57;
                            continue;
                        case INT:
                            yyn = 58;
                            continue;
                        case REAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case ';':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case END:
                            yyn = 88;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case END:
                            yyn = 90;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case ENDINPUT:
                        case UNTIL:
                        case ';':
                        case ELSE:
                        case END:
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case ';':
                            yyn = 8;
                            continue;
                        case END:
                            yyn = 91;
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case ';':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case ';':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 187;
                    continue;

                case 184:
                    return true;
                case 185:
                    yyerror("stack overflow");
                case 186:
                    return false;
                case 187:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case PROCEDURE:
                return 6;
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys9() {
        switch (yytok) {
            case PROCEDURE:
                return 6;
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys14() {
        switch (yytok) {
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys26() {
        switch (yytok) {
            case THEN:
                return 42;
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
        }
        return 187;
    }

    private int yys27() {
        switch (yytok) {
            case '(':
                return 49;
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr37();
        }
        return 187;
    }

    private int yys28() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr36();
        }
        return 187;
    }

    private int yys32() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ENDINPUT:
            case UNTIL:
            case ';':
            case ELSE:
            case END:
                return yyr24();
        }
        return 187;
    }

    private int yys38() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ENDINPUT:
            case UNTIL:
            case ';':
            case ELSE:
            case END:
                return yyr26();
        }
        return 187;
    }

    private int yys39() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ',':
            case ')':
                return yyr41();
        }
        return 187;
    }

    private int yys42() {
        switch (yytok) {
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys50() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ')':
                return 71;
        }
        return 187;
    }

    private int yys53() {
        switch (yytok) {
            case VAR:
                return 7;
            case ':':
                return 75;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys57() {
        switch (yytok) {
            case VAR:
            case ';':
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case WRITE:
                return yyr12();
        }
        return 187;
    }

    private int yys58() {
        switch (yytok) {
            case VAR:
            case ';':
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case WRITE:
                return yyr10();
        }
        return 187;
    }

    private int yys59() {
        switch (yytok) {
            case VAR:
            case ';':
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case WRITE:
                return yyr11();
        }
        return 187;
    }

    private int yys63() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr34();
        }
        return 187;
    }

    private int yys64() {
        switch (yytok) {
            case '*':
                return 43;
            case '/':
                return 46;
            case '=':
            case UNTIL:
            case ';':
            case THEN:
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr31();
        }
        return 187;
    }

    private int yys65() {
        switch (yytok) {
            case '*':
                return 43;
            case '/':
                return 46;
            case '=':
            case UNTIL:
            case ';':
            case THEN:
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr32();
        }
        return 187;
    }

    private int yys66() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr33();
        }
        return 187;
    }

    private int yys67() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '=':
            case UNTIL:
            case ';':
            case THEN:
            case ELSE:
            case ',':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr29();
        }
        return 187;
    }

    private int yys68() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '=':
            case UNTIL:
            case ';':
            case THEN:
            case ELSE:
            case ',':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr30();
        }
        return 187;
    }

    private int yys70() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr38();
        }
        return 187;
    }

    private int yys71() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr35();
        }
        return 187;
    }

    private int yys72() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ENDINPUT:
            case UNTIL:
            case ';':
            case ELSE:
            case END:
                return yyr23();
        }
        return 187;
    }

    private int yys73() {
        switch (yytok) {
            case VAR:
                return 7;
            case ':':
                return 81;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys76() {
        switch (yytok) {
            case '*':
                return 43;
            case '+':
                return 44;
            case '-':
                return 45;
            case '/':
                return 46;
            case '<':
                return 47;
            case '=':
                return 48;
            case ',':
            case ')':
                return yyr40();
        }
        return 187;
    }

    private int yys77() {
        switch (yytok) {
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys79() {
        switch (yytok) {
            case '=':
            case UNTIL:
            case THEN:
            case '/':
            case ELSE:
            case '-':
            case ',':
            case '+':
            case '*':
            case ';':
            case '<':
            case ')':
            case ENDINPUT:
            case END:
                return yyr39();
        }
        return 187;
    }

    private int yys83() {
        switch (yytok) {
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yys86() {
        switch (yytok) {
            case VAR:
                return 7;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case WRITE:
                return yyr16();
        }
        return 187;
    }

    private int yyr1() { // s : procs ';' cmds
        { out = new Tiny(((List)yysv[yysp-3]), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // s : cmds
        { out = new Tiny(new ArrayList<Proc>(), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr19() { // cmds : cmds ';' cmd
        { ((Bloco)yysv[yysp-3]).add(((Cmd)yysv[yysp-1])); yyrv = ((Bloco)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypcmds();
    }

    private int yyr20() { // cmds : var cmd
        { ((Bloco)yysv[yysp-2]).add(((Cmd)yysv[yysp-1])); yyrv = ((Bloco)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypcmds();
    }

    private int yypcmds() {
        switch (yyst[yysp-1]) {
            case 83: return 87;
            case 77: return 84;
            case 73: return 80;
            case 53: return 74;
            case 42: return 62;
            case 14: return 31;
            case 9: return 22;
            case 0: return 2;
            default: return 89;
        }
    }

    private int yyr9() { // decl : ids ':' tipo
        { List<Decl> l = new ArrayList<Decl>(); for(String s: (List<String>)((List)yysv[yysp-3])) l.add(new Decl(s, ((String)yysv[yysp-1]))); yyrv = l; }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 34: return 54;
            default: return 17;
        }
    }

    private int yyr13() { // decls : decls ',' decl
        { ((List)yysv[yysp-3]).addAll(((List)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypdecls();
    }

    private int yyr14() { // decls : decl
        yysp -= 1;
        return yypdecls();
    }

    private int yypdecls() {
        switch (yyst[yysp-1]) {
            case 7: return 18;
            default: return 52;
        }
    }

    private int yyr29() { // exp : exp '<' exp
        { yyrv = new Menor(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr30() { // exp : exp '=' exp
        { yyrv = new Igual(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr31() { // exp : exp '+' exp
        { yyrv = new Soma(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr32() { // exp : exp '-' exp
        { yyrv = new Sub(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr33() { // exp : exp '/' exp
        { yyrv = new Div(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr34() { // exp : exp '*' exp
        { yyrv = new Mult(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr35() { // exp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr36() { // exp : NUM
        { yyrv = new Num(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr37() { // exp : ID
        { yyrv = new Var(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr38() { // exp : ID '(' ')'
        { yyrv = new Chamada(((Token)yysv[yysp-3]).getLexeme(),
        new ArrayList<Exp>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr39() { // exp : ID '(' exps ')'
        { yyrv = new Chamada(((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 61: return 76;
            case 51: return 72;
            case 48: return 68;
            case 47: return 67;
            case 46: return 66;
            case 45: return 65;
            case 44: return 64;
            case 43: return 63;
            case 29: return 50;
            case 24: return 38;
            case 15: return 32;
            case 12: return 26;
            default: return 39;
        }
    }

    private int yyr40() { // exps : exps ',' exp
        { ((List)yysv[yysp-3]).add(((Exp)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypexps();
    }

    private int yyr41() { // exps : exp
        { List<Exp> l = new ArrayList<Exp>();
               l.add(((Exp)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return yypexps();
    }

    private int yypexps() {
        switch (yyst[yysp-1]) {
            case 25: return 40;
            default: return 69;
        }
    }

    private int yyr17() { // ids : ids ',' ID
        { ((List)yysv[yysp-3]).add(((Token)yysv[yysp-1]).getLexeme()); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 19;
    }

    private int yyr18() { // ids : ID
        { List<String> l = new ArrayList<String>(); l.add(((Token)yysv[yysp-1]).getLexeme()); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 19;
    }

    private int yyr5() { // proc : PROCEDURE ID '(' ')' cmds END
        { yyrv = new Proc(((Token)yysv[yysp-5]).getLexeme(),
        new ArrayList<Decl>(), "void", ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-6]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return yypproc();
    }

    private int yyr6() { // proc : PROCEDURE ID '(' decls ')' cmds END
        { yyrv = new Proc(((Token)yysv[yysp-6]).getLexeme(),
        ((List)yysv[yysp-4]), "void", ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-7]).getLin()); }
        yysv[yysp-=7] = yyrv;
        return yypproc();
    }

    private int yyr7() { // proc : PROCEDURE ID '(' ')' ':' tipo cmds END
        { yyrv = new Proc(((Token)yysv[yysp-7]).getLexeme(),
        new ArrayList<Decl>(), ((String)yysv[yysp-3]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-8]).getLin()); }
        yysv[yysp-=8] = yyrv;
        return yypproc();
    }

    private int yyr8() { // proc : PROCEDURE ID '(' decls ')' ':' tipo cmds END
        { yyrv = new Proc(
        ((Token)yysv[yysp-8]).getLexeme(), ((List)yysv[yysp-6]), ((String)yysv[yysp-3]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-9]).getLin()); }
        yysv[yysp-=9] = yyrv;
        return yypproc();
    }

    private int yypproc() {
        switch (yyst[yysp-1]) {
            case 0: return 3;
            default: return 23;
        }
    }

    private int yyr3() { // procs : procs ';' proc
        { ((List)yysv[yysp-3]).add(((Proc)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr4() { // procs : proc
        { List<Proc> l = new ArrayList<Proc>();
               l.add(((Proc)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr21() { // cmd : IF exp THEN cmds END
        { yyrv = new If(((Exp)yysv[yysp-4]), ((Bloco)yysv[yysp-2]), new Bloco(new ArrayList<Decl>(), new ArrayList<Cmd>(), ((Token)yysv[yysp-3]).getLin()), ((Token)yysv[yysp-5]).getLin()); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr22() { // cmd : IF exp THEN cmds ELSE cmds END
        { yyrv = new If(((Exp)yysv[yysp-6]), ((Bloco)yysv[yysp-4]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-7]).getLin()); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yyr23() { // cmd : REPEAT cmds UNTIL exp
        { yyrv = new Repeat(((Bloco)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yyr24() { // cmd : WRITE exp
        { yyrv = new Write(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypcmd();
    }

    private int yyr25() { // cmd : READ ID
        { yyrv = new Read(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypcmd();
    }

    private int yyr26() { // cmd : ID ATRIB exp
        { yyrv = new Atrib(((Token)yysv[yysp-3]).getLexeme(), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr27() { // cmd : ID '(' ')'
        { yyrv = new Chamada(((Token)yysv[yysp-3]).getLexeme(),
        new ArrayList<Exp>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr28() { // cmd : ID '(' exps ')'
        { yyrv = new Chamada(((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yypcmd() {
        switch (yyst[yysp-1]) {
            case 5: return 10;
            default: return 21;
        }
    }

    private int yyr10() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr11() { // tipo : REAL
        { yyrv = "real"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr12() { // tipo : BOOL
        { yyrv = "bool"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyptipo() {
        switch (yyst[yysp-1]) {
            case 75: return 83;
            case 37: return 56;
            default: return 86;
        }
    }

    private int yyr15() { // var : VAR decls ';'
        { yyrv = new Bloco(((List)yysv[yysp-2]), new ArrayList<Cmd>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return 5;
    }

    private int yyr16() { // var : /* empty */
        { yyrv = new Bloco(new ArrayList<Decl>(), new ArrayList<Cmd>(), 0); }
        yysv[yysp-=0] = yyrv;
        return 5;
    }

    protected String[] yyerrmsgs = {
    };


TINYScanner scan;
int tipo;
Object node;

public Tiny out;

public TINYParser(TINYScanner scan) {
        this.scan = scan;
        token();
}

int token() {
        try {
                Token tok = scan.token();
                tipo = tok.getTipo();
                node = tok;
                return tipo;
        } catch(java.io.IOException ioex) {
                throw new RuntimeException(ioex);
        }
}

void yyerror(String err) {
        throw new RuntimeException(err + ": " + node.toString());
}


}
