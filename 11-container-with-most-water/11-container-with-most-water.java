class Solution {
    public int maxArea(int[] height) {
        if(height.length == 2){
            return Math.min(height[0], height[1]);
        }
        int max = 0, left =0 , right=height.length-1, min=Integer.MAX_VALUE;
        while(left<right){
            max=Math.max(Math.min(height[left],height[right])*(right-left),max);
            min = Math.min(height[left],height[right]);
            while(height[left]<=min && left<right)
                left++;
            while(height[right]<=min && left<right)
                right--;
        }
        return max;
        
    }
}