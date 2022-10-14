class Solution {
    boolean[] visited;
    int[][] cities;
    public int findCircleNum(int[][] isConnected) {
        cities = isConnected;
        visited = new boolean[cities.length];
        int provs = 1;
        dfs(0);
        for(int i =1; i< visited.length;i++){
            if(!visited[i]){
                provs++;
                dfs(i);
            }
        }
        
        return provs;
    }
    
    private void dfs(int city){
        if(visited[city])
            return;
        visited[city] = true;
        for(int nei=0 ;nei<cities[city].length;nei++){
            if(cities[city][nei]==1)
                dfs(nei);
        }
    }
    
}