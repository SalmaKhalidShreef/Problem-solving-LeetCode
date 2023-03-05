class Solution {
    public int strStr(String haystack, String needle)
    {
        for(int i =0;i<haystack.length();i++)
        {
            if( haystack.length()-i < needle.length())            
                return -1;
            if(haystack.charAt(i) == needle.charAt(0))
            {             
                if(haystack.substring(i,i+needle.length()).equals(needle))   
                    return i;
            }
        }
        return -1;
    }
}