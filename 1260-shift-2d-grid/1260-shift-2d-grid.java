class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int r=grid.length;
        int c=grid[0].length;        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i =0;i<r;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j =0;j<c;j++)
                list.add(0);
            result.add(list);
        }
        
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int newFlatIdx = (i*c+j+ k) % (r*c);
                int newi = newFlatIdx / c;
                int newj = newFlatIdx % c;
                result.get(newi).set(newj,grid[i][j]);
            }
        }
        

        return result;
        
    }
}