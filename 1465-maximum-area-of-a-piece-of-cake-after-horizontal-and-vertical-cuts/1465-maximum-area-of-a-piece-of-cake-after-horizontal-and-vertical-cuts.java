class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        long a = 0, b = 0;
        int prev = 0;
        long mod = (long) (1e9+7);

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        a = Math.max(a, h - horizontalCuts[horizontalCuts.length - 1]);
        b = Math.max(b, w - verticalCuts[verticalCuts.length - 1]);
        
        for(int i : horizontalCuts){
            a = Math.max(a, i - prev);
            prev = i;
        }
        prev = 0;
        for(int i : verticalCuts){
            b = Math.max(b, i - prev);
            prev = i;
        }
        
        return (int) ((a * b) % mod);
    }
}