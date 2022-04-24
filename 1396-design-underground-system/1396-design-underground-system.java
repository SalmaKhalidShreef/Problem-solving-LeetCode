class UndergroundSystem {
    HashMap<Integer,CheckIn> checkIns;
    HashMap<String,Trip> trips;
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
        String tripId=check.city+"/"+stationName;
        Trip trip = trips.getOrDefault(tripId,new Trip(check.city,stationName,t-check.time));
        trip.addTrip(t-check.time);
        trips.put(tripId,trip);
        checkIns.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String tripId= startStation+"/"+endStation;        
        return trips.get(tripId).avgTime;
        //return 0;
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
    String id;
    String from;
    String to;
    double tripsCnt;
    int times;
    double avgTime;
    public Trip(String from , String to,int tripTime){
        this.id=from+"/"+to;
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
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */