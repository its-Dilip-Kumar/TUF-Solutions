class Solution {
    public void pattern10(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}