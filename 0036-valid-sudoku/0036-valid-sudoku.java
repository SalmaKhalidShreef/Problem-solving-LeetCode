class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowFreq = new int[10];
        int[] colFreq = new int[10];
        HashMap<String,HashSet<Character>> boxFreq = new HashMap();
        
        for(int i =0;i<9;i++)
        {
            if(!validate(board[i],i))
                return false;
                
        }
        for(int i =0;i<9;i++)
        {
            char[] c = new char[10];
            for(int j = 0;j<9;j++)
            {
                c[j] = board[j][i];
            }
            
            if(!validate(c,i))
                return false;
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
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
    
    private boolean validate(char[] array, int i)
    {
        for(int x =0;x<9;x++)
            System.out.print(array[x]+" ");
        int[] rowFreq = new int[10];
        for(int j = 0;j<9;j++)
        {
            if(array[j]!='.')
            {
                rowFreq[array[j]-'0']++;
                if(rowFreq[array[j]-'0']>1) return false;                    
            }
        }
        
        return true;
    }
}