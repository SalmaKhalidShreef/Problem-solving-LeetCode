class Solution {
    public int findCircleNum(int[][] isConnected) {
        int connected=0;
        int[] visited = new int[isConnected.length];
        for(int i =0;i<isConnected.length;i++){
                if(visited[i]==0){
                dfs(isConnected,i,visited);
                connected++;}
            
        }
    return connected;}
    public void dfs(int[][]grid,int i ,int[] visited){
        for(int j=0;j<grid.length;j++){
            if (grid[i][j]==1 && visited[j]==0){
                visited[j]=1;
                dfs(grid,j,visited);

            }
        }
        }
        
        
    
}