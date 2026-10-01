class Solution {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
        public ArrayList<Integer> primeTillN(int n) {
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    ans.add(i);
                }
            }
            return ans;
        }
}
