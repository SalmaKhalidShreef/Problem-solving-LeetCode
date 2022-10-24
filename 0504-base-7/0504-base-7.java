class Solution {
    public String convertToBase7(int num) {
        int cnt =0;
        int res = 0;
        while(num != 0){
            int digit = num %7;
            res+=digit*(int)Math.pow(10,cnt);
            num= num/7;
            cnt++;
        }
        return Integer.toString(res);
    }
}