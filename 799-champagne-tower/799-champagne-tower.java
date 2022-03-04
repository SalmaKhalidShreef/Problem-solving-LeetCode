class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] pyramid=new double[query_row+1][query_row+1];
        pyramid[0][0]=poured;
        for(int i=0;i<query_row;i++){
            for(int j=0;j<=i;j++){
                if(pyramid[i][j]>1){
                    pyramid[i+1][j]+=(double)(pyramid[i][j]-1)/2;
                    pyramid[i+1][j+1]+=(double)(pyramid[i][j]-1)/2;
                   // pyramid[i][j]=1;
                }
            }
        }
        return pyramid[query_row][query_glass]>1?1:pyramid[query_row][query_glass];
        
    }
    
}