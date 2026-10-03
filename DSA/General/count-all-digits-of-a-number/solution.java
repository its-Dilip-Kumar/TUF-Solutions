class Solution {
    public int countDigit(int n) {
        int count=0;
        if(n==0) return count+1;
        while(n!=0){
            count++;
            n=n/10;
        }

        return count;
    }
}