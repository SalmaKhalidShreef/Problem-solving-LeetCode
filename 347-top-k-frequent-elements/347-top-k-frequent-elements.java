class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>  hm = new HashMap();
        for(int i:nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (i1,i2) -> i1.getValue()-i2.getValue() );
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        //System.out.println(pq.toString());
        int[] res = new int[k];
        for(int i =0;i<k;i++)
            res[i]=(int)pq.poll().getKey();
        return res;
    }
}
