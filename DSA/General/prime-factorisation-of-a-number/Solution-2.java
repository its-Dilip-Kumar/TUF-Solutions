class Solution {
  public List<List<Integer>> primeFactors(int[] queries) {
    List<List<Integer>> ans=new ArrayList<>();
    for(int num:queries){
        List<Integer> temp=new ArrayList<>();
        int n=num;
        while(n%2==0){
            temp.add(2);
            n=n/2;
        }

        for(int j=3;j*j<=n;j+=2){
            while(n%j==0){
                temp.add(j);
                n=n/j;
            }
        }

        if(n>1){
            temp.add(n);
        }
        ans.add(temp);
    }
    return ans;
  }
}
