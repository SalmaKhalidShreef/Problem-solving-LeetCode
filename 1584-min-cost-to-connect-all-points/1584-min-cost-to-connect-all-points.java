class Solution {
    public int minCostConnectPoints(int[][] points) {
        Vertex[] verticies = new Vertex[points.length];
        boolean[] q = new boolean[points.length];
        PriorityQueue<Vertex> queue = new PriorityQueue<>(new VertexComparator());
        Vertex v = new Vertex(points[0][0],points[0][1],0);
        v.key=0;
        q[v.idx]=true;
        verticies[0]=v;
        queue.add(v);
        for(int i =1;i<points.length;i++){
            Vertex vertex = new Vertex(points[i][0],points[i][1],i);
            verticies[i]=vertex;
            q[vertex.idx]=true;
        }
        int m=0;
        while(!queue.isEmpty()){
            m++;
            Vertex vertex = queue.poll();
            System.out.println(vertex.key);
            q[vertex.idx]=false;
            for(int i =0;i<points.length;i++){
                if(q[i]){
                    int x = Math.abs(vertex.x-points[i][0]);
                    int y = Math.abs(vertex.y-points[i][1]);
                    if(x+y<verticies[i].key){
                        verticies[i].key=x+y; 
                        queue.add(new Vertex(points[i][0],points[i][1],i,x+y));
                    }
                }

            }
        }
        int c=0;
        for (Vertex v2 : verticies)
            c+=v2.key;
        
        return c;
    }
}
class VertexComparator implements Comparator<Vertex>{
     public int compare(Vertex v1, Vertex v2) {
                if (v1.key < v2.key)
                    return -1;
                else if (v1.key > v2.key)
                    return 1;
                               
                return 0;
                }
}
class Vertex  {
    int idx;
    int key;
    int x;
    int y;
    public Vertex(int x,int y , int idx){
        this.x=x;
        this.y=y;
        this.idx=idx;
        this.key=Integer.MAX_VALUE;
    }
     public Vertex(int x,int y , int idx,int key){
        this.x=x;
        this.y=y;
        this.idx=idx;
        this.key=key;
    }
   
}