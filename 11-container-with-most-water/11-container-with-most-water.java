class Solution {
    public int maxArea(int[] height) {
        int max = 0, left =0 , right=height.length-1;
        while(left<right){
            int currarea = Math.min(height[left],height[right])*(right-left);
            max=Math.max(currarea,max);
            if(height[left]<=height[right])
                left++;
            else
                right--;
        }
        return max;
        
    }
}