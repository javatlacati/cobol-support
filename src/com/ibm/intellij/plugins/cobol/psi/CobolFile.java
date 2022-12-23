package com.ibm.intellij.plugins.cobol.psi;

import com.ibm.intellij.plugins.cobol.CobolFileType;
import com.ibm.intellij.plugins.cobol.CobolLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CobolFile extends PsiFileBase {

    public CobolFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CobolLanguage.INSTANCE);
    }

    @Override
    public @NotNull
    FileType getFileType() {
        return CobolFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Cobol File";
    }
}
