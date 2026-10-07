class Solution {
    public int longestNonRepeatingSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<n){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            maxlen=Math.max(maxlen,right-left+1);
            map.put(ch,right);
            right++;
        }
        return maxlen;
    }
}