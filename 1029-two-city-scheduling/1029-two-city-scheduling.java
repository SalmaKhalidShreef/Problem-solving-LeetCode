class Solution {

    /* pq1 -> 184 259 448 577 840 926
       pq2 -> 54  118 139 469 667 770
       54+184+118+259+139+448+469+668+770
    */
    public int twoCitySchedCost(int[][] costs) {
        int k = costs.length/2;
        PriorityQueue<Trip> pq = new PriorityQueue<Trip>(new TripComparator());
        for(int i =0; i<costs.length;i++){
            pq.add(new Trip(costs[i][0],costs[i][1]));
        }
        int res=0;

        for(int i =0;i < k ; i++){
          res+=pq.poll().city1;
        }
        
        for(int i =0;i < k ; i++){
          res+=pq.poll().city2;
        }
return res;
    }
}
class Trip {
    int city1;
    int city2;
    public  Trip(int cost , int idx){
        this.city1=cost;
        this.city2=idx;
    }
}
class TripComparator implements Comparator<Trip>{
    public int compare (Trip t1, Trip t2){
        return(t2.city2-t2.city1-(t1.city2-t1.city1));
    }
}