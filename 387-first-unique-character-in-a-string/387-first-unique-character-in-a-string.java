class Solution {
    public int firstUniqChar(String s) {
       int res = s.length();
        for(char c = 'a';c<='z';c++){
            int firstIndex = s.indexOf(c); 
            if(firstIndex!=-1 && firstIndex==s.lastIndexOf(c)){
                res=Math.min(res,firstIndex);
            }
        }
        if(res==s.length())
            return -1;
        return res;

    }
}