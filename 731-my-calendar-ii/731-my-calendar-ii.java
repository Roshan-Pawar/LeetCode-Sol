class MyCalendarTwo {
    TreeMap<Integer, Integer> tmap;
    public MyCalendarTwo() {
        tmap = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        tmap.put(start, tmap.getOrDefault(start, 0) + 1); // log n time for inserting in TreeMap
        tmap.put(end, tmap.getOrDefault(end, 0) - 1);
        
        int activeBookings = 0;
        
        for(int book : tmap.values()){ // O(n) time for traversing
            activeBookings += book;
            
            while(activeBookings > 2){
                tmap.put(start, tmap.getOrDefault(start, 0) - 1);
                tmap.put(end, tmap.getOrDefault(end, 0) + 1);
                return false;
            }
        }
        return true;
    }
    // TC & SC : O(n)   
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */