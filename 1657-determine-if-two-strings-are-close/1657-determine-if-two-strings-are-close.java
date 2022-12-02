class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] freq1 = new char[26];
        char[] freq2 = new char[26];
        
        for(char c: word1.toCharArray())
            freq1[c-'a']++;
        for(char c: word2.toCharArray())
            freq2[c-'a']++;
       
        for(int i =0;i<26;i++)
        {
            if((freq1[i]!= 0 && freq2[i] == 0) || (freq2[i]!= 0 && freq1[i] == 0))
                return false;
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        return Arrays.equals(freq1,freq2);
        
}
}