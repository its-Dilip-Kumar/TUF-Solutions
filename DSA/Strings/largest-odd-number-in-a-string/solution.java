class Solution {    
    public String largeOddNum(String s) {
        int n=s.length();
        int end=-1;
        for(int i=n-1;i>=0;i--){
            int digit = s.charAt(i) - '0'; 
            if(s.charAt(i)%2!=0){
                end=i;
                break;
            }
        }

        if(end==-1) return "";

        int start=0;
        while(start<n && s.charAt(start)=='0'){
            start++;
        }
        if(start>end) return "";
        return s.substring(start,end+1);
    }
}