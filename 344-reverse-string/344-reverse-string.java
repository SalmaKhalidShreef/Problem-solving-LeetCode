class Solution {
    public void reverseString(char[] s) {
        int left=0 , right=s.length-1;
        while(left<=right){
            char end = s[right];
            s[right--] = s[left];
            s[left++]=end;
        }
    }
}