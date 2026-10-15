class Solution {
  public ArrayList<Integer> primesInRange(ArrayList<int[]> queries) {
    ArrayList<Integer> ans=new ArrayList<>();
    int maxval=0;
    for(int i=0;i<queries.size();i++){
        maxval=Math.max(maxval,queries.get(i)[1]);
    }
    int[] prime=new int[maxval+1];
    Arrays.fill(prime,1);
    prime[0]=0;
    prime[1]=0;

    for(int i=2;i*i<=maxval;i++){
        if(prime[i]==1){
            for(int j=i*i;j<=maxval;j+=i){
                prime[j]=0;
            }
        }
    }

    int[] prefix=new int[maxval+1];
    for(int i=1;i<=maxval;i++){
        prefix[i]=prefix[i-1]+prime[i];
    }


    for(int[] query:queries){
        int start=query[0];
        int end=query[1];
        int count=prefix[end];
        if(start>0) count-=prefix[start-1];
        ans.add(count);
    }
    return ans;
  }
}
