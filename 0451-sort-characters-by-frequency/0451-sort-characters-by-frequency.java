class Solution {
    public String frequencySort(String s) {
        StringBuilder[] freq = new StringBuilder[100];
        for(char c : s.toCharArray()){
            // System.out.println(c-0);
            // System.out.println('A'-0);
            // System.out.println('0'-0);
            if(freq[c-'0'] == null)
            {
                freq[c-'0'] = new StringBuilder(c+"");
            }
            else
                freq[c-'0'] = freq[c-'0'].append(c);
        }
        PriorityQueue<StringBuilder> pq =new PriorityQueue<>((x, y) -> y.length()-x.length());
        for(int i =0;i<100;i++){
            if(freq[i]!=null)
                pq.add(freq[i]);
        }
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            res.append(pq.poll());
        }
        
        return res.toString();
    }
}