package com.ibm.intellij.plugins.cobol;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class CobolFileType extends LanguageFileType {

    public static final CobolFileType INSTANCE = new CobolFileType();
    @NonNls
    public static final String[] DEFAULT_EXTENSIONS = {"cob", "cbl", "ccp", "cb2"};

    private CobolFileType() {
        super(CobolLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "COBOL";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "COBOL Langague File";
    }

    @NotNull
    public String getDefaultExtension() {
        return DEFAULT_EXTENSIONS[0];
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }
}
