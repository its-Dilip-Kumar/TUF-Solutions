class LinkedListQueue {

    // Node class
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node front;   // Front of queue
    Node rear;    // Rear of queue

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    // Push: Rear par add karo
    public void push(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            // Queue khaali hai
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Pop: Front se remove karo
    public int pop() {
        if (isEmpty()) return -1;

        int val = front.val;
        front = front.next;

        if (front == null) {
            rear = null;   // Queue khaali ho gayi
        }
        return val;
    }

    // Peek: Front element dekho
    public int peek() {
        if (isEmpty()) return -1;
        return front.val;
    }

    // isEmpty
    public boolean isEmpty() {
        return front == null;
    }
}