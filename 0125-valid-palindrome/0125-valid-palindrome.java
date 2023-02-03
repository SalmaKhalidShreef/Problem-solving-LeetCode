class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseInput = s.toLowerCase();
        int i = 0, j = s.length()-1;
        
        while(i<=j)
        {
            if(!Character.isLetter(lowerCaseInput.charAt(i)) &&
                                   !Character.isDigit(lowerCaseInput.charAt(i)))
            {
                i++;
                continue;
            }
                
            
            if(!Character.isLetter(lowerCaseInput.charAt(j)) &&
                                   !Character.isDigit(lowerCaseInput.charAt(j)))
            {
                j--;
                continue;
            }
            
            if(lowerCaseInput.charAt(i)!=lowerCaseInput.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;   
        }
        
        return true;
    }
}