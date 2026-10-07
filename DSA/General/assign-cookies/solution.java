class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        int n=Student.length;
        int m=Cookie.length;
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int left=0;
        int right=0;
        while(left<n && right<m){
            if(Cookie[right]>=Student[left]){
                left++;
            }
            right++;
        }
        return left;
    }
}