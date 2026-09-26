class Solution {
    public void reverseString(List<Character> s) {
        int n=s.size();
        for(int i=0;i<s.size()/2;i++){
            char temp=s.get(i);
            s.set(i,s.get(n-i-1));
            s.set(n-i-1,temp);
        }
    }
}