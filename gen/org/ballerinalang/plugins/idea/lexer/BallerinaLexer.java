/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.ballerinalang.plugins.idea.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Ballerina.flex</tt>
 */
class BallerinaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\2\2\1\1\2\22\0\1\1\1\60\1\21\1\0\1\71\1\70\1\64\1\0\1\47\1\50"+
    "\1\66\1\7\1\56\1\44\1\5\1\25\1\3\11\4\1\63\1\55\1\46\1\57\1\45\1\62\1\72\4"+
    "\24\1\6\1\10\24\24\1\53\1\22\1\54\1\67\1\24\1\23\1\16\1\32\1\26\1\24\1\14"+
    "\1\15\1\41\1\34\1\27\1\37\1\33\1\17\1\35\1\31\1\30\1\36\1\24\1\12\1\20\1\11"+
    "\1\13\1\43\1\40\1\24\1\42\1\24\1\51\1\65\1\52\1\61\6\0\1\1\32\0\1\1\337\0"+
    "\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\6\5"+
    "\1\1\1\7\1\10\10\5\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\3\0\1\40\12\5\1\41\3\5"+
    "\1\0\1\42\2\0\1\43\1\44\3\5\1\45\12\5"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\2\0\1\5\1\56\12\5\1\57\1\5\1\60\6\5"+
    "\1\61\7\5\1\62\2\5\1\63\3\5\1\64\1\5"+
    "\1\65\7\5\1\66\3\5\1\67\4\5\1\70\3\5"+
    "\1\71\3\5\1\72\1\73\3\5\1\74\3\5\1\75"+
    "\2\5\1\76\1\5\1\77\2\5\1\100\3\5\1\101"+
    "\1\102\1\5\1\103\1\5\1\104\3\5\1\105\1\5"+
    "\1\106\1\107\1\110\1\5\1\111\1\112\2\5\1\113"+
    "\3\5\1\114";

  private static int [] zzUnpackAction() {
    int [] result = new int[204];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\u0162\0\73"+
    "\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff\0\u033a"+
    "\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7\0\u0512"+
    "\0\u054d\0\u0588\0\u05c3\0\u05fe\0\73\0\73\0\73\0\73"+
    "\0\73\0\73\0\73\0\73\0\u0639\0\u0674\0\73\0\73"+
    "\0\73\0\u06af\0\u06ea\0\73\0\73\0\73\0\u0162\0\73"+
    "\0\261\0\u0725\0\u0760\0\73\0\u079b\0\u07d6\0\u0811\0\u084c"+
    "\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae\0\u0162\0\u09e9"+
    "\0\u0a24\0\u0a5f\0\u02ff\0\73\0\u0a9a\0\u033a\0\73\0\u0ad5"+
    "\0\u0b10\0\u0b4b\0\u0b86\0\u0162\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72"+
    "\0\u0cad\0\u0ce8\0\u0d23\0\u0d5e\0\u0d99\0\u0dd4\0\73\0\73"+
    "\0\73\0\73\0\73\0\73\0\73\0\73\0\u0e0f\0\u0e4a"+
    "\0\u0e85\0\u0162\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7"+
    "\0\u1022\0\u105d\0\u1098\0\u10d3\0\u0162\0\u110e\0\u0162\0\u1149"+
    "\0\u1184\0\u11bf\0\u11fa\0\u1235\0\u1270\0\u0162\0\u12ab\0\u12e6"+
    "\0\u1321\0\u135c\0\u1397\0\u13d2\0\u140d\0\u0162\0\u1448\0\u1483"+
    "\0\u14be\0\u14f9\0\u1534\0\u156f\0\u0162\0\u15aa\0\u0162\0\u15e5"+
    "\0\u1620\0\u165b\0\u1696\0\u16d1\0\u170c\0\u1747\0\u0162\0\u1782"+
    "\0\u17bd\0\u17f8\0\u0162\0\u1833\0\u186e\0\u18a9\0\u18e4\0\u191f"+
    "\0\u195a\0\u1995\0\u19d0\0\u0162\0\u1a0b\0\u1a46\0\u1a81\0\u0162"+
    "\0\u0162\0\u1abc\0\u1af7\0\u1b32\0\u0162\0\u1b6d\0\u1ba8\0\u1be3"+
    "\0\u0162\0\u1c1e\0\u1c59\0\u0162\0\u1c94\0\u0162\0\u1ccf\0\u1d0a"+
    "\0\u0162\0\u1d45\0\u1d80\0\u1dbb\0\u0162\0\u0162\0\u1df6\0\u0162"+
    "\0\u1e31\0\u0162\0\u1e6c\0\u1ea7\0\u1ee2\0\u0162\0\u1f1d\0\u0162"+
    "\0\u0162\0\u0162\0\u1f58\0\u0162\0\u0162\0\u1f93\0\u1fce\0\u0162"+
    "\0\u2009\0\u2044\0\u207f\0\u0162";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[204];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\7"+
    "\1\11\1\12\1\7\1\13\1\14\1\15\1\7\1\16"+
    "\1\17\1\2\1\20\1\7\1\21\1\22\1\23\1\7"+
    "\1\24\1\25\3\7\1\26\1\27\1\30\2\7\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\74\0"+
    "\2\3\73\0\2\61\1\62\1\63\1\0\1\64\3\0"+
    "\1\63\1\64\60\0\2\5\1\62\1\63\1\0\1\64"+
    "\3\0\1\63\1\64\60\0\2\62\71\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\2\7\1\65"+
    "\6\7\3\0\1\7\1\0\1\7\1\66\4\7\1\67"+
    "\5\7\1\70\1\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\4\7\1\71\4\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\7\7\1\72\1\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\3\7\1\73"+
    "\2\7\1\74\2\7\3\0\1\7\1\0\2\7\1\75"+
    "\13\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\7\7\1\76\1\77\3\0\1\7\1\0\1\100\2\7"+
    "\1\101\12\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\4\7\1\102\4\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\1\0\2\103\1\0\16\103\1\104\1\105"+
    "\50\103\23\106\1\107\47\106\25\0\1\110\50\0\2\7"+
    "\1\0\1\7\1\0\6\7\1\111\2\7\3\0\1\7"+
    "\1\0\2\7\1\112\13\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\1\7\1\113\3\7\1\114\3\7"+
    "\3\0\1\7\1\0\7\7\1\115\6\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\3\7\1\116\1\117"+
    "\4\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\2\7\1\120\6\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\3\7\1\121\2\7\1\122\2\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\2\7\1\123"+
    "\13\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\2\7\1\124\3\7\1\125"+
    "\7\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\4\7\1\126\4\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\46\0\1\127\104\0\1\130\57\0\1\131\12\0"+
    "\1\132\72\0\1\133\72\0\1\134\77\0\1\135\73\0"+
    "\1\136\10\0\2\62\1\0\1\63\1\0\1\64\3\0"+
    "\1\63\1\64\60\0\2\137\2\0\1\140\34\0\1\140"+
    "\31\0\2\7\1\0\1\7\1\0\3\7\1\141\5\7"+
    "\3\0\1\7\1\0\14\7\1\142\1\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\7\7\1\143\6\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\2\7\1\144\6\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\10\7\1\145\5\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\1\7"+
    "\1\146\6\7\1\147\3\0\1\7\1\0\10\7\1\150"+
    "\5\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\10\7\1\151\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\3\7\1\152\12\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\7\7\1\153\1\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\2\7\1\154\6\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\7\7"+
    "\1\155\1\7\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\1\7\1\156\7\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\14\7"+
    "\1\157\1\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\2\7\1\160\6\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\1\0\2\103\1\0\70\103\2\110\1\0"+
    "\70\110\3\0\2\7\1\0\1\7\1\0\1\7\1\161"+
    "\7\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\11\7\3\0\1\7\1\0"+
    "\3\7\1\162\12\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\4\7\1\163\4\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\10\7\1\164\5\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\7\7\1\165"+
    "\1\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\11\7\3\0\1\7\1\0"+
    "\12\7\1\166\3\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\4\7\1\167\4\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\4\7\1\170\11\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\1\171\15\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\1\7"+
    "\1\172\14\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\2\7\1\173\6\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\11\7"+
    "\3\0\1\7\1\0\1\7\1\174\14\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\2\7\1\175\6\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\137"+
    "\3\0\1\64\4\0\1\64\60\0\2\137\71\0\2\7"+
    "\1\0\1\7\1\0\4\7\1\176\4\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\4\7\1\177\4\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\11\7"+
    "\3\0\1\7\1\0\2\7\1\200\13\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\4\7\1\201\4\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\3\7\1\202\5\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\2\7\1\203\13\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\7\7"+
    "\1\204\1\7\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\4\7\1\205\4\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\1\206"+
    "\15\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\10\7\1\141\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\5\7\1\207\10\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\1\7"+
    "\1\210\14\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\15\7\1\211\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\1\212\15\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\10\7\1\213\3\0\1\7\1\0"+
    "\3\7\1\214\12\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\2\7\1\215\6\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\2\7\1\216\13\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\7\7\1\217"+
    "\1\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\6\7\1\220\2\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\7\7\1\221\1\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\5\7\1\222\10\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\3\7\1\223\12\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\11\7\3\0\1\7\1\0"+
    "\5\7\1\224\10\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\7\7\1\225\1\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\10\7\1\226\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\2\7\1\227\13\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\12\7"+
    "\1\230\3\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\1\231\15\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\2\7\1\232"+
    "\6\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\3\7\1\233\5\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\14\7\1\234"+
    "\1\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\1\7\1\235\7\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\2\7\1\236\13\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\11\7\3\0\1\7\1\0"+
    "\1\7\1\237\14\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\6\7\1\240"+
    "\7\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\1\7\1\241\7\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\4\7\1\242"+
    "\4\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\6\7\1\243\2\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\2\7\1\244\6\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\5\7\1\245\10\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\1\7\1\246\14\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\6\7\1\247\2\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\4\7\1\250\4\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\4\7\1\251\4\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\1\7\1\252\14\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\3\7\1\253\5\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\10\7\1\254\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\11\7"+
    "\3\0\1\7\1\0\2\7\1\255\13\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\3\7\1\256\12\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\2\7\1\257\6\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\1\7\1\260\14\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\11\7"+
    "\3\0\1\7\1\0\3\7\1\261\12\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\11\7\3\0\1\7"+
    "\1\0\1\262\15\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\1\263\15\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\1\7"+
    "\1\264\7\7\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\1\7\1\265\7\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\1\266"+
    "\15\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\13\7\1\267\2\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\2\7\1\270"+
    "\6\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\11\7\3\0\1\7\1\0"+
    "\2\7\1\271\13\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\1\7\1\272\7\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\3\7\1\273\12\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\1\274\15\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\11\7\3\0\1\7\1\0\2\7"+
    "\1\275\13\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\4\7\1\276\4\7\3\0\1\7\1\0\16\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\1\7"+
    "\1\277\7\7\3\0\1\7\1\0\16\7\25\0\1\7"+
    "\4\0\2\7\1\0\1\7\1\0\4\7\1\300\4\7"+
    "\3\0\1\7\1\0\16\7\25\0\1\7\4\0\2\7"+
    "\1\0\1\7\1\0\4\7\1\301\4\7\3\0\1\7"+
    "\1\0\16\7\25\0\1\7\4\0\2\7\1\0\1\7"+
    "\1\0\11\7\3\0\1\7\1\0\3\7\1\302\12\7"+
    "\25\0\1\7\4\0\2\7\1\0\1\7\1\0\11\7"+
    "\3\0\1\7\1\0\15\7\1\303\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\4\7\1\304\4\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\11\7\3\0\1\7\1\0\3\7\1\305"+
    "\12\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\11\7\3\0\1\7\1\0\2\7\1\306\13\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\4\7\1\307"+
    "\4\7\3\0\1\7\1\0\16\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\2\7\1\310\6\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\4\0\2\7\1\0"+
    "\1\7\1\0\2\7\1\311\6\7\3\0\1\7\1\0"+
    "\16\7\25\0\1\7\4\0\2\7\1\0\1\7\1\0"+
    "\1\7\1\312\7\7\3\0\1\7\1\0\16\7\25\0"+
    "\1\7\4\0\2\7\1\0\1\7\1\0\11\7\3\0"+
    "\1\7\1\0\2\7\1\313\13\7\25\0\1\7\4\0"+
    "\2\7\1\0\1\7\1\0\2\7\1\314\6\7\3\0"+
    "\1\7\1\0\16\7\25\0\1\7\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8378];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\24\1\10\11\2\1\3\11"+
    "\2\1\3\11\1\1\1\11\3\0\1\11\16\1\1\0"+
    "\1\11\2\0\1\11\17\1\10\11\2\0\154\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[204];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  BallerinaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 77: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            }
          case 78: break;
          case 3: 
            { return BallerinaTypes.INTEGERLITERAL;
            }
          case 79: break;
          case 4: 
            { return BallerinaTypes.DOT;
            }
          case 80: break;
          case 5: 
            { return BallerinaTypes.IDENTIFIER;
            }
          case 81: break;
          case 6: 
            { return BallerinaTypes.ADD;
            }
          case 82: break;
          case 7: 
            { return BallerinaTypes.BACKTICK;
            }
          case 83: break;
          case 8: 
            { return BallerinaTypes.DIV;
            }
          case 84: break;
          case 9: 
            { return BallerinaTypes.SUB;
            }
          case 85: break;
          case 10: 
            { return BallerinaTypes.GT;
            }
          case 86: break;
          case 11: 
            { return BallerinaTypes.LT;
            }
          case 87: break;
          case 12: 
            { return BallerinaTypes.LPAREN;
            }
          case 88: break;
          case 13: 
            { return BallerinaTypes.RPAREN;
            }
          case 89: break;
          case 14: 
            { return BallerinaTypes.LBRACE;
            }
          case 90: break;
          case 15: 
            { return BallerinaTypes.RBRACE;
            }
          case 91: break;
          case 16: 
            { return BallerinaTypes.LBRACK;
            }
          case 92: break;
          case 17: 
            { return BallerinaTypes.RBRACK;
            }
          case 93: break;
          case 18: 
            { return BallerinaTypes.SEMI;
            }
          case 94: break;
          case 19: 
            { return BallerinaTypes.COMMA;
            }
          case 95: break;
          case 20: 
            { return BallerinaTypes.ASSIGN;
            }
          case 96: break;
          case 21: 
            { return BallerinaTypes.BANG;
            }
          case 97: break;
          case 22: 
            { return BallerinaTypes.TILDE;
            }
          case 98: break;
          case 23: 
            { return BallerinaTypes.QUESTION;
            }
          case 99: break;
          case 24: 
            { return BallerinaTypes.COLON;
            }
          case 100: break;
          case 25: 
            { return BallerinaTypes.BITAND;
            }
          case 101: break;
          case 26: 
            { return BallerinaTypes.BITOR;
            }
          case 102: break;
          case 27: 
            { return BallerinaTypes.MUL;
            }
          case 103: break;
          case 28: 
            { return BallerinaTypes.CARET;
            }
          case 104: break;
          case 29: 
            { return BallerinaTypes.MOD;
            }
          case 105: break;
          case 30: 
            { return BallerinaTypes.DOLLAR_SIGN;
            }
          case 106: break;
          case 31: 
            { return BallerinaTypes.AT;
            }
          case 107: break;
          case 32: 
            { return BallerinaTypes.FLOATINGPOINTLITERAL;
            }
          case 108: break;
          case 33: 
            { return BallerinaTypes.AS;
            }
          case 109: break;
          case 34: 
            { return BallerinaTypes.QUOTEDSTRINGLITERAL;
            }
          case 110: break;
          case 35: 
            { return BallerinaTypes.VALIDBACKTICKSTRING;
            }
          case 111: break;
          case 36: 
            { return BallerinaTypes.LINE_COMMENT;
            }
          case 112: break;
          case 37: 
            { return BallerinaTypes.IF;
            }
          case 113: break;
          case 38: 
            { return BallerinaTypes.SENDARROW;
            }
          case 114: break;
          case 39: 
            { return BallerinaTypes.GE;
            }
          case 115: break;
          case 40: 
            { return BallerinaTypes.RECEIVEARROW;
            }
          case 116: break;
          case 41: 
            { return BallerinaTypes.LE;
            }
          case 117: break;
          case 42: 
            { return BallerinaTypes.EQUAL;
            }
          case 118: break;
          case 43: 
            { return BallerinaTypes.NOTEQUAL;
            }
          case 119: break;
          case 44: 
            { return BallerinaTypes.AND;
            }
          case 120: break;
          case 45: 
            { return BallerinaTypes.OR;
            }
          case 121: break;
          case 46: 
            { return BallerinaTypes.TRY;
            }
          case 122: break;
          case 47: 
            { return BallerinaTypes.ALL;
            }
          case 123: break;
          case 48: 
            { return BallerinaTypes.ANY;
            }
          case 124: break;
          case 49: 
            { return BallerinaTypes.NEW;
            }
          case 125: break;
          case 50: 
            { return BallerinaTypes.BOOLEANLITERAL;
            }
          case 126: break;
          case 51: 
            { return BallerinaTypes.TYPE;
            }
          case 127: break;
          case 52: 
            { return BallerinaTypes.ELSE;
            }
          case 128: break;
          case 53: 
            { return BallerinaTypes.FORK;
            }
          case 129: break;
          case 54: 
            { return BallerinaTypes.NULLLITERAL;
            }
          case 130: break;
          case 55: 
            { return BallerinaTypes.JOIN;
            }
          case 131: break;
          case 56: 
            { return BallerinaTypes.THROW;
            }
          case 132: break;
          case 57: 
            { return BallerinaTypes.REPLY;
            }
          case 133: break;
          case 58: 
            { return BallerinaTypes.CATCH;
            }
          case 134: break;
          case 59: 
            { return BallerinaTypes.CONST;
            }
          case 135: break;
          case 60: 
            { return BallerinaTypes.BREAK;
            }
          case 136: break;
          case 61: 
            { return BallerinaTypes.WHILE;
            }
          case 137: break;
          case 62: 
            { return BallerinaTypes.THROWS;
            }
          case 138: break;
          case 63: 
            { return BallerinaTypes.RETURN;
            }
          case 139: break;
          case 64: 
            { return BallerinaTypes.ACTION;
            }
          case 140: break;
          case 65: 
            { return BallerinaTypes.IMPORT;
            }
          case 141: break;
          case 66: 
            { return BallerinaTypes.PUBLIC;
            }
          case 142: break;
          case 67: 
            { return BallerinaTypes.WORKER;
            }
          case 143: break;
          case 68: 
            { return BallerinaTypes.TIMEOUT;
            }
          case 144: break;
          case 69: 
            { return BallerinaTypes.SERVICE;
            }
          case 145: break;
          case 70: 
            { return BallerinaTypes.ITERATE;
            }
          case 146: break;
          case 71: 
            { return BallerinaTypes.PACKAGE;
            }
          case 147: break;
          case 72: 
            { return BallerinaTypes.VERSION;
            }
          case 148: break;
          case 73: 
            { return BallerinaTypes.RESOURCE;
            }
          case 149: break;
          case 74: 
            { return BallerinaTypes.FUNCTION;
            }
          case 150: break;
          case 75: 
            { return BallerinaTypes.CONNECTOR;
            }
          case 151: break;
          case 76: 
            { return BallerinaTypes.TYPECONVERTOR;
            }
          case 152: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
