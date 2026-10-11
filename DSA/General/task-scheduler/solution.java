class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:freq){
            if(x>0){
                pq.add(x);
            }
        }

        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int val=pq.poll();
                    val--;
                    if(val>0){
                        temp.add(val);
                    }
                }
                time++;
                if(pq.isEmpty() && temp.isEmpty()){
                    return time;
                }
            }
            for(int x:temp){
                pq.add(x);
            }
        }
        return time;
    }
}