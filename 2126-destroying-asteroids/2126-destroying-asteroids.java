class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int end = Integer.MIN_VALUE;
        long mas = mass;
        Arrays.sort(asteroids);
        
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] <= mas){
                mas += asteroids[i];
                end = i;
            }
        }
        return (end == asteroids.length - 1);
    }
    // TC : O(n logn) SC : O(1)
}