class Solution 
{
    public int strStr(String haystack, String needle)
    {
       for(int i =0;i<haystack.length();i++)
       {
           int window = i;
           int j = 0;
           while(window <haystack.length() && j<needle.length()
                 && haystack.charAt(window) == needle.charAt(j))
           {
               j++;
               window++;
           }
           if(j == needle.length())
               return i;
       }
        return -1;

    }
}