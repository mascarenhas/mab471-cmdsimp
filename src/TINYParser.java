// Output created by jacc on Mon Nov 06 12:00:55 BRST 2017


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
                case 136:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 272;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case ';':
                            yyn = 11;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case ';':
                            yyn = 13;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ';':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys7();
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
                case 144:
                    switch (yytok) {
                        case ID:
                            yyn = 22;
                            continue;
                    }
                    yyn = 275;
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
                case 145:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 275;
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
                case 147:
                    yyn = yys11();
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
                case 148:
                    yyn = yys12();
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
                case 149:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case '.':
                            yyn = 34;
                            continue;
                    }
                    yyn = 275;
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
                case 152:
                    switch (yytok) {
                        case ATRIB:
                            yyn = 35;
                            continue;
                        case '(':
                            yyn = 36;
                            continue;
                        case '.':
                            yyn = yyr56();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 17:
                    yyst[yysp] = 17;
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
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case ID:
                            yyn = 44;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys19();
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
                case 156:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case SUBT:
                            yyn = 49;
                            continue;
                        case ';':
                        case END:
                        case VAR:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case '(':
                            yyn = 50;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                        case END:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ',':
                            yyn = 51;
                            continue;
                        case ';':
                            yyn = 52;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case ',':
                            yyn = 53;
                            continue;
                        case ':':
                            yyn = 54;
                            continue;
                    }
                    yyn = 275;
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
                case 163:
                    switch (yytok) {
                        case ':':
                        case ',':
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case ';':
                            yyn = 55;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case ';':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 275;
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
                case 170:
                    switch (yytok) {
                        case ID:
                            yyn = 56;
                            continue;
                    }
                    yyn = 275;
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
                case 171:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
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
                case 172:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case '.':
                            yyn = 68;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case ID:
                            yyn = 70;
                            continue;
                    }
                    yyn = 275;
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
                case 177:
                    yyn = yys41();
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
                case 178:
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
                case 179:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
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
                case 180:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case UNTIL:
                            yyn = 72;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case VAR:
                            yyn = 75;
                            continue;
                        case ';':
                        case END:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 275;
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
                case 185:
                    switch (yytok) {
                        case ID:
                            yyn = 76;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                        case ')':
                            yyn = 78;
                            continue;
                    }
                    yyn = 275;
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
                case 187:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    yyn = yys52();
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
                case 189:
                    switch (yytok) {
                        case ID:
                            yyn = 80;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case BOOL:
                            yyn = 82;
                            continue;
                        case ID:
                            yyn = 83;
                            continue;
                        case INT:
                            yyn = 84;
                            continue;
                        case REAL:
                            yyn = 85;
                            continue;
                    }
                    yyn = 275;
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
                case 191:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case '(':
                            yyn = 87;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case ')':
                            yyn = 88;
                            continue;
                        case ',':
                            yyn = 89;
                            continue;
                    }
                    yyn = 275;
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
                case 196:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 275;
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
                case 197:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    switch (yytok) {
                        case ID:
                            yyn = 97;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys69();
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
                case 206:
                    switch (yytok) {
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
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
                case 209:
                    switch (yytok) {
                        case '.':
                            yyn = yyr58();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case ';':
                            yyn = 104;
                            continue;
                        case END:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 275;
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
                case 211:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case ';':
                        case END:
                        case VAR:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    switch (yytok) {
                        case ',':
                            yyn = 51;
                            continue;
                        case ')':
                            yyn = 106;
                            continue;
                    }
                    yyn = 275;
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
                case 214:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                        case END:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    switch (yytok) {
                        case ':':
                        case ',':
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    switch (yytok) {
                        case ';':
                        case ',':
                        case ')':
                        case END:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 275;
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
                case 218:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    yyn = yys84();
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
                case 221:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    yyn = yys87();
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
                case 224:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                        case NEW:
                            yyn = 40;
                            continue;
                        case NIL:
                            yyn = 41;
                            continue;
                        case NUM:
                            yyn = 42;
                            continue;
                        case '(':
                            yyn = 43;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case ELSE:
                            yyn = 112;
                            continue;
                        case END:
                            yyn = 113;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    switch (yytok) {
                        case '(':
                            yyn = 114;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    switch (yytok) {
                        case ',':
                            yyn = 89;
                            continue;
                        case ')':
                            yyn = 115;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    switch (yytok) {
                        case END:
                            yyn = 117;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    switch (yytok) {
                        case PROCEDURE:
                            yyn = 9;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    switch (yytok) {
                        case ',':
                            yyn = 51;
                            continue;
                        case ';':
                        case END:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case END:
                            yyn = 121;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    switch (yytok) {
                        case BOOL:
                            yyn = 82;
                            continue;
                        case ID:
                            yyn = 83;
                            continue;
                        case INT:
                            yyn = 84;
                            continue;
                        case REAL:
                            yyn = 85;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    switch (yytok) {
                        case ')':
                            yyn = 123;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    switch (yytok) {
                        case ',':
                            yyn = 89;
                            continue;
                        case ')':
                            yyn = yyr61();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    switch (yytok) {
                        case ')':
                            yyn = 126;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    switch (yytok) {
                        case ';':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    switch (yytok) {
                        case ';':
                            yyn = 127;
                            continue;
                        case END:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case END:
                            yyn = 128;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    switch (yytok) {
                        case BOOL:
                            yyn = 82;
                            continue;
                        case ID:
                            yyn = 83;
                            continue;
                        case INT:
                            yyn = 84;
                            continue;
                        case REAL:
                            yyn = 85;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case END:
                            yyn = 131;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    switch (yytok) {
                        case ')':
                            yyn = 132;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    switch (yytok) {
                        case PROCEDURE:
                            yyn = 9;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case END:
                            yyn = 134;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case ';':
                        case END:
                        case UNTIL:
                        case ENDINPUT:
                        case ELSE:
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    switch (yytok) {
                        case ';':
                            yyn = 12;
                            continue;
                        case END:
                            yyn = 135;
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (node
                                 );
                    yytok = (token()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 275;
                    continue;

                case 272:
                    return true;
                case 273:
                    yyerror("stack overflow");
                case 274:
                    return false;
                case 275:
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
            case CLASS:
                return 8;
            case PROCEDURE:
                return 9;
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys7() {
        switch (yytok) {
            case ID:
                return 16;
            case IF:
                return 17;
            case READ:
                return 18;
            case REPEAT:
                return 19;
            case WRITE:
                return 20;
            case '(':
                return 21;
        }
        return 275;
    }

    private int yys11() {
        switch (yytok) {
            case CLASS:
                return 8;
            case PROCEDURE:
                return 9;
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys12() {
        switch (yytok) {
            case ID:
                return 16;
            case IF:
                return 17;
            case READ:
                return 18;
            case REPEAT:
                return 19;
            case WRITE:
                return 20;
            case '(':
                return 21;
        }
        return 275;
    }

    private int yys13() {
        switch (yytok) {
            case PROCEDURE:
                return 9;
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys19() {
        switch (yytok) {
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys36() {
        switch (yytok) {
            case ID:
                return 39;
            case NEW:
                return 40;
            case NIL:
                return 41;
            case NUM:
                return 42;
            case '(':
                return 43;
            case ')':
                return 60;
        }
        return 275;
    }

    private int yys37() {
        switch (yytok) {
            case THEN:
                return 61;
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
        }
        return 275;
    }

    private int yys39() {
        switch (yytok) {
            case '(':
                return 69;
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case ')':
            case '-':
            case END:
            case UNTIL:
            case THEN:
            case '=':
            case '<':
            case ELSE:
            case ENDINPUT:
                return yyr50();
            case '.':
                return yyr56();
        }
        return 275;
    }

    private int yys41() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr55();
        }
        return 275;
    }

    private int yys42() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr49();
        }
        return 275;
    }

    private int yys46() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ';':
            case END:
            case UNTIL:
            case ENDINPUT:
            case ELSE:
                return yyr36();
        }
        return 275;
    }

    private int yys47() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ')':
                return 73;
        }
        return 275;
    }

    private int yys52() {
        switch (yytok) {
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr27();
        }
        return 275;
    }

    private int yys55() {
        switch (yytok) {
            case PROCEDURE:
                return 9;
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys57() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ';':
            case END:
            case UNTIL:
            case ENDINPUT:
            case ELSE:
                return yyr38();
        }
        return 275;
    }

    private int yys58() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ',':
            case ')':
                return yyr60();
        }
        return 275;
    }

    private int yys61() {
        switch (yytok) {
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys69() {
        switch (yytok) {
            case ID:
                return 39;
            case NEW:
                return 40;
            case NIL:
                return 41;
            case NUM:
                return 42;
            case '(':
                return 43;
            case ')':
                return 99;
        }
        return 275;
    }

    private int yys71() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ')':
                return 101;
        }
        return 275;
    }

    private int yys78() {
        switch (yytok) {
            case VAR:
                return 10;
            case ':':
                return 108;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys82() {
        switch (yytok) {
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case ';':
            case '(':
            case WRITE:
            case END:
            case VAR:
                return yyr23();
        }
        return 275;
    }

    private int yys83() {
        switch (yytok) {
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case ';':
            case '(':
            case WRITE:
            case END:
            case VAR:
                return yyr24();
        }
        return 275;
    }

    private int yys84() {
        switch (yytok) {
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case ';':
            case '(':
            case WRITE:
            case END:
            case VAR:
                return yyr21();
        }
        return 275;
    }

    private int yys85() {
        switch (yytok) {
            case REPEAT:
            case IF:
            case ',':
            case READ:
            case ID:
            case ')':
            case ';':
            case '(':
            case WRITE:
            case END:
            case VAR:
                return yyr22();
        }
        return 275;
    }

    private int yys87() {
        switch (yytok) {
            case ID:
                return 39;
            case NEW:
                return 40;
            case NIL:
                return 41;
            case NUM:
                return 42;
            case '(':
                return 43;
            case ')':
                return yyr62();
        }
        return 275;
    }

    private int yys91() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr47();
        }
        return 275;
    }

    private int yys92() {
        switch (yytok) {
            case '*':
                return 62;
            case '/':
                return 65;
            case ';':
            case '-':
            case ',':
            case '+':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr44();
        }
        return 275;
    }

    private int yys93() {
        switch (yytok) {
            case '*':
                return 62;
            case '/':
                return 65;
            case ';':
            case '-':
            case ',':
            case '+':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr45();
        }
        return 275;
    }

    private int yys94() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr46();
        }
        return 275;
    }

    private int yys95() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case ';':
            case ',':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr42();
        }
        return 275;
    }

    private int yys96() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case ';':
            case ',':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr43();
        }
        return 275;
    }

    private int yys99() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr51();
        }
        return 275;
    }

    private int yys100() {
        switch (yytok) {
            case ID:
                return 39;
            case NEW:
                return 40;
            case NIL:
                return 41;
            case NUM:
                return 42;
            case '(':
                return 43;
            case ')':
                return yyr62();
        }
        return 275;
    }

    private int yys101() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case ')':
            case '-':
            case END:
            case UNTIL:
            case THEN:
            case '=':
            case '<':
            case ELSE:
            case ENDINPUT:
                return yyr48();
            case '.':
                return yyr58();
        }
        return 275;
    }

    private int yys102() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ';':
            case END:
            case UNTIL:
            case ENDINPUT:
            case ELSE:
                return yyr35();
        }
        return 275;
    }

    private int yys106() {
        switch (yytok) {
            case VAR:
                return 10;
            case ':':
                return 120;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys111() {
        switch (yytok) {
            case '*':
                return 62;
            case '+':
                return 63;
            case '-':
                return 64;
            case '/':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case ',':
            case ')':
                return yyr59();
        }
        return 275;
    }

    private int yys112() {
        switch (yytok) {
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys114() {
        switch (yytok) {
            case ID:
                return 39;
            case NEW:
                return 40;
            case NIL:
                return 41;
            case NUM:
                return 42;
            case '(':
                return 43;
            case ')':
                return yyr62();
        }
        return 275;
    }

    private int yys115() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr52();
        }
        return 275;
    }

    private int yys122() {
        switch (yytok) {
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys123() {
        switch (yytok) {
            case ';':
            case END:
            case UNTIL:
            case ENDINPUT:
            case ELSE:
                return yyr41();
            case '.':
                return yyr57();
        }
        return 275;
    }

    private int yys126() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case '-':
            case ')':
            case END:
            case UNTIL:
            case ENDINPUT:
            case THEN:
            case '=':
            case '<':
            case ELSE:
                return yyr54();
        }
        return 275;
    }

    private int yys129() {
        switch (yytok) {
            case VAR:
                return 10;
            case REPEAT:
            case IF:
            case READ:
            case ID:
            case '(':
            case WRITE:
                return yyr28();
        }
        return 275;
    }

    private int yys132() {
        switch (yytok) {
            case ';':
            case '/':
            case ',':
            case '+':
            case '*':
            case ')':
            case '-':
            case END:
            case UNTIL:
            case THEN:
            case '=':
            case '<':
            case ELSE:
            case ENDINPUT:
                return yyr53();
            case '.':
                return yyr57();
        }
        return 275;
    }

    private int yyr1() { // s : classes ';' procs ';' cmds
        { out = new Tiny(((List)yysv[yysp-5]), ((List)yysv[yysp-3]), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=5] = yyrv;
        return 1;
    }

    private int yyr2() { // s : classes ';' cmds
        { out = new Tiny(((List)yysv[yysp-3]), new ArrayList<Proc>(), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr3() { // s : procs ';' cmds
        { out = new Tiny(new ArrayList<Classe>(), ((List)yysv[yysp-3]), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr4() { // s : cmds
        { out = new Tiny(new ArrayList<Classe>(), new ArrayList<Proc>(), ((Bloco)yysv[yysp-1])); yyrv = out; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr11() { // classes : classes ';' classe
        { ((List)yysv[yysp-3]).add(((Classe)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr12() { // classes : classe
        { List<Classe> l = new ArrayList<Classe>();
               l.add(((Classe)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 2;
    }

    private int yyr33() { // cmd : IF exp THEN cmds END
        { yyrv = new If(((Exp)yysv[yysp-4]), ((Bloco)yysv[yysp-2]), new Bloco(new ArrayList<Decl>(), new ArrayList<Cmd>(), ((Token)yysv[yysp-3]).getLin()), ((Token)yysv[yysp-5]).getLin()); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr34() { // cmd : IF exp THEN cmds ELSE cmds END
        { yyrv = new If(((Exp)yysv[yysp-6]), ((Bloco)yysv[yysp-4]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-7]).getLin()); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yyr35() { // cmd : REPEAT cmds UNTIL exp
        { yyrv = new Repeat(((Bloco)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yyr36() { // cmd : WRITE exp
        { yyrv = new Write(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypcmd();
    }

    private int yyr37() { // cmd : READ ID
        { yyrv = new Read(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypcmd();
    }

    private int yyr38() { // cmd : ID ATRIB exp
        { yyrv = new Atrib(((Token)yysv[yysp-3]).getLexeme(), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr39() { // cmd : ID '(' ')'
        { yyrv = new Chamada(((Token)yysv[yysp-3]).getLexeme(),
        new ArrayList<Exp>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr40() { // cmd : ID '(' exps ')'
        { yyrv = new Chamada(((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yyr41() { // cmd : rexp '.' ID '(' expopt ')'
        { yyrv = new ChamadaMetodo(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return yypcmd();
    }

    private int yypcmd() {
        switch (yyst[yysp-1]) {
            case 7: return 14;
            default: return 31;
        }
    }

    private int yyr31() { // cmds : cmds ';' cmd
        { ((Bloco)yysv[yysp-3]).add(((Cmd)yysv[yysp-1])); yyrv = ((Bloco)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypcmds();
    }

    private int yyr32() { // cmds : var cmd
        { ((Bloco)yysv[yysp-2]).add(((Cmd)yysv[yysp-1])); yyrv = ((Bloco)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypcmds();
    }

    private int yypcmds() {
        switch (yyst[yysp-1]) {
            case 122: return 130;
            case 112: return 124;
            case 106: return 119;
            case 78: return 107;
            case 61: return 90;
            case 55: return 86;
            case 19: return 45;
            case 13: return 32;
            case 11: return 28;
            case 0: return 3;
            default: return 133;
        }
    }

    private int yyr20() { // decl : ids ':' tipo
        { List<Decl> l = new ArrayList<Decl>(); for(String s: (List<String>)((List)yysv[yysp-3])) l.add(new Decl(s, ((String)yysv[yysp-1]))); yyrv = l; }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 51: return 79;
            default: return 24;
        }
    }

    private int yyr16() { // declopt : VAR decls
        { yyrv = ((List)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return 74;
    }

    private int yyr17() { // declopt : /* empty */
        { yyrv = new ArrayList<Decl>(); }
        yysv[yysp-=0] = yyrv;
        return 74;
    }

    private int yyr25() { // decls : decls ',' decl
        { ((List)yysv[yysp-3]).addAll(((List)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypdecls();
    }

    private int yyr26() { // decls : decl
        yysp -= 1;
        return yypdecls();
    }

    private int yypdecls() {
        switch (yyst[yysp-1]) {
            case 50: return 77;
            case 10: return 25;
            default: return 105;
        }
    }

    private int yyr42() { // exp : exp '<' exp
        { yyrv = new Menor(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr43() { // exp : exp '=' exp
        { yyrv = new Igual(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr44() { // exp : exp '+' exp
        { yyrv = new Soma(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr45() { // exp : exp '-' exp
        { yyrv = new Sub(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr46() { // exp : exp '/' exp
        { yyrv = new Div(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr47() { // exp : exp '*' exp
        { yyrv = new Mult(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr48() { // exp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr49() { // exp : NUM
        { yyrv = new Num(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr50() { // exp : ID
        { yyrv = new Var(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr51() { // exp : ID '(' ')'
        { yyrv = new Chamada(((Token)yysv[yysp-3]).getLexeme(),
        new ArrayList<Exp>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr52() { // exp : ID '(' exps ')'
        { yyrv = new Chamada(((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypexp();
    }

    private int yyr53() { // exp : rexp '.' ID '(' expopt ')'
        { yyrv = new ChamadaMetodo(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return yypexp();
    }

    private int yyr54() { // exp : NEW ID '(' expopt ')'
        { yyrv = new Cons(((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-5]).getLin()); }
        yysv[yysp-=5] = yyrv;
        return yypexp();
    }

    private int yyr55() { // exp : NIL
        { yyrv = Nil.INSTANCE; }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 89: return 111;
            case 72: return 102;
            case 67: return 96;
            case 66: return 95;
            case 65: return 94;
            case 64: return 93;
            case 63: return 92;
            case 62: return 91;
            case 43: return 71;
            case 35: return 57;
            case 21: return 47;
            case 20: return 46;
            case 17: return 37;
            default: return 58;
        }
    }

    private int yyr61() { // expopt : exps
        { yyrv = ((List)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpopt();
    }

    private int yyr62() { // expopt : /* empty */
        { yyrv = new ArrayList<Exp>(); }
        yysv[yysp-=0] = yyrv;
        return yypexpopt();
    }

    private int yypexpopt() {
        switch (yyst[yysp-1]) {
            case 100: return 116;
            case 87: return 109;
            default: return 125;
        }
    }

    private int yyr59() { // exps : exps ',' exp
        { ((List)yysv[yysp-3]).add(((Exp)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypexps();
    }

    private int yyr60() { // exps : exp
        { List<Exp> l = new ArrayList<Exp>();
               l.add(((Exp)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return yypexps();
    }

    private int yypexps() {
        switch (yyst[yysp-1]) {
            case 69: return 98;
            case 36: return 59;
            default: return 110;
        }
    }

    private int yyr29() { // ids : ids ',' ID
        { ((List)yysv[yysp-3]).add(((Token)yysv[yysp-1]).getLexeme()); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 26;
    }

    private int yyr30() { // ids : ID
        { List<String> l = new ArrayList<String>(); l.add(((Token)yysv[yysp-1]).getLexeme()); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr7() { // proc : PROCEDURE ID '(' ')' cmds END
        { yyrv = new Proc(((Token)yysv[yysp-5]).getLexeme(),
        new ArrayList<Decl>(), "void", ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-6]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return yypproc();
    }

    private int yyr8() { // proc : PROCEDURE ID '(' decls ')' cmds END
        { yyrv = new Proc(((Token)yysv[yysp-6]).getLexeme(),
        ((List)yysv[yysp-4]), "void", ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-7]).getLin()); }
        yysv[yysp-=7] = yyrv;
        return yypproc();
    }

    private int yyr9() { // proc : PROCEDURE ID '(' ')' ':' tipo cmds END
        { yyrv = new Proc(((Token)yysv[yysp-7]).getLexeme(),
        new ArrayList<Decl>(), ((String)yysv[yysp-3]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-8]).getLin()); }
        yysv[yysp-=8] = yyrv;
        return yypproc();
    }

    private int yyr10() { // proc : PROCEDURE ID '(' decls ')' ':' tipo cmds END
        { yyrv = new Proc(
        ((Token)yysv[yysp-8]).getLexeme(), ((List)yysv[yysp-6]), ((String)yysv[yysp-3]), ((Bloco)yysv[yysp-2]), ((Token)yysv[yysp-9]).getLin()); }
        yysv[yysp-=9] = yyrv;
        return yypproc();
    }

    private int yypproc() {
        switch (yyst[yysp-1]) {
            case 104: return 4;
            case 11: return 4;
            case 0: return 4;
            default: return 33;
        }
    }

    private int yyr18() { // procopt : ';' procs
        { yyrv = ((List)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return 103;
    }

    private int yyr19() { // procopt : /* empty */
        { yyrv = new ArrayList<Proc>(); }
        yysv[yysp-=0] = yyrv;
        return 103;
    }

    private int yyr5() { // procs : procs ';' proc
        { ((List)yysv[yysp-3]).add(((Proc)yysv[yysp-1])); yyrv = ((List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return yypprocs();
    }

    private int yyr6() { // procs : proc
        { List<Proc> l = new ArrayList<Proc>();
               l.add(((Proc)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return yypprocs();
    }

    private int yypprocs() {
        switch (yyst[yysp-1]) {
            case 11: return 29;
            case 0: return 5;
            default: return 118;
        }
    }

    private int yyr56() { // rexp : ID
        { yyrv = new Var(((Token)yysv[yysp-1]).getLexeme(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return yyprexp();
    }

    private int yyr57() { // rexp : rexp '.' ID '(' expopt ')'
        { yyrv = new ChamadaMetodo(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).getLexeme(), ((List)yysv[yysp-2]), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return yyprexp();
    }

    private int yyr58() { // rexp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yyprexp();
    }

    private int yyprexp() {
        switch (yyst[yysp-1]) {
            case 12: return 15;
            case 7: return 15;
            default: return 38;
        }
    }

    private int yyr13() { // classe : CLASS ID supopt declopt procopt END
        {
           yyrv = new Classe(((Token)yysv[yysp-5]).getLexeme(), ((String)yysv[yysp-4]), ((List)yysv[yysp-3]), ((List)yysv[yysp-2]), ((Token)yysv[yysp-6]).getLin());
         }
        yysv[yysp-=6] = yyrv;
        switch (yyst[yysp-1]) {
            case 0: return 6;
            default: return 30;
        }
    }

    private int yyr14() { // supopt : SUBT ID
        { yyrv = ((Token)yysv[yysp-1]).getLexeme(); }
        yysv[yysp-=2] = yyrv;
        return 48;
    }

    private int yyr15() { // supopt : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return 48;
    }

    private int yyr21() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr22() { // tipo : REAL
        { yyrv = "real"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr23() { // tipo : BOOL
        { yyrv = "bool"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr24() { // tipo : ID
        { yyrv = ((Token)yysv[yysp-1]).getLexeme(); }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyptipo() {
        switch (yyst[yysp-1]) {
            case 108: return 122;
            case 54: return 81;
            default: return 129;
        }
    }

    private int yyr27() { // var : VAR decls ';'
        { yyrv = new Bloco(((List)yysv[yysp-2]), new ArrayList<Cmd>(), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return 7;
    }

    private int yyr28() { // var : /* empty */
        { yyrv = new Bloco(new ArrayList<Decl>(), new ArrayList<Cmd>(), 0); }
        yysv[yysp-=0] = yyrv;
        return 7;
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
