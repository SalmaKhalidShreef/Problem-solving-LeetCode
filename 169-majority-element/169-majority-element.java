class Solution {
    public int majorityElement(int[] nums) {
        /*Solution using Boyer-Moore Voting Algorithm
        O(N) time , O(1) space
        Only works ig there is a majority element in the array*/
        int candidate=nums[0];
        int candidateCount=0;
        for(int i :nums){
            if(candidateCount==0) 
                candidate=i;
           candidateCount+=i==candidate?1:-1;
            
        }
        return candidate;
    }
}

/*soution using Hashmap O(N) space ,O(N) time

HashMap <Integer,Integer> hm = new HashMap();
        for(int i : nums){
            int c = hm.getOrDefault(i,0)+1;
            if(c>nums.length/2)
                return i;
            hm.put(i,c);
        }
        return 0;*/