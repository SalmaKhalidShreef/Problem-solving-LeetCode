class Solution {
    public String convertToBase7(int num) {
        StringBuilder res = new StringBuilder("");
        if(num == 0)
            return "0";
        boolean sign = false;
        if(num <0){
            sign = true;
            num*=-1;
        }
        while(num>0){
            res.append(num%7);
            num= num/7;
        }
        if(sign)
            res.append('-');
        
        return res.reverse().toString();
    }
}