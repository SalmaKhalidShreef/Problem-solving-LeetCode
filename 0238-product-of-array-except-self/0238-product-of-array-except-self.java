class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1 , right = 1;
        int[] res = new int[nums.length];
        res[0]= 1;
        //[1,-1]
        for(int i=1;i<nums.length;i++)
        {
            res[i] = left*nums[i-1];
            left*=nums[i-1];
        }

        for(int i=nums.length-1 ;i>=0; i--)
        {
            res[i] = right*res[i];
            right*=nums[i];
        }
        
        return res;
    }
}