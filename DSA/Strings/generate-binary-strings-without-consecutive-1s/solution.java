class Solution {
    public static void solve(int n,List<String> ans,String curr,char prev){
        if(curr.length()==n){
            ans.add(curr);
            return;
        }

        solve(n,ans,curr+"0",'0');
        if(prev!='1'){
            solve(n,ans,curr+"1",'1');
        }
    }
    public List<String> generateBinaryStrings(int n) {
        List<String> ans=new ArrayList<>();
        solve(n,ans,"",'0');
        return ans;
    }
}