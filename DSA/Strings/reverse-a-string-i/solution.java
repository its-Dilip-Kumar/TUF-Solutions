class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        ArrayList<Character> ans=new ArrayList<>();
        solve(s,ans,0);
        return ans;
    }
    public static void solve(ArrayList<Character> s,ArrayList<Character> ans,int i){
        if(i>=s.size()) return;

        ans.add(0,s.get(i));

        solve(s,ans,i+1);
    }
}