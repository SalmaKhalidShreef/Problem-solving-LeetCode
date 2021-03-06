class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, Collections.reverseOrder());
    for(int i :stones) pq.add(i);
    while(pq.size()>1){
        int x = pq.poll(), y = pq.poll();
        if(x>y)
            pq.add(x-y);
    }
        if(pq.size()>0)
            return pq.poll();
        return 0;
    }
}