class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numToIdx = new HashMap();
        for(int i =0;i<nums.length;i++)
        {
            numToIdx.put(nums[i],i);
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
            int currTarget = target - nums[i];
            if(numToIdx.containsKey(currTarget) && numToIdx.get(currTarget)!=i)
                return new int[]{i,numToIdx.get(currTarget)};
        }
        
        return new int[]{};
    }
}