class Solution {
    public void rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        //transpose
        int[][] transpose=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        //swapping cols
        for(int i=0;i<n;i++){
            int left=0;
            int right=m-1;
            while(left<right){
                int temp=transpose[i][left];
                transpose[i][left]=transpose[i][right];
                transpose[i][right]=temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=transpose[i][j];
            }
        }
    }
}