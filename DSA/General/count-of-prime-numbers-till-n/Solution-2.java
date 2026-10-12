class Solution {
    public static int[] countPrime(int n){
        int[] prime=new int[n+1];
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        return prime;
    }
    public int primeUptoN(int n) {
        int start=1;
        int end=n;
        int count=0;
        int[] prime=countPrime(n);
        for(int i=start;i<=end;i++){
            if(prime[i]==1){
                count++;
            }
        }
        return count;
    }
}