import java.util.*;

class QueueStack {
    Queue<Integer> q;

    public QueueStack() {
        q = new LinkedList<>();
    }

    // Push: O(n) — naye element ko front mein lao
    public void push(int x) {
        q.add(x);
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());   // Purane elements peeche bhejo
        }
    }

    // Pop: O(1)
    public int pop() {
        if (q.isEmpty()) return -1;
        return q.poll();
    }

    // Top: O(1)
    public int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}