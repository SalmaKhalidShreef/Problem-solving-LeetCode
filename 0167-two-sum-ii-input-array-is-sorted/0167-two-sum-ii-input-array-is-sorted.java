class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int[] res = new int[2];
        while(l<r){
            if((numbers[r]>target && numbers[l]>0) | numbers[l]+numbers[r] > target){
                r--;
                continue;
            }
            else if(numbers[l]+numbers[r] < target){
                l++;
                continue;
            }
            else
            {
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }
        }
        
        return res;
    }
}