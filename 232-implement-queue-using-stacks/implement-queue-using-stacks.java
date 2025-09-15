class MyQueue {
    Stack<Integer> s =  new Stack<>();
    Stack<Integer> h = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(s.isEmpty())s.push(x);
        else{
            while(!s.isEmpty())h.push(s.pop());
            s.push(x);
            while(!h.isEmpty())s.push(h.pop());
        }
    }
    
    public int pop() {
        if(s.isEmpty())return -1;
        else return s.pop();
    }
    
    public int peek() {
          if(s.isEmpty())return -1;
              else return s.peek();
    }
    
    public boolean empty() {
          if(s.isEmpty())return true;
          else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */