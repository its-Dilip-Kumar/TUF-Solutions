class Solution {
    public static void solve(Stack<Integer> st,int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top=st.pop();
        solve(st,element);
        st.push(top);
    }
    public void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        solve(st,top);
    }
}