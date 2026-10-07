class ArrayStack {
    public int top;
    public int[] st;
    public ArrayStack() {
        top=-1;
        st=new int[10];
    }

    public void push(int x) {
       top++;
       st[top]=x;
    }

    public int pop() {
        int val=st[top];
        top=top-1;
        return val;
    }

    public int top() {
        return st[top];
    }

    public boolean isEmpty() {
        return top==-1;
    }

}
