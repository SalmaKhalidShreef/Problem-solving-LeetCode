class MyStack {
    Queue<Integer> q;
    Queue<Integer> temp;
    public MyStack() {
        q=new LinkedList();
        temp=new LinkedList();
    }
    
    public void push(int x) {
        while(!q.isEmpty())
            temp.add(q.poll());
        q.add(x);
        while(!temp.isEmpty())
            q.add(temp.poll());
    }
    
    public int pop() {
        /*while(q.size()>1)
            temp.add(q.poll());
        int res=q.poll();
        while(!temp.isEmpty())
            q.add(temp.poll());
            */
        return q.poll();

    }
    
    public int top() {
       /* while(q.size()>1)
            temp.add(q.poll());
        int res=q.peek();
        temp.add(q.poll());
        while(!temp.isEmpty())
            q.add(temp.poll());*/
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */