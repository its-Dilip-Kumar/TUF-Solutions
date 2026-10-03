class Solution {   
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int n=s.length();
        for(int i=0;i<n;i++){
            String st1=s.substring(0,i);
            String str2=s.substring(i,n);
            String newString=str2+st1;
            if(newString.equals(goal)) return true;
        }
        return false;
    }
}