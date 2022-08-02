class NumArray {
    int[] numbers;
    int sum;
    public NumArray(int[] nums) {
        numbers = nums;
        sum = 0;
        for(int num : numbers){
            sum += num;    
        }
    }
    
    public void update(int index, int val) {
        sum += val - numbers[index];
        numbers[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int answer = sum;
        
        for(int i = 0; i < left; i++){
            answer -= numbers[i];
        }
        for(int i = right + 1; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */