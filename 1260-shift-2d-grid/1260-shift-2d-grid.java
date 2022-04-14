class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int r=grid.length;
        int c=grid[0].length;        
        int[][] temp = new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int newIndex = (i*c+j+ k) % (r*c);
                int newr = newIndex / c;
                int newc = newIndex % c;
                temp[newr][newc] = grid[i][j];
            }
        }
        
        

         return (List)Arrays.asList(temp);
        
    }
}