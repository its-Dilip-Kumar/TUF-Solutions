class Solution {
    public int[][] insertNewInterval(int[][] Intervals, int[] newInterval) {
        int n=Intervals.length;
        ArrayList<int[]> ans=new ArrayList<>();
        int i=0;
        while(i<n && Intervals[i][1]<newInterval[0]){
            ans.add(Intervals[i]);
            i++;
        }

        while(i<n && Intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(Intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(Intervals[i][1],newInterval[1]);
            i++;
        }

        ans.add(newInterval);
        while(i<n){
            ans.add(Intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}