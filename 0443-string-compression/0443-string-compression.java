class Solution {
    public int compress(char[] chars) {
        int res = 0;
        int i = 0;
        while(i<chars.length)
        {
            int cnt = 1;
            while(i+cnt < chars.length && chars[i+cnt]==chars[i])
            {
                cnt++;
            }
            chars[res++] = chars[i];
            if(cnt > 1)
            {
                if(cnt<10)
                    chars[res++] = (char)(cnt+'0');
                else  
                {
                    
                    for(char c : Integer.toString(cnt).toCharArray())
                    {
                        chars[res++] = c;
                    }                    
                }

            }

            i += cnt;
        }
        return res;
    }
}