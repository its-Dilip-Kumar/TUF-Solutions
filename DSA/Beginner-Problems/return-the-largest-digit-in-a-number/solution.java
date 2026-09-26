class Solution {
    public int largestDigit(int n) {
        int max=0;
        int num=n;
        while(num>0){
            int rem=num%10;
            max=Math.max(max,rem);
            num=num/10;
        }
        return max;
    }
}