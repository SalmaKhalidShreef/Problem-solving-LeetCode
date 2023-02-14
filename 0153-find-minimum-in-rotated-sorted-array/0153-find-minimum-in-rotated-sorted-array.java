class Solution {
    public int findMin(int[] nums) {
        
        int right = nums.length-1, left =0;
        int min = Integer.MAX_VALUE;
        if(nums[left]<nums[right])
            return nums[left];
        while(left<= right)
        {
            int mid = (left+right)/2;
            if(nums[mid]>nums[right])
                left = mid+1;
            if(nums[mid]<=nums[right])
            {
                right = mid-1;
                min = Math.min(min,nums[mid]);

            }
        }
        
        return min;
        
    }
}