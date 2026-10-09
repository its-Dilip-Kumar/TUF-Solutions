class Pair{
    int value;
    int idx;
    public Pair(int value,int idx){
        this.value=value;
        this.idx=idx;
    }
}
class Solution {
    public int[] stockSpan(int[] arr, int n) {
        Stack<Pair> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek().value<=arr[i]){
                st.pop();
            }

            ans[i]=st.isEmpty() ? i+1 : i-st.peek().idx;
            st.push(new Pair(arr[i],i));
        }
        return ans;
    }
}

