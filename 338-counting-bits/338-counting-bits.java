class Solution {
    public int[] countBits(int n) {
        int[] res= new int[n+1];
        for (int i =1;i<=n;i++){
            res[i]= i%2==0?res[i/2]:res[i/2]+1;
            //res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}