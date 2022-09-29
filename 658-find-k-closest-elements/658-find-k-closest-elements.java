class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()!=a.getValue() ? b.getValue() - a.getValue() : b.getKey() - a.getKey());
        
        for(int i = 0; i < n; i++){
            pq.add(new Pair<>(arr[i], Math.abs(arr[i] - x)));
        }
        while(pq.size() > k){
            pq.remove();
        }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().getKey());
        }
        Collections.sort(list);
        return list;
    }
    // TC : O(n logn) SC : O(k)
}