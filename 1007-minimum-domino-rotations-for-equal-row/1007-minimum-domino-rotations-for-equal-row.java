class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int t1 = Math.min(minSwaps(tops[0],tops,bottoms),minSwaps(bottoms[0],tops,bottoms));
        int t2 = Math.min(minSwaps(bottoms[0],bottoms,tops),minSwaps(tops[0],bottoms,tops));
        if(t1==Integer.MAX_VALUE && t2 == Integer.MAX_VALUE)
            return -1;
        return Math.min(t1,t2);
    }
    private int minSwaps(int target , int[] A , int[] B){
        int swaps=0;
        for(int i =0; i<A.length;i++){
            if(A[i]!= target && B[i]!= target)
                return Integer.MAX_VALUE;
            if(A[i]!=target)
                swaps++;
        }
        return swaps;
    }
}