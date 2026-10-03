class Solution {   
    public boolean palindromeCheck(String s) {
        return solve(s,0);
    }
    public static boolean solve(String s,int i){
        if(i>s.length()/2) return true;
        if(s.charAt(s.length()-i-1)!=s.charAt(i)) return false;

        return solve(s,i+1);
    }
}