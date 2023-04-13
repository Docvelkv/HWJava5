/**
 * Дана последовательность скобочек.
 * Проверить, что она является корректной.
 */
public class Task {
    public static void main(String[] args) {
        String str = "String [^(<){InpStr = InpStr.}\\]\\[replaceAll(\"]+\",>\"\");"; // false
        String str1 = "(InpStr)"; // true
        String str2 = "repl(ace"; // false
        String str3 = "(String))"; // false
        String str4 = "(args((String)))"; // true
        String str5 = "()[InpStr\\]{}<>"; // true
        String str6 = "([InpStr.}\\)]"; // false
        String str7 = "]false[true]"; // false
        String str8 = "[]{<()[]<>>}"; // true

        System.out.println(Methods.isCorrectParentheses(str));
        System.out.println(Methods.isCorrectParentheses(str1));
        System.out.println(Methods.isCorrectParentheses(str2));
        System.out.println(Methods.isCorrectParentheses(str3));
        System.out.println(Methods.isCorrectParentheses(str4));
        System.out.println(Methods.isCorrectParentheses(str5));
        System.out.println(Methods.isCorrectParentheses(str6));
        System.out.println(Methods.isCorrectParentheses(str7));
        System.out.println(Methods.isCorrectParentheses(str8));
    }
}