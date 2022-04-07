class Solution {
    public int threeSumMulti(int[] A, int target) {
        int MOD = 1_000_000_007;
        long res=0;
        for(int i =0;i<A.length;i++){
            int[] occ = new int[101];
            for(int j =i+1;j<A.length;j++){
                int t = target-A[i]-A[j];
                if(t>=0 && t<=100 && occ[t]>0 ){
                    res+=occ[t];
                    res=res%MOD;
                }
                occ[A[j]]++;
            }
        }
        return (int) res;
    }
}