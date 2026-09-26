class Solution {
    public int reverseNumber(int n) {
        int num=n;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        return sum;
    }
}