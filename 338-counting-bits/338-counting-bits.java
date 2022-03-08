class Solution {
    public int[] countBits(int n) {
        int[] res= new int[n+1];
        for (int i =0;i<=n;i++){
            String bin = Integer.toBinaryString(i);
            int ones=0;
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1')
                    ones++;
            }
            res[i]=ones;
        }
        return res;
    }
}