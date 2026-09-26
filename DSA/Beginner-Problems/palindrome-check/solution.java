class Solution {  
    public static boolean isPalindrome(int start, int end, String s){
        if(start>=end) return true;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
    public boolean palindromeCheck(String s) {
        int n=s.length();
        return isPalindrome(0,n-1,s);
    }
}