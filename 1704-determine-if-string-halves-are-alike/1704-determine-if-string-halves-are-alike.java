class Solution {
    public boolean halvesAreAlike(String s) {
    Set<Character> set = new HashSet<>                              (Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    int c = 0;
    for(int i =0;i<s.length()/2;i++){
       if(set.contains(s.charAt(i)))
           c++;
    }
    for(int i =s.length()/2;i<s.length();i++){
        if(set.contains(s.charAt(i)))
            c--;
    }
        if(c!=0)
            return false;

        return true;
    }
}