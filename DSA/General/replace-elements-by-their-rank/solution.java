class Solution {
    public List<Integer> replaceWithRank(List<Integer> arr) {
        List<Integer> temp=new ArrayList<>(arr);
        int n=arr.size();
        Collections.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(i>0 && temp.get(i)>temp.get(i-1)){
                rank=rank+1;
            }
            map.put(temp.get(i),rank);
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(map.get(arr.get(i)));
        }
        return ans;
    }
}
