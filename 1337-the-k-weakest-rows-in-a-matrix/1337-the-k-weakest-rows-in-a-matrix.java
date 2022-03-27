class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

         PriorityQueue<Row> pq = new PriorityQueue<Row>(new RowComparator());
         for(int i =0 ;i < mat.length;i++){
             int sold=0;
             for(int j =0;j<mat[i].length;j++){
                 if(mat[i][j]==0)
                     break;
                 else
                     sold++;
             }
             pq.add(new Row(i,sold));
             if(pq.size()>k)
                 pq.poll();
         }
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll().idx;
        }
        return res;
    }
    
}
class Row {
    int idx;
    int sold;
    public Row(int idx , int sold){
        this.idx=idx;
        this.sold=sold;
    }
}
class RowComparator implements Comparator<Row>{
            public int compare(Row r1, Row r2) {
                if (r1.sold < r2.sold)
                    return 1;
                else if (r1.sold >r2.sold)
                    return -1;          
                int c = r1.idx<r2.idx?1:-1;
                return c;
                
                }
        }