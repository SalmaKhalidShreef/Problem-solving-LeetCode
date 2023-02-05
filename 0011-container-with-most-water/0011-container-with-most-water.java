class Solution {
    public int maxArea(int[] height) {
        
        int left = 0, right = height.length-1;
        int max = 0;
        
        while(left<right)
        {
            int minHeight = Math.min(height[left],height[right]);
            int area = minHeight * (right-left);
            max = Math.max(max,area);
            while(height[left] <= minHeight && left < right)
                left++;
            while(height[right] <= minHeight && right > left)
                right--;
        }
        
        return max;
        
    }
}