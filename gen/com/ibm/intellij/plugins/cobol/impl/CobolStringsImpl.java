// This is a generated file. Not intended for manual editing.
package com.ibm.intellij.plugins.cobol.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.ibm.intellij.plugins.cobol.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.ibm.intellij.plugins.cobol.psi.*;

public class CobolStringsImpl extends ASTWrapperPsiElement implements CobolStrings {

  public CobolStringsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStrings(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getStringsDouble() {
    return findChildByType(STRINGSDOUBLE);
  }

  @Override
  @Nullable
  public PsiElement getStringsSingle() {
    return findChildByType(STRINGSSINGLE);
  }

}
