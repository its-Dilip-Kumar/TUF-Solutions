import java.util.*;

class Solution {
    public String postToPre(String postfix) {
        Stack<String> st = new Stack<>();

        // Left to right traverse
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            // Operator
            else {
                String op2 = st.pop();   // Pehla pop = right operand
                String op1 = st.pop();   // Doosra pop = left operand

                // Prefix: operator + op1 + op2
                String expr = ch + op1 + op2;
                st.push(expr);
            }
        }
        return st.pop();
    }
}