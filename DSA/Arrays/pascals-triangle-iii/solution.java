class Solution {
    public static List<Integer> everyRow(int n){
        List<Integer> result=new ArrayList<>();
        long ans=1;
        result.add((int)ans);
        for(int i=0;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
            result.add((int) ans);
        }
        return result;
    }
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(everyRow(i));
        }
        return result;
    }
}