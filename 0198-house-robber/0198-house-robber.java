class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0);
        
    }

    private int helper(int[] nums, int[] dp , int idx){
        if(idx>=nums.length)
            return 0;
        if(dp[idx]>= 0 )
            return dp[idx];
        dp[idx] = Math.max(helper(nums,dp,idx+1), helper(nums,dp,idx+2)+nums[idx]);
        return dp[idx];
    }
}