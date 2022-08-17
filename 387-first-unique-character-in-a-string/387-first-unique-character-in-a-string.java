class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap();
        char[] arr = s.toCharArray();
        for(char c : arr){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1)
                return i;
        }
        return -1;
    }
}