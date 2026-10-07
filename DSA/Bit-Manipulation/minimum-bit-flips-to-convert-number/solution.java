class Solution {
    public int minBitsFlip(int start, int goal) {
        int xor=start^goal;
        return minBitsFlip(xor);
    }
    public static int minBitsFlip(int n){
        int count=0;
        while(n!=0){
            if((n & 1)==1) count++;
            n=n>>1;
        }
        return count;
    }
}