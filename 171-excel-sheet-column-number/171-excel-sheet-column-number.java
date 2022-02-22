class Solution {
    public int titleToNumber(String col) {
        int num=0;
        for(int i=0;i<col.length();i++) 
            num=num*26+(col.charAt(i)-64);
       return num; 
    }
}