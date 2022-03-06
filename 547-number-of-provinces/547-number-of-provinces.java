class Solution {
    private static int provinces =0;
    private static int[][] graph;
    private static boolean []visited;
    public int findCircleNum(int[][] isConnected) {
        provinces=0;
        graph = isConnected;
        visited=new boolean[isConnected.length];
        for(int city=0;city< graph.length;city++){
            if(!visited[city]){
                provinces++;
                dfs(city);
            }
        }
        return provinces;
    }
    private void dfs(int city){
        visited[city]=true;
        for(int city2=0;city2<graph[city].length;city2++){
            if(city!=city2 && graph[city][city2]==1 && !visited[city2]){
                dfs(city2);
            }
        }
    }
}