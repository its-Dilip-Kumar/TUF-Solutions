class Solution {
    public static int GCD(int n1,int n2){
        if(n2==0) return n1;
        return GCD(n2,n1%n2);
    }
    public int LCM(int n1, int n2) {
        return (n1*n2)/GCD(n1,n2);
    }
}