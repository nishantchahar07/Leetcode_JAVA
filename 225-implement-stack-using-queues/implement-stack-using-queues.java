class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> h = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.isEmpty())q.add(x);
        else{
            while(!q.isEmpty())h.add(q.poll());
            q.add(x);
            while(!h.isEmpty())q.add(h.poll());
        }
    }
    
    public int pop() {
        if(q.isEmpty())return -1;
        else return q.poll();
    }
    
    public int top() {
        if(q.isEmpty())return -1;
        else return q.peek();
        
    }
    
    public boolean empty() {
        if(q.isEmpty())return true;
        else return false;
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