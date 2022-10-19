class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
         PriorityQueue<Pair<String, Integer>> pq =  
                              new PriorityQueue<>(new PairComparator());
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            pq.add(new Pair<>(entry.getKey(), entry.getValue()));
            if(pq.size()> k)
                pq.remove();
        }
        
        LinkedList<String> result = new LinkedList();
        while(!pq.isEmpty())
            result.addFirst(pq.remove().getKey());
        
        return result;
    }
    class PairComparator implements Comparator<Pair<String,Integer>>{
            public int compare(Pair<String,Integer> p1, Pair<String,Integer> p2) {
                if(Integer.compare(p1.getValue(), p2.getValue())== 0)
                    return p2.getKey().compareTo(p1.getKey());
                return Integer.compare(p1.getValue(), p2.getValue());   
                }
        }
}