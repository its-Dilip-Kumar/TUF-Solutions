class Solution {
    public boolean isPalindrome(int n) {
        int sum=0;
        int num=n;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        return sum==n;
    }
}