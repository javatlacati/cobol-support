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

public class CobolNewlineImpl extends ASTWrapperPsiElement implements CobolNewline {

  public CobolNewlineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitNewline(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolCr> getCrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolCr.class);
  }

  @Override
  @NotNull
  public List<CobolLf> getLfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolLf.class);
  }

}
