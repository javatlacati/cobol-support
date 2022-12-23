// This is a generated file. Not intended for manual editing.
package com.ibm.intellij.plugins.cobol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.ibm.intellij.plugins.cobol.impl.*;

public interface CobolTypes {

  IElementType COMMENT = new CobolElementType("COMMENT");
  IElementType CORE = new CobolElementType("CORE");
  IElementType CR = new CobolElementType("CR");
  IElementType DOTCHAR = new CobolElementType("DOTCHAR");
  IElementType LF = new CobolElementType("LF");
  IElementType NEWLINE = new CobolElementType("NEWLINE");
  IElementType NUMS = new CobolElementType("NUMS");
  IElementType OPERATION = new CobolElementType("OPERATION");
  IElementType STRINGS = new CobolElementType("STRINGS");

  IElementType COMMENTS = new CobolTokenType("Comments");
  IElementType KEYWORDINACTIVE = new CobolTokenType("KeywordInactive");
  IElementType KEYWORDPSEUDO = new CobolTokenType("KeywordPseudo");
  IElementType KEYWORDRESERVED = new CobolTokenType("KeywordReserved");
  IElementType KEYWORDTYPE = new CobolTokenType("KeywordType");
  IElementType NAMEBUILTIN = new CobolTokenType("NameBuiltin");
  IElementType NAMECONSTANT = new CobolTokenType("NameConstant");
  IElementType NAMEFUNCTION = new CobolTokenType("NameFunction");
  IElementType NUMBERFLOATONE = new CobolTokenType("NumberFloatOne");
  IElementType NUMBERFLOATTWO = new CobolTokenType("NumberFloatTwo");
  IElementType NUMBERINTEGER = new CobolTokenType("NumberInteger");
  IElementType OPERATOR = new CobolTokenType("Operator");
  IElementType OPERATORWORD = new CobolTokenType("OperatorWord");
  IElementType PUNCHED_CARD_IDX = new CobolTokenType("PUNCHED_CARD_IDX");
  IElementType PUNCTUATION = new CobolTokenType("Punctuation");
  IElementType STRINGSDOUBLE = new CobolTokenType("StringsDouble");
  IElementType STRINGSSINGLE = new CobolTokenType("StringsSingle");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMMENT) {
        return new CobolCommentImpl(node);
      }
      else if (type == CORE) {
        return new CobolCoreImpl(node);
      }
      else if (type == CR) {
        return new CobolCrImpl(node);
      }
      else if (type == DOTCHAR) {
        return new CobolDotcharImpl(node);
      }
      else if (type == LF) {
        return new CobolLfImpl(node);
      }
      else if (type == NEWLINE) {
        return new CobolNewlineImpl(node);
      }
      else if (type == NUMS) {
        return new CobolNumsImpl(node);
      }
      else if (type == OPERATION) {
        return new CobolOperationImpl(node);
      }
      else if (type == STRINGS) {
        return new CobolStringsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
