class Solution {
    public boolean halvesAreAlike(String s) {
        char[] word = s.toCharArray();
        return countVowels(word,0,word.length/2) ==                     countVowels(word,word.length/2,word.length);
    }
    
    private int countVowels(char[] s , int start, int end){
        HashSet<Character> set = new HashSet<Character>                              (Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        int c=0;
        for(int i=start;i<end;i++){
           if(set.contains(s[i]))
                c++;
        }
        return c;
    }
}