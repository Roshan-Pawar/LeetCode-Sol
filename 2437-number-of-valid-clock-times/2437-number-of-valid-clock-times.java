class Solution {
    public int countTime(String time) {
        String[] timeSplit = time.split(":");
        char[] hr = timeSplit[0].toCharArray();
        char[] mi = timeSplit[1].toCharArray();
        
        int hh = 1, mm = 1;
        
        if(hr[0] == '?'){
            if(hr[1] == '?'){
                hh = 24;
            } else {
                if((hr[1] - '0') > 3){
                    hh = 2;
                } else {
                    hh = 3;
                }
            }
        } else {
            if(hr[1] == '?'){
                if((hr[0] - '0') == 2){
                    hh = 4;
                } else {
                    hh = 10;
                }
            }
        }
        
        
        if(mi[0] == '?'){
            if(mi[1] == '?'){
                mm = 60;
            } else {
                mm = 6;
            }
        } else {
            if(mi[1] == '?'){
                mm = 10;
            }
        }
        return hh * mm;
    }
    // logic based code not any alogorithm
}