import java.util.*;

class Solution {
    public String postToInfix(String postExp) {
        Stack<String> st = new Stack<>();

        // Left to right traverse karo
        for (int i = 0; i < postExp.length(); i++) {
            char ch = postExp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            // Operator
            else {
                String op2 = st.pop();   // Pehla pop = right operand
                String op1 = st.pop();   // Doosra pop = left operand

                // Infix: (op1 operator op2)
                String expr = "(" + op1 + ch + op2 + ")";
                st.push(expr);
            }
        }
        return st.pop();
    }
}