class MinStack {
    
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(ss.empty() || val <= ss.peek())
            ss.push(val);
        s.push(val);
    }
    
    public void pop() {
        if(s.empty())
            return;
        int ans = s.peek();
        s.pop();
        if(ss.peek() == ans)
            ss.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(ss.empty())
            return -1;
        return ss.peek();
    }
    
    // O(N) Space, using suportive Stack(SS) 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */