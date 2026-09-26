class Solution {
    public void pattern12(int n) {
        for(int i=0;i<n;i++){
            //number
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            //space
            for(int j=0;j<2*n-(2*i+2);j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            System.out.println();

        }
    }
}