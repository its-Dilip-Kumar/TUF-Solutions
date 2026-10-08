import java.util.*;

class Solution {

    private int priority(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public String infixToPrefix(String s) {
        // Step 1: Reverse
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        // Step 2: Swap brackets
        char[] arr = reversed.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') arr[i] = ')';
            else if (arr[i] == ')') arr[i] = '(';
        }
        String swapped = new String(arr);

        // Step 3: Infix to Postfix (with reversed associativity)
        String postfix = infixToPostfixReversed(swapped);

        // Step 4: Reverse
        return new StringBuilder(postfix).reverse().toString();
    }

    // Infix to Postfix for REVERSED string
    private String infixToPostfixReversed(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            } else {
                // ✅ Reversed associativity: ch == '^'
                while (!st.isEmpty() && 
                       (priority(ch) < priority(st.peek()) || 
                        (priority(ch) == priority(st.peek()) && ch == '^'))) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }
}