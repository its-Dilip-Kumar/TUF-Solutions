class Solution {
    public static int solve(int sum,int num){
        if(num==0) return sum;
        sum+=num%10;
        return solve(sum,num/10);
    }
    public int addDigits(int num) {
        while(num/10!=0){
            num=solve(0,num);
        }
        return num;
    }
}