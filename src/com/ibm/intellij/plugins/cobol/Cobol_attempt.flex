package com.ibm.intellij.plugins.cobol;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.ibm.intellij.plugins.cobol.psi.CobolTypes;
import com.intellij.psi.TokenType;

%%
/* Sección de declaraciones de JFlex */
%class _CobolLexer
%implements FlexLexer
%unicode
%function advance
/* Al utilizar esta instrucción, se le indica a JFlex que devuelva objetos del tipo IElementType */
%type IElementType
%eof{  return;
%eof}

/* Inicio de Expresiones regulares */
CRLF=\R
WHITE_SPACE=[\ \n\t\f]
LINE_COMMENT=\*[\ \n\t\f]*([^\r\n]*[\ \n\t\f]*)?\.
KEYWORD=(ACCEPT|ADD|ALLOCATE|CALL|CANCEL|CLOSE|COMPUTE|CONFIGURATION|CONTINUE|DATA|DELETE|DISPLAY|DIVIDE|DIVISION|ELSE|END|END-ACCEPT|END-ADD|END-CALL|END-COMPUTE|END-DELETE|END-DISPLAY|END-DIVIDE|END-EVALUATE|END-IF|END-MULTIPLY|END-OF-PAGE|END-PERFORM|END-READ|END-RETURN|END-REWRITE|END-SEARCH|END-START|END-STRING|END-SUBTRACT|END-UNSTRING|END-WRITE|ENVIRONMENT|EVALUATE|EXIT|FD|FILE|FILE-CONTROL|FOREVER|FREE|GENERATE|GO|GOBACK|IDENTIFICATION|IF|INITIALIZE|INITIATE|INPUT-OUTPUT|INSPECT|INVOKE|I-O-CONTROL|LINKAGE|LOCAL-STORAGE|MERGE|MOVE|MULTIPLY|OPEN|PERFORM|PROCEDURE|PROGRAM-ID|RAISE|READ|RELEASE|RESUME|RETURN|REWRITE|SCREEN|SD|SEARCH|SECTION|SET|SORT|START|STOP|STRING|SUBTRACT|SUPPRESS|TERMINATE|THEN|UNLOCK|UNSTRING|USE|VALIDATE|WORKING-STORAGE|WRITE)
/* Finaliza expresiones regulares */

%state WAITING_VALUE

%%
/* Inicia sección de reglas */
<YYINITIAL> {LINE_COMMENT}                           { yybegin(YYINITIAL); return CobolTypes.COMMENT_LINE; }

<YYINITIAL> {KEYWORD}+                                { yybegin(YYINITIAL); return CobolTypes.KEYWORD_RESERVED; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
