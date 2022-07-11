class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        pq.add(amount[0]);
        pq.add(amount[1]);
        pq.add(amount[2]);
        
        int ans = 0;
        
        while(pq.peek() != 0){
            int p = pq.poll();
            int q = pq.poll();
            p--;
            q--;
            pq.add(p);
            pq.add(q);
            ans++;
        }
        return ans;
    }
}