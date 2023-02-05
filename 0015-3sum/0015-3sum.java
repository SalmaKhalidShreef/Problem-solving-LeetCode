class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> triplets = new HashSet();
        
        for(int i =0;i<nums.length-2;i++)
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
                    triplets.add( new ArrayList(
                    Arrays.asList(nums[i],nums[left++],nums[right--])));
                }
            }
        }
        
        return new ArrayList(triplets);
        
    }
    
    
    
}