package com.ibm.intellij.plugins.cobol;

import com.intellij.lang.Language;

public class CobolLanguage extends Language {

    public static final CobolLanguage INSTANCE = new CobolLanguage();


    private CobolLanguage() {
        super("COBOL", "text/x-cobol");
    }
}
