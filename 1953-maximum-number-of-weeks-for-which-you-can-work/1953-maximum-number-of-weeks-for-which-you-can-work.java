class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        long max = 0;
        
        for(int i : milestones){
            sum += i;
            max = Math.max(i, max);
        }
        if (max <= (sum - max)) return sum;
        return 2 * (sum - max) + 1;
    }
}