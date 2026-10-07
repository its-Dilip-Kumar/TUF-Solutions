class ArrayQueue {
    int start;
    int end;
    int size;
    int[] arr;

    public ArrayQueue() {
        start = -1;
        end = -1;
        size = 0;
        arr = new int[100];   // ✅ Bada size
    }

    public void push(int x) {
        if (isEmpty()) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % arr.length;   // ✅ Circular
        }
        arr[end] = x;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue empty");
        }
        int val = arr[start];
        size--;

        if (size == 0) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % arr.length;   // ✅ Circular
        }
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue empty");
        }
        return arr[start];
    }

    public boolean isEmpty() {
        return size == 0;   // ✅
    }
}