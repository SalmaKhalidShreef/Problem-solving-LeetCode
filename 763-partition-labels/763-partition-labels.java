class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> result = new ArrayList();
        HashMap<Character,Integer> hm = new HashMap();
        for(int i =0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        int lastoccur = 0;
        int j=0;
        int prev=0;
        while(j<s.length()){
            lastoccur=hm.get(s.charAt(j));
            for(int i =j+1;i<lastoccur;i++){
                lastoccur=Math.max(lastoccur,hm.get(s.charAt(i)));
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