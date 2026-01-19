class MedianFinder {
    PriorityQueue<Integer> left_max_heap;
    PriorityQueue<Integer> right_min_heap;

    public MedianFinder() {
        left_max_heap = new PriorityQueue<>(Collections.reverseOrder());
        right_min_heap = new PriorityQueue<>();
    }

    
    public void addNum(int num) {
        if(left_max_heap.isEmpty() || left_max_heap.peek() > num){
            left_max_heap.add(num);
        }
        else{
           right_min_heap.add(num); 
        }

        if(Math.abs((int)right_min_heap.size() -(int)left_max_heap.size()) > 1){
            right_min_heap.add(left_max_heap.poll());
        }
        else if(right_min_heap.size() > left_max_heap.size()){
            left_max_heap.add(right_min_heap.poll());
        }
    }
    
    public double findMedian() {
        if(right_min_heap.size() == left_max_heap.size() ){
            double mean =  (right_min_heap.peek() + left_max_heap.peek())/2.0;            return mean;
        }
        else {
            return left_max_heap.peek();
        }
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */