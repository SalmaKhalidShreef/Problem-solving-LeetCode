class Solution {
    static int[] dist;
    static List<String> words;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //Initialization 
        if(!wordList.contains(endWord))
            return 0;
        wordList.add(beginWord);
        final int N = wordList.size();
        words=wordList;
        dist = new int[N];
            for(int i =0;i<N;i++)
                dist[i]=Integer.MAX_VALUE;
        dist[N-1]=1;
        bfs(N-1);
        for(int i=0;i<N;i++){
            if(wordList.get(i).equals(endWord)&& dist[i]!=Integer.MAX_VALUE)
                return dist[i];
        }
        return 0;
            
        
    }
    public void bfs(int node){
         Queue<Integer> q = new LinkedList();
        q.add(node);
        
        int maximum = Integer.MAX_VALUE;
        
        while(!q.isEmpty()){
            int currNode = q.poll();
        for(int i =0; i <words.size();i++){
            if(dist[i]==maximum && isNext(words.get(currNode), words.get(i))){
                System.out.println(words.get(currNode) +" "+ words.get(i));

                dist[i]=dist[currNode]+1;
             System.out.println(dist[currNode] +" "+ dist[i]);

                q.add(i);
            } 
            //  System.out.println(isNext(words.get(currNode), words.get(i)));

        }
        
        }
    }
    public boolean isNext(String start ,String end ){
        int diff=0;
        //if(start.length)
        int len = Math.min(start.length(),end.length());
        for(int i =0;i<len;i++){
            if(start.charAt(i)!=end.charAt(i)) diff++;
            if(diff >1) return false;
        }
        if(diff ==0){
            if(start.length()-end.length()==1 || start.length()-end.length()==-1)
                return true;
        }
        if(diff == 1) 
            return true;
        return false;
        
    }
}