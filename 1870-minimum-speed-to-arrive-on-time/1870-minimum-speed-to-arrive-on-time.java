class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start = 1, end = 1000000000;
        int ans = -1;
        // Search binary between 1 to max of given hour i.e : 10^9;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // if mid km/hr speed can reach on time update it as ans and search for less speed
            if(reachOnTime(dist, hour, mid)){
                ans = mid; // update as ans
                end = mid - 1; // search for better minimum speed
            } else { // else increase the speed search 
                start = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean reachOnTime(int[] dist, double hour, int speed){
        double time = 0d;
        // calculate time for every speed
        for(int i = 0; i < dist.length - 1; i++){
            time += (double)dist[i] / speed;
            time = Math.ceil(time); // take next interger if floating point time is appered
        }
        // check for last train in array;
        // here no need to take next integer because we don't have to take any train
        time += (double)dist[dist.length - 1] / speed;
        return time <= hour;
    }
    // TC : O(log n)
}