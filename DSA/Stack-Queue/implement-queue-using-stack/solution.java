import java.util.*;

class StackQueue {
    Stack<Integer> s;

    public StackQueue() {
        s = new Stack<>();
    }

    // Push: O(n) — naye element ko bottom mein daalo
    public void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        push(x);           // Recursively bottom mein daalo
        s.push(top);       // Wapas push karo
    }

    // Pop: O(1)
    public int pop() {
        if (s.isEmpty()) return -1;
        return s.pop();
    }

    // Peek: O(1)
    public int peek() {
        if (s.isEmpty()) return -1;
        return s.peek();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }
}