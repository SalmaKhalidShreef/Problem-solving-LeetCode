class Solution {
    boolean[] visited;
    List<List<Integer>> allRooms;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        allRooms = rooms;
        dfs(0);
        for(boolean roomVisited : visited)
            if(!roomVisited)
                return false;
        return true;
    }
    
    private void dfs(int room){
        if(visited[room])
            return;
        visited[room] = true;
        for(int accessibleRoom : allRooms.get(room)){
            dfs(accessibleRoom);
        }
    }
    
}