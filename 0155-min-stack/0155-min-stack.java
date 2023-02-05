class MinStack {
    ArrayList<Integer> stack;
    int top;
    public MinStack() {
        stack = new ArrayList();
        top = -1;
    }
    
    public void push(int val) {
        if(top==stack.size()-1 || stack.size()== 0)
        {
            stack.add(val);
            top++;
        }
        else
            stack.set(++top,val);
    }
    
    public void pop() {
        stack.set(top,0);
        top--;
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=top;i++)
        {
            min = min<stack.get(i)?min:stack.get(i);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */