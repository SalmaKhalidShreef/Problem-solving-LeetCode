 class Solution {
//making the result static here to avoid sending in in each recursive call->save more space    
    static int [] res; 
    List<List<Integer>> graph;
    static boolean [] visited ;
    int lastCourse;
    HashSet recStack;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        visited = new boolean[numCourses];
        lastCourse= 0;
        graph = new ArrayList();
        res= new int[numCourses];
        
        for(int i =0;i<numCourses;i++)
            graph.add(new ArrayList());
        
        for(int i =0; i <prerequisites.length;i++)
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        
        for(int i =0;i<graph.size() ;i++){
            System.out.println(i+" pre "+graph.get(i).toString());

        }
                        recStack= new HashSet();

        for(int i =0; i <graph.size();i++){
            if(!visited[i]){
                if(visitCourse(i,recStack)){
                 // System.out.println("ANA 3abeet awi");
                    int[] emptyRes = new int[0];
                    return emptyRes;
                }
            }
        }
        for(int i =0;i<numCourses;i++)
             System.out.print(res[i]+" ");
        return res;
        
    }
    public boolean visitCourse(int course , HashSet recStack){
       // System.out.println("rec call for course"+course +recStack);
        if(visited[course] && !recStack.contains(course)) 
            return false;
        if(recStack.contains(course)){
          // System.out.println(course+"in recstack" + recStack);
            return true;
        }
        recStack.add(course);
        
        visited[course]= true;
        for(int i =0;i<graph.get(course).size();i++){
            if(visitCourse(graph.get(course).get(i),recStack))
                return true;
        }
        //System.out.println(course+" "+"lastCourse "+lastCourse);
        res[lastCourse]=course;
        lastCourse++;
        recStack.remove(course);
        System.out.println("recStack"+recStack);
        return false;
    }
    
}