class Solution{
    public int countOdd(int[] arr, int n) {
        int count=0;
        for(int x:arr){
            if(x%2!=0) count++;
        }
        return count;
    }
}