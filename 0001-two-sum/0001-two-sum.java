class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int num: nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        
        for(int num : hm.keySet())
        {
            if(hm.containsKey(target-num) && target-num!= num)
                return constructSum(num,target-num,nums);
            if(hm.containsKey(target-num) && target-num == num && hm.get(target-num) >=2)
                return constructSum(num,target-num,nums);
        }
        
        return new int[]{};
        
    }
    
    
    private int [] constructSum(int x, int y,int[] nums){
        int[] res = new int[2];
        int j =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == x || nums[i] == y)
                res[j++] = i;
        }
        
        return res;
            
    }
}