class Solution {
    public int[] sortArray(int[] nums) {
        int[] result = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : nums){
            pq.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            result[i] = pq.poll();
        }
        return result;
    }
}