class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> resSet = new HashSet();
        for(int i =0;i<nums.length-1;i++)
        {
            int left = i+1; int right = nums.length-1;
            int target = 0-nums[i];
            while(left<right)
            {
                if(nums[left]+nums[right] < target)
                    left++;
                else if(nums[left]+nums[right] > target)
                    right--;
                else
                {
                    List<Integer> triplet = new ArrayList(
                        Arrays.asList(nums[i],nums[left++],nums[right--]));
                    if(!resSet.contains(triplet))
                    {
                        int currLeft =left-1;
                        int currRight = right+1;
                        resSet.add(triplet);
                        while(left<right && nums[currLeft] == nums[left] && nums[currRight]==nums[right])
                        {
                            left++; 
                            right--;
                        }
                    }
                    
                }
            }
        }
        
        return new ArrayList(resSet);
        
    }
    
    
    
}