class Solution {    
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int left=0;
        int right=0;
        int result=0;
        int[] freq=new int[3];
        while(right<n){
            char ch=s.charAt(right);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                result+=n-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}