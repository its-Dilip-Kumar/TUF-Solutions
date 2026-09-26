class Solution {
    public int countOddDigit(int n) {
        int num=n;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem%2!=0) count++;
            num=num/10;
        }
        return count;
    }
}