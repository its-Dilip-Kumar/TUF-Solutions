class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) result.add(i);
        }
        int[] ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}