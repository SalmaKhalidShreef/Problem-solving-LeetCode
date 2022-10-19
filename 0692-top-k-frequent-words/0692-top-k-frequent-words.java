class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
         PriorityQueue<WordFrequency> pq =  
                              new PriorityQueue<>(k+1);
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            pq.add(new WordFrequency(entry.getKey(), entry.getValue()));
            if(pq.size()> k)
                pq.remove();
        }
        
        LinkedList<String> result = new LinkedList();
        while(!pq.isEmpty())
            result.addFirst(pq.remove().word);
        
        return result;
    }
   class WordFrequency implements Comparable<WordFrequency> {
    String word;
    int count;
    
    public WordFrequency(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    @Override
    public int compareTo(WordFrequency that) {
        int diff = this.count - that.count;
        
        return (diff != 0) ? diff : that.word.compareTo(this.word);
    }
   }
}