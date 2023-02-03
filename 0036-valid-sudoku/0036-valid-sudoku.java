class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowFreq = new int[10];
        int[] colFreq = new int[10];
        HashMap<String,HashSet<Character>> boxFreq = new HashMap();
        for(int i =0;i<board.length;i++){
            rowFreq = new int[10];
            colFreq = new int[10];
            for(int j =0;j<board.length;j++)
            {
                if(board[j][i]!='.')
                {
                    colFreq[board[j][i]-'0']++;
                    if(colFreq[board[j][i]-'0']>1) return false;
                }
                if(board[i][j]!='.')
                {
                    rowFreq[board[i][j]-'0']++;
                    if(rowFreq[board[i][j]-'0']>1) return false;
                    
                    if(boxFreq.containsKey(i/3+","+j/3))
                    {
                        if(boxFreq.get(i/3+","+j/3).contains(board[i][j]))
                            return false;
                        boxFreq.get(i/3+","+j/3).add(board[i][j]);

                        
                    }
                    
                    else
                    {
                        boxFreq.put(i/3+","+j/3,new HashSet<Character>());
                        boxFreq.get(i/3+","+j/3).add(board[i][j]);
                    }
                }
                
               
                    
            }
        }
        
        
        return true;
    }
}