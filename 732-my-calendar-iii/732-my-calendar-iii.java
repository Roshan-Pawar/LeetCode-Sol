class MyCalendarThree {
    TreeMap<Integer, Integer> tmap;
    public MyCalendarThree() {
        tmap = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        tmap.put(start, tmap.getOrDefault(start, 0) + 1);
        tmap.put(end, tmap.getOrDefault(end, 0) - 1);
        
        int maxBookings = 0;
        int activeBookings = 0;
        for(int event : tmap.values()){
            activeBookings += event;
            maxBookings = Math.max(maxBookings, activeBookings);
        }
        return maxBookings;
    }
//     TC & SC : O(n)
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */