class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(hand[i])){
                map.put(hand[i],map.get(hand[i])+1);
            }else{
                map.put(hand[i],1);
            }
        }

        while(!map.isEmpty()){
            int first=map.firstKey();
            for(int i=0;i<groupSize;i++){
                int next=first+i;
                if(!map.containsKey(next)) return false;
                map.put(next,map.get(next)-1);
                if(map.get(next)==0) map.remove(next);
            }
        }
        return true;
    }
}
