class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> result = new ArrayList();
        int[] last = new int[26];
        for (int i = 0; i < 26; i++) {
            last[i] = s.lastIndexOf('a' + i);
        }
        int lastoccur = 0;
        int j=0;
        int prev=0;
        while(j<s.length()){
            lastoccur=last[s.charAt(j)-'a'];
            for(int i =j+1;i<lastoccur;i++){
                lastoccur=Math.max(lastoccur,last[s.charAt(i)-'a']);
            }
            j = lastoccur+1;
            if(result.size()>0){
              //  System.out.println("j"+j+" "+result.get(result.size()-1));
                result.add(j-prev);

            }
            else
                result.add(j);
            prev=j;
        }
        return result;
    }
}