class Solution {
    private static class Interval implements Comparable<Interval> {
        int from, to;
        public Interval(int from, int to) {
            this.from = from; 
            this.to = to;
        }
        @Override
        public int compareTo(Interval other) {
            return this.from - other.from;
        }
    }
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return intervals;
        
        List<Interval> intervalsList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++)
            intervalsList.add(new Interval(intervals[i][0], intervals[i][1]));
        
        Collections.sort(intervalsList);
        
        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervalsList.get(0);
        for (int i = 1; i < intervalsList.size(); i++) {
            if (intervalsList.get(i).from > currentInterval.to) {
                mergedIntervals.add(currentInterval);
                currentInterval = intervalsList.get(i);
            } else {
                currentInterval.to = Math.max(currentInterval.to, intervalsList.get(i).to);
            }
        }
        mergedIntervals.add(currentInterval);
        
        int[][] result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i][0] = mergedIntervals.get(i).from;
            result[i][1] = mergedIntervals.get(i).to;
        }
        
        return result;
    }
}