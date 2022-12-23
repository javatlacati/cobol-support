package com.ibm.intellij.plugins.cobol;

import com.ibm.intellij.plugins.cobol.psi.CobolFile;
import com.ibm.intellij.plugins.cobol.psi.CobolTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class CobolParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(CobolTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(CobolLanguage.INSTANCE);

    @Override
    public @NotNull
    Lexer createLexer(Project project) {
        return new CobolLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CobolParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull
    TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull
    TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull
    PsiElement createElement(ASTNode astNode) {
        return CobolTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new CobolFile(fileViewProvider);
    }
}
