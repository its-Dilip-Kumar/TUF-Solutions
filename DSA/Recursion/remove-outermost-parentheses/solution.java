class Solution {
    public String removeOuterParentheses(String s) {
        int opne=0;
        String ans="";
        int n=s.length();
        int start=0;
        int open=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else if(ch==')'){
                open--;
                if(open==0){
                ans+=s.substring(start+1,i);
                start=i+1;
                }
            }
        }

        return ans;
    }
}