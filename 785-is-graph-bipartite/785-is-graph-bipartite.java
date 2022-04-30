class Solution {
    int[][]g;
    int[]colors;
    public boolean isBipartite(int[][] graph) {
        g=graph;
        colors=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(colors[i]==0 && !isValid(i,1)) 
                return false;
        }
        return true;
    }
    private boolean isValid(int node , int color){
        if(colors[node]!=0){
            return colors[node]==color;
        }
        colors[node]=color;
        for(int adj:g[node]){
            if(!isValid(adj,-color))
                return false;
        }
        return true;
    }
}