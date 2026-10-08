class Pair{
    int val;
    int min;
    public Pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st=new Stack<Pair>();
    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
        }else{
            int currMin=Math.min(val,st.peek().min);
            st.push(new Pair(val,currMin));
        }
    }

    public void pop() {
        if(st.isEmpty()){
            return;
        }
        st.pop();
    }

    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek().val;
    }

    public int getMin() {
        if(st.isEmpty()) return -1;
        return st.peek().min;
    }
}