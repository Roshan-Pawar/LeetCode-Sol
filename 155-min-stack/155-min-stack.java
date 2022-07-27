class MinStack {
    Stack<Long> s = new Stack<>();
    Long minVal;
    
    public MinStack() {
        minVal = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
        if(s.empty()){
            minVal = value;
            s.push(value);
        } else{
            if(value < minVal){
                s.push(2 * value - minVal);
                minVal = value;
            } else{
                s.push(value);
            }
        }
    }
    
    public void pop() {
        if(s.empty())
            return;
        
        Long value = s.pop();
        if(value < minVal)
            minVal = 2 * minVal - value;
    }
    
    public int top() {
        Long value = s.peek();
        
        if(value < minVal)
            return minVal.intValue();
        
        return value.intValue();
    }
    
    public int getMin() {
        return minVal.intValue();
    }
    //O(N) space, by storing minEle value each time in a variable using (value * 2 - minVal)
    // while pop() Formula minEle= (minVal * 2 - s.peek())
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */