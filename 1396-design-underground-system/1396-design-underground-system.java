class UndergroundSystem {
    HashMap<Integer,CheckIn> checkIns;
    HashMap<String,Map<String,Trip>> trips;
    public UndergroundSystem() {
        checkIns= new HashMap();
        trips=new HashMap();
    }
    
    public void checkIn(int id, String stationName, int t) {
        CheckIn check= new CheckIn(stationName,t);
        checkIns.put(id,check);
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckIn check = checkIns.get(id);
        Trip trip;
        Map innerMap=null;
        if(trips.containsKey(check.city)){
            if(trips.get(check.city).containsKey(stationName)){
                innerMap= trips.get(check.city);
                trip= (Trip)innerMap.get(stationName);
                trip.addTrip(t-check.time);
                trips.put(check.city,innerMap);
            }
            else{
                trip=new Trip(t-check.time);
                trip.addTrip(t-check.time);
                trips.get(check.city).put(stationName,trip);
            }
        }
        else{
            trip = new Trip(t-check.time);
            trip.addTrip(t-check.time);
            innerMap=new HashMap();
            innerMap.put(stationName,trip);
            trips.put(check.city,innerMap);

        }
        
        checkIns.remove(id);

    }
    
    public double getAverageTime(String startStation, String endStation) {
        return trips.get(startStation).get(endStation).avgTime;
    }

}


class CheckIn{
    String city;
    int time;
    public CheckIn(String city,int time){
        this.city=city;
        this.time=time;
    }
}


class Trip{
    double tripsCnt;
    int times;
    double avgTime;
    public Trip(int tripTime){
        this.tripsCnt=0;
        this.times=0;
        this.avgTime=0;
    }
    public void addTrip(int tripTime){
        this.tripsCnt+=1;
        this.times+=tripTime;
        this.avgTime=this.times/tripsCnt;
    }
}
/**
        System.out.println(startStation+" "+endStation);
        System.out.println(trips.get(startStation));
        System.out.println(trips.get(startStation).get(endStation));
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 ["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","getAverageTime","checkIn","getAverageTime","getAverageTime","checkOut"]
[[],[37043,"K2618O72",29],[37043,"U1DTINDT",39],["K2618O72","U1DTINDT"],[779975,"K2618O72",112],[779975,"CN3K6CYM",157],["K2618O72","U1DTINDT"],[706901,"K2618O72",221],["K2618O72","CN3K6CYM"],[18036,"K2618O72",258],["K2618O72","U1DTINDT"],["K2618O72","CN3K6CYM"],[18036,"U1DTINDT",293]]
 */