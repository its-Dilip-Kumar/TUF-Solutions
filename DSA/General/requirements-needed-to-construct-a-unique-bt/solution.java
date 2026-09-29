class Solution {
    public boolean uniqueBinaryTree(int a, int b) {
        if(a==2 && (b==1 || b==3)) return true;
        else if(b==2 && (a==1 || a==3)) return true;
        return false;
    }
}