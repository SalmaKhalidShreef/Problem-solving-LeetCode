class MyStack {
    Queue<Integer> q;
    int mySize;
    int myTop;
    public MyStack() {
        q=new LinkedList();
        mySize=0;
        myTop=-1;
    }
    
    public void push(int x) {
       q.add(x);
       this.mySize++;
       this.myTop=x;
    }
    
    
    public int pop() {
        int cnt=this.mySize;
        while(cnt>1){
            if(cnt==2)
                this.myTop=q.peek();
            q.add(q.poll());
            cnt-=1;
        }
        this.mySize--;
        return q.poll();

    }
    
    public int top() {
       
        return this.myTop;
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