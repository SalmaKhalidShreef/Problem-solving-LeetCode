class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occur = new HashMap();
        
        for(int num : nums)
            occur.put(num,occur.getOrDefault(num,0)+1);
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
            new PriorityQueue<>((e1,e2)->e1.getValue()-e2.getValue());
        
        for(Map.Entry<Integer,Integer> entry : occur.entrySet())
        {
            pq.offer(entry);
            
            if(pq.size()>k)
                pq.poll();
        }
        
        int[] res = new int[k];
        for(int i =0;i<k;i++)
            res[i]=(int)pq.poll().getKey();
        return res;
        
        
    }
}