// This is a generated file. Not intended for manual editing.
package com.ibm.intellij.plugins.cobol;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.ibm.intellij.plugins.cobol.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // Comments+ NEWLINE
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    if (!nextTokenIs(b, COMMENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMMENT_0(b, l + 1);
    r = r && NEWLINE(b, l + 1);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // Comments+
  private static boolean COMMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENTS);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENTS)) break;
      if (!empty_element_parsed_guard_(b, "COMMENT_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '\r'
  public static boolean CR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CR, "<cr>");
    r = consumeToken(b, "\\r");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "."
  public static boolean DOTCHAR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOTCHAR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOTCHAR, "<dotchar>");
    r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '\n'
  public static boolean LF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LF")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LF, "<lf>");
    r = consumeToken(b, "\\n");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (CR? LF)+
  public static boolean NEWLINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NEWLINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEWLINE, "<newline>");
    r = NEWLINE_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!NEWLINE_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NEWLINE", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CR? LF
  private static boolean NEWLINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NEWLINE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NEWLINE_0_0(b, l + 1);
    r = r && LF(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CR?
  private static boolean NEWLINE_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NEWLINE_0_0")) return false;
    CR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NameConstant* | KeywordReserved* | KeywordPseudo* | KeywordInactive* | KeywordType*  | Punctuation* | NameFunction* | NameBuiltin* | OperatorWord*
  public static boolean core(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CORE, "<core>");
    r = core_0(b, l + 1);
    if (!r) r = core_1(b, l + 1);
    if (!r) r = core_2(b, l + 1);
    if (!r) r = core_3(b, l + 1);
    if (!r) r = core_4(b, l + 1);
    if (!r) r = core_5(b, l + 1);
    if (!r) r = core_6(b, l + 1);
    if (!r) r = core_7(b, l + 1);
    if (!r) r = core_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NameConstant*
  private static boolean core_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NAMECONSTANT)) break;
      if (!empty_element_parsed_guard_(b, "core_0", c)) break;
    }
    return true;
  }

  // KeywordReserved*
  private static boolean core_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, KEYWORDRESERVED)) break;
      if (!empty_element_parsed_guard_(b, "core_1", c)) break;
    }
    return true;
  }

  // KeywordPseudo*
  private static boolean core_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, KEYWORDPSEUDO)) break;
      if (!empty_element_parsed_guard_(b, "core_2", c)) break;
    }
    return true;
  }

  // KeywordInactive*
  private static boolean core_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, KEYWORDINACTIVE)) break;
      if (!empty_element_parsed_guard_(b, "core_3", c)) break;
    }
    return true;
  }

  // KeywordType*
  private static boolean core_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, KEYWORDTYPE)) break;
      if (!empty_element_parsed_guard_(b, "core_4", c)) break;
    }
    return true;
  }

  // Punctuation*
  private static boolean core_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PUNCTUATION)) break;
      if (!empty_element_parsed_guard_(b, "core_5", c)) break;
    }
    return true;
  }

  // NameFunction*
  private static boolean core_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NAMEFUNCTION)) break;
      if (!empty_element_parsed_guard_(b, "core_6", c)) break;
    }
    return true;
  }

  // NameBuiltin*
  private static boolean core_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NAMEBUILTIN)) break;
      if (!empty_element_parsed_guard_(b, "core_7", c)) break;
    }
    return true;
  }

  // OperatorWord*
  private static boolean core_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "core_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, OPERATORWORD)) break;
      if (!empty_element_parsed_guard_(b, "core_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NumberInteger* | NumberFloatOne* | NumberFloatTwo*
  public static boolean nums(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nums")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMS, "<nums>");
    r = nums_0(b, l + 1);
    if (!r) r = nums_1(b, l + 1);
    if (!r) r = nums_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NumberInteger*
  private static boolean nums_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nums_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NUMBERINTEGER)) break;
      if (!empty_element_parsed_guard_(b, "nums_0", c)) break;
    }
    return true;
  }

  // NumberFloatOne*
  private static boolean nums_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nums_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NUMBERFLOATONE)) break;
      if (!empty_element_parsed_guard_(b, "nums_1", c)) break;
    }
    return true;
  }

  // NumberFloatTwo*
  private static boolean nums_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nums_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NUMBERFLOATTWO)) break;
      if (!empty_element_parsed_guard_(b, "nums_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // core Operator* core
  public static boolean operation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION, "<operation>");
    r = core(b, l + 1);
    r = r && operation_1(b, l + 1);
    r = r && core(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Operator*
  private static boolean operation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, OPERATOR)) break;
      if (!empty_element_parsed_guard_(b, "operation_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PUNCHED_CARD_IDX? COMMENT* | PUNCHED_CARD_IDX* | PUNCHED_CARD_IDX* core* DOTCHAR* | PUNCHED_CARD_IDX* operation* DOTCHAR* | nums*  | strings*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    if (!r) r = root_1(b, l + 1);
    if (!r) r = root_2(b, l + 1);
    if (!r) r = root_3(b, l + 1);
    if (!r) r = root_4(b, l + 1);
    if (!r) r = root_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCHED_CARD_IDX? COMMENT*
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0_0(b, l + 1);
    r = r && root_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCHED_CARD_IDX?
  private static boolean root_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0_0")) return false;
    consumeToken(b, PUNCHED_CARD_IDX);
    return true;
  }

  // COMMENT*
  private static boolean root_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!COMMENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_0_1", c)) break;
    }
    return true;
  }

  // PUNCHED_CARD_IDX*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PUNCHED_CARD_IDX)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  // PUNCHED_CARD_IDX* core* DOTCHAR*
  private static boolean root_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_2_0(b, l + 1);
    r = r && root_2_1(b, l + 1);
    r = r && root_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCHED_CARD_IDX*
  private static boolean root_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PUNCHED_CARD_IDX)) break;
      if (!empty_element_parsed_guard_(b, "root_2_0", c)) break;
    }
    return true;
  }

  // core*
  private static boolean root_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!core(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_2_1", c)) break;
    }
    return true;
  }

  // DOTCHAR*
  private static boolean root_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DOTCHAR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_2_2", c)) break;
    }
    return true;
  }

  // PUNCHED_CARD_IDX* operation* DOTCHAR*
  private static boolean root_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_3_0(b, l + 1);
    r = r && root_3_1(b, l + 1);
    r = r && root_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUNCHED_CARD_IDX*
  private static boolean root_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PUNCHED_CARD_IDX)) break;
      if (!empty_element_parsed_guard_(b, "root_3_0", c)) break;
    }
    return true;
  }

  // operation*
  private static boolean root_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_3_1", c)) break;
    }
    return true;
  }

  // DOTCHAR*
  private static boolean root_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DOTCHAR(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_3_2", c)) break;
    }
    return true;
  }

  // nums*
  private static boolean root_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nums(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_4", c)) break;
    }
    return true;
  }

  // strings*
  private static boolean root_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!strings(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // StringsDouble | StringsSingle
  public static boolean strings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "strings")) return false;
    if (!nextTokenIs(b, "<strings>", STRINGSDOUBLE, STRINGSSINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRINGS, "<strings>");
    r = consumeToken(b, STRINGSDOUBLE);
    if (!r) r = consumeToken(b, STRINGSSINGLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
