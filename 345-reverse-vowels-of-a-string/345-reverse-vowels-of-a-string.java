class Solution {
    public String reverseVowels(String s) {
        int l =0;int r = s.length()-1;
       StringBuilder sb = new StringBuilder(s);
        while(l<r){
            if(!isVowel(s.charAt(l))) l++;
            else if(!isVowel(s.charAt(r))) r--;
            else {
                char temp = s.charAt(l);
                sb.setCharAt(l,s.charAt(r));
                sb.setCharAt(r,temp);
                l++; r--;
            }
        }
   return sb.toString(); }
    public boolean isVowel(char c)
{
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
        
        return true;
        
    else
    
        return false;
        
}
  
}