class Pair{
    int i;
    int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public char[][] fill(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(mat[i][j]=='O'){
                        q.add(new Pair(i,j));
                        mat[i][j]='#';
                    }
                }
            }
        }

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            Pair node=q.remove();
            int r=node.i;
            int c=node.j;

            for(int i=0;i<4;i++){
                int delrow=r+dr[i];
                int delcol=c+dc[i];

                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && mat[delrow][delcol]=='O'){
                    q.add(new Pair(delrow,delcol));
                    mat[delrow][delcol]='#';
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='#'){
                    mat[i][j]='O';
                }else{
                    mat[i][j]='X';
                }
            }
        }
        return mat;





    }
}