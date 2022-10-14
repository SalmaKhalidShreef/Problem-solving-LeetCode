class Solution {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack();
        visited[0] = true;
        stack.push(0);
        
        while(!stack.isEmpty()){
            int room = stack.pop();
            for(int neighbour : rooms.get(room)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    stack.push(neighbour);
                }
            }
        }
        for(boolean roomVisited : visited){
            if(!roomVisited)
                return false;
        }
        return true;
    }
    
}