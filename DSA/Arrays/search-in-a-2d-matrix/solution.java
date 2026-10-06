class Solution {
    public static boolean binarySearch(int row,int[][] mat,int target){
        int start=0;
        int end=mat[0].length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mat[row][mid]==target) return true;
            else if(mat[row][mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(mat[i][0]<=target && mat[i][m-1]>=target){
                return binarySearch(i,mat,target);
            }
        }
        return false;
    }
}
