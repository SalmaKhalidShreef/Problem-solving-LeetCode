class Solution {
    public List<String> summaryRanges(int[] nums) {
        List <String> result = new ArrayList();
        if(nums==null || nums.length==0)
            return result;
        if(nums.length==1)
        {
          result.add(nums[0]+"");
            return result;
        }
        StringBuilder range = new StringBuilder(nums[0]+"");
        int start=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=1){
               if(start==nums[i-1]){
                  result.add(range.toString());
                                  }
                else{
                range.append("->"+nums[i-1]);
                result.add(range.toString());
                }
                  range=new StringBuilder(nums[i]+"");
                    start=nums[i];

                
                }
            if(i==nums.length-1){
                    if(start==nums[i])
                    result.add(range.toString());
                    else{
                        range.append("->"+nums[i]);
                result.add(range.toString());
                    }
              
            }
        }
        return result;
    }
}