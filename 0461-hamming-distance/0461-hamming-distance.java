class Solution {
    public int hammingDistance(int x, int y) {
        int res =0;
        for(int i =0;i<31;i++){
            if(getBit(x,i) != getBit(y,i))
                res++;
        }
        return res;
    }
    private int getBit(int num, int i){
        return(num & (1<<i));
    }
}