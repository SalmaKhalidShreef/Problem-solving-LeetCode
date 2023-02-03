class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> nums_set = new HashSet();
        for(int num : nums)
        {
            nums_set.add(num);
        }
        
        int longestStreak = 0;
        for(int num : nums_set)
        {   
            if(!nums_set.contains(num-1))
            {
                int currNum = num+1;
                int currStreak = 1;
                while(nums_set.contains(currNum))
                {
                    currNum = currNum+1;
                    currStreak+=1;
                }
                
                longestStreak = Math.max(currStreak,longestStreak);
            }
        }
        
        return longestStreak;
        
    }
}