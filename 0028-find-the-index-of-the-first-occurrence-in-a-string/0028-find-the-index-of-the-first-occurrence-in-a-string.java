class Solution 
{
    public int strStr(String haystack, String needle)
    {
        int h = haystack.length();
        int n = needle.length();
       for(int i =0;i<=h-n;i++)
       {
           int window = i;
           int j = 0;
           while(window <h && j<n
                 && haystack.charAt(window) == needle.charAt(j))
           {
               j++;
               window++;
           }
           if(j == n)
               return i;
       }
        return -1;

    }
}