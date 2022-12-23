package com.ibm.intellij.plugins.cobol.psi;

import com.ibm.intellij.plugins.cobol.CobolLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class CobolElementType extends IElementType {
    public CobolElementType(@NotNull String debugName) {
        super(debugName, CobolLanguage.INSTANCE);
    }
}
