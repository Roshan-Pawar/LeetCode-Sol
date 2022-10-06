class Solution {
    // Pair class of maxHeap to store character and it's frequency
    public class Pair{
        char ch;
        int freq;
        public Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String reorganizeString(String s) {
        int[] map = new int[26];// Array to store frequency of every character 
        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (b.freq - a.freq));
        //Insert <char, freq> in maxHeap
        for(int i = 0; i < 26; i++){
            if(map[i] > 0){
                pq.add(new Pair((char) ('a' + i), map[i]));
            }
        }
        StringBuilder sb = new StringBuilder();
        Pair block = pq.poll(); // take first ch from maxHeap
        sb.append(block.ch); // append that ch to ans
        block.freq--; // minimize the freq by 1 
        while(pq.size() > 0){ // repeat above 3 line of code for whole elements in maxheap
            // store the alredy taken ch in block and search for next unique character
            Pair temp = pq.poll();
            sb.append(temp.ch);
            temp.freq--;
            // if frequency is == 0 then do not add it again in maxheap
            if(block.freq > 0){
                pq.add(block);
            }
            block = temp;
        }
        // if last appended character is also has freq > 0 then return null
        if(block.freq > 0){
            return "";
        }
        
        return sb.toString();
    }
    // TC & SC : O(n)
}