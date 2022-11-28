class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> winners = new HashSet<>();
        HashSet<Integer> oneLost = new HashSet<>();
        HashSet<Integer> moreLost = new HashSet<>();
        
        for(int[] match : matches){
            int winner = match[0], loser = match[1];
            
            //For winner
            if(!oneLost.contains(winner) && !moreLost.contains(winner)){
                winners.add(winner);
            }
            
            // For losser
            if(winners.contains(loser)){
                oneLost.add(loser);
                winners.remove(loser);
            } else if(oneLost.contains(loser)){
                moreLost.add(loser);
                oneLost.remove(loser);
            } else if(moreLost.contains(loser)){
                continue;
            } else {
                oneLost.add(loser);
            }
        }
        
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        ans.get(0).addAll(winners);
        ans.get(1).addAll(oneLost);
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        
        return ans;
    }
}