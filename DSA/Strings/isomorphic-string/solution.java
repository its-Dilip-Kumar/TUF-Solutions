class Solution {
    public boolean isomorphicString(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> mapped=new HashSet<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }else{
                if(mapped.contains(ch2)){
                    return false;
                }
                map.put(ch1,ch2);
                mapped.add(ch2);
            }
        }
        return true;
    }
}