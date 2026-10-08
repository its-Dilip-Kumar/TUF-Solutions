import java.util.*;

class Solution {
    public String prefixToInfix(String s) {
        Stack<String> st = new Stack<>();

        // Right to left traverse karo
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

                // Infix expression banao
                String expr = "(" + op1 + ch + op2 + ")";
                st.push(expr);
            }
        }
        return st.pop();
    }
}