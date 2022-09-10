class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        if(stones.length == 0) return 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : stones) list.add(i);
        Collections.sort(list);
        
        while(list.size() > 1){
            int a = list.get(list.size() - 1);
            int b = list.get(list.size() - 2);
            
            if(a == b){
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                continue;
            } else if (a != b){
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(a - b);
                Collections.sort(list);
                continue;
            }
        }
        if(list.size() == 0) return 0;
        return list.get(0);
    }
}