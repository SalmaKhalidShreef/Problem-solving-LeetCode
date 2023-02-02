class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String,ArrayList<String>> hm  = new HashMap();
        
        for(String str : strs)
        {
            char[] chars = new char[26];
            for(char c : str.toCharArray())
            {
                chars[c-'a']++;
            }
            
            String charsString = new String(chars);
            if(hm.containsKey(charsString))
            {
                ArrayList<String> angrams = hm.get(charsString);
                angrams.add(str);
                hm.put(charsString,angrams);
            }
            
            else
            {
                ArrayList<String> angrams = new ArrayList();
                angrams.add(str);
                hm.put(charsString,angrams);
            }
        }
        
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(hm.values());
        res.addAll(list);
        return res;
        
    }
}