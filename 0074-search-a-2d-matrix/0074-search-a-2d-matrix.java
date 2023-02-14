class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        while(row<=matrix.length-1)
        {
            if(matrix[row][0]< target && matrix[row][matrix[0].length-1]>target)
               return binarySearch(matrix[row],target);
            else if( matrix[row][0] == target || matrix[row][matrix[0].length-1]==target)
                return true;
            else
                row++;
        }
        return false;
    }
    
    private boolean binarySearch(int[] nums, int target)
    {
        int low = 0 , high = nums.length-1;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid]>target)
                high = mid-1;
            else
                return true;
        }
        return false;
    }
}