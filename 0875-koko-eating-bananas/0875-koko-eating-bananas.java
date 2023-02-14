class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for(int num : piles)
            max = Math.max(num,max);
        int low = 0;
        int mid = (low+max)/2;
        int res = Integer.MAX_VALUE;
        while(low<=max)
        {
            mid = (low+max)/2;
            int hrsNeeded = eat(mid,piles);
            if(hrsNeeded<=h)
            {
                max = (Integer)mid-1;
                res = Math.min(mid,res);
            }
            else if(hrsNeeded>h)
                low = mid+1;  

        }
        return res;
    }
    
    private int eat(int speed,int[] piles)
    {
        
        int hrsNeeded = 0;
        
        for(int pile : piles)
        {
                hrsNeeded+=Math.ceil((pile+0.0)/(speed+0.0));
        }
        
        return hrsNeeded;
        
    }
}
/*
[3,3,4,5,6,6]
[4,11,20,23,30]
*/