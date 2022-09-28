class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Insert all elements with their frequency in HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Create max Heap of pair<key, value> sort it by value
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(int key : map.keySet()){
            pq.add(new Pair<>(key, map.get(key)));
        }
        // add key of first K elements in the array
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
    // TC & SC : O(n)
}