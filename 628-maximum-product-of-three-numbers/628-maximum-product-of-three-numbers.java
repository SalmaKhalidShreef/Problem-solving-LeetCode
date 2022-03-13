class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        int max=nums[l]*nums[l-1]*nums[l-2];
        int min=0;
        if(nums[0]<0){
             min = nums[0]*nums[1];
            if(min>0)min=min*nums[l];
            else
                return min=min*nums[2];
        }
        
        return(Math.max(min,max));
    }
}