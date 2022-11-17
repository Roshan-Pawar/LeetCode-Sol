class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Calulating area of triangle A & B
        int areaOfA = (ay2 - ay1) * (ax2 - ax1);
        int areaOfB = (by2- by1) * (bx2 - bx1);
        
        // find the overlapping co-ordinates
        // overlapping at x-axis
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int xOverLap = right - left;
        
        // overlapping at y-axis
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);
        int yOverLap = top - bottom;
        
        // Area of overlapping
        int areaOfOverlap = 0;
        if(xOverLap > 0 && yOverLap > 0)
            areaOfOverlap = xOverLap * yOverLap;
        int totalArea = areaOfA + areaOfB - areaOfOverlap;
        
        return totalArea;
    }
    // TC & SC : O(1)
}