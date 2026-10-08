import java.util.*;

class Solution {
    public String prefixToPostfix(String s) {
        Stack<String> st = new Stack<>();

        // Right to left traverse
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            // Operator
            else {
                String op1 = st.pop();   // Pehla operand
                String op2 = st.pop();   // Doosra operand

                // Postfix: op1 + op2 + operator
                String expr = op1 + op2 + ch;
                st.push(expr);
            }
        }
        return st.pop();
    }
}