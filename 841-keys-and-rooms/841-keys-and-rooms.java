class Solution {
    static boolean[] visited;
    static List<List<Integer>> graph;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean [rooms.size()];
        graph = rooms;
        dfs(0);
        for(int node=0;node<graph.size();node++)
        {
            if(!visited[node])
                return false;
        }
        return true;
    }
    public void dfs(int idx){
        visited[idx]= true;
        for(int child:graph.get(idx)){
            if(!visited[child])
                dfs(child);
        }
    }
}