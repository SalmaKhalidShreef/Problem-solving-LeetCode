class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> result = new ArrayList();
        int[] last = new int[26];
        for(int i =0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        int lastoccur = 0;
        int j=0;
        int prev=0;
       for(int i =0;i<s.length();i++){
           j=Math.max(j,last[s.charAt(i)-'a']);
           if(i==j){
               result.add(i-prev+1);
               prev=i+1;
           }
       }
        return result;
    }
}