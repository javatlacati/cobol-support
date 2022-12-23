package com.ibm.intellij.plugins.cobol;

import com.ibm.intellij.plugins.cobol.psi.CobolTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CobolSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEY =
            createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PSEUDO_KEYWORD =
            createTextAttributesKey("COBOL_PSEUDO_KEYWORD", DefaultLanguageHighlighterColors.LABEL);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("COBOL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey NAMEFUNCTION =
            createTextAttributesKey("NAMEFUNCTION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey NAMECONSTANT =
            createTextAttributesKey("NAMECONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey PUNCHED_CARD_IDX =
            createTextAttributesKey("PUNCHED_CARD_IDX", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);


    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] PSEUDO_KEYWORD_KEYS = new TextAttributesKey[]{PSEUDO_KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] NAMEFUNCTION_KEYS = new TextAttributesKey[]{NAMEFUNCTION};
    private static final TextAttributesKey[] NAMECONSTANT_KEYS = new TextAttributesKey[]{NAMECONSTANT};
    private static final TextAttributesKey[] PUNCHED_CARD_IDX_KEYS = new TextAttributesKey[]{PUNCHED_CARD_IDX};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CobolLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CobolTypes.KEYWORDRESERVED)) {
            return KEY_KEYS;
        }
        if (tokenType.equals(CobolTypes.KEYWORDPSEUDO)) {
            return PSEUDO_KEYWORD_KEYS;
        }
        if (tokenType.equals(CobolTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(CobolTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(CobolTypes.STRINGSDOUBLE) || tokenType.equals(CobolTypes.STRINGSSINGLE)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(CobolTypes.NUMS)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(CobolTypes.NAMEFUNCTION)) {
            return NAMEFUNCTION_KEYS;
        }
        if (tokenType.equals(CobolTypes.NAMECONSTANT)) {
            return NAMECONSTANT_KEYS;
        }
        if (tokenType.equals(CobolTypes.PUNCHED_CARD_IDX)) {
            return PUNCHED_CARD_IDX_KEYS;
        }
        return EMPTY_KEYS;
    }
}
