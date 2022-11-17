class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int aArea = (ay2-ay1)*(ax2-ax1);
        int bArea = (by2-by1)*(bx2-bx1);
        
        int top = Math.min(ay2,by2);
        int bottom = Math.max(ay1,by1);
        int yOverlap = top-bottom;
        
        int left = Math.max(ax1,bx1);
        int right = Math.min(bx2,ax2);
        int xOverlap = right-left;
        
        int overlapArea = 0;
        if(xOverlap > 0 && yOverlap>0){
            overlapArea = xOverlap * yOverlap;
        }
        
        return aArea + bArea - overlapArea;
    }
    
   
}

/*
4*(3--3) + (9-0)*(2--1)
4*6 + 9*3 = 24 +  27 - 
*/