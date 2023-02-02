class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int res[] = new int[nums.length];
        boolean zeroExists = false;
        
        
        boolean allZeros = false;

        
        for(int num : nums)
        {
            if(num!=0)
                product*=num;
            else if(zeroExists && num == 0)
            {
                allZeros = true;
            }
               
            else
                zeroExists = true;
        }
        
        for(int i = 0;i<res.length;i++)
        {
            if(zeroExists && nums[i]!= 0 || allZeros)
                res[i] = 0;
            else if(nums[i]==0)
                res[i] = product;
            else
                res[i] = product/nums[i];
        }
        
        return res;        
    }
}