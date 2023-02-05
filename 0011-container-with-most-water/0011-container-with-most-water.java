class Solution {
    public int maxArea(int[] height) {
        
        int left = 0, right = height.length-1;
        int max = 0;
        
        while(left<right)
        {
            int minHeight = Math.min(height[left],height[right]);
            int area = minHeight * (right-left);
            //System.out.println(area+" "+minHeight);
            max = Math.max(max,area);
            if(minHeight == height[left])
                left++;
            else
                right--;
        }
        
        return max;
        
    }
}