class Solution {    
    public String longestCommonPrefix(String[] str) {
        int n=str.length;
        Arrays.sort(str);
        String str1=str[0];
        String str2=str[n-1];
        int i;
        for(i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return str1.substring(0,i);
            }
        }
        return str1.substring(0,i);

    }
}