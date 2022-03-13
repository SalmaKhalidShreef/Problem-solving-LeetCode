class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length()!=s.length())
            return false;
        char[] sa = s.toCharArray();
        char [] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        for(int i =0;i<sa.length;i++){
            if(sa[i]!=ta[i]) return false;
        }
        return true;
    }
}