class Solution {
    static int[][] temp;
    public void gameOfLife(int[][] board) {
        temp = new int[board.length][board[0].length];
         for(int i =0;i<board.length;i++){
             for(int j =0;j<board[0].length;j++)
                 temp[i][j]=board[i][j];
         }
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                board[i][j]=check(i,j);
            }
                
        }
    }
    

private static int check(int i , int j){
    int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
    int c=0;
        for(int x =0 ;x<dir.length;x++){
            int newi=i+dir[x][0];
            int newj=j+dir[x][1];
            if(newi>=0 && newi<temp.length && newj >=0 && newj<temp[0].length){
               
                if(temp[newi][newj]==1)
                    c+=1;
              }
        }

        int past = temp[i][j];
       if ((past==0 && c==3) || (past==1 && (c==2 || c==3)))
           return 1;
        else 
            return 0;
    
}
}