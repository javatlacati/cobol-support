package com.ibm.intellij.plugins.cobol;

import com.intellij.lexer.FlexAdapter;

public class CobolLexerAdapter extends FlexAdapter {
    public CobolLexerAdapter() {
        super(new _CobolLexer(null));
    }
}
