class MyCircularQueue {

    int[] queue;
    int front = -1;
    int rear = -1;
    int k;

    public MyCircularQueue(int k) {
        this.k = k;
        this.queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if ((rear+1)%k == front){
            return false;
        }
        if (front == -1){
            rear = 0;
            front = 0;
        }else{
            rear = (rear+1)%k;
        }
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
    if (isEmpty()) {
        return false;
    }
    
    if (front == rear) {
        // Only one element was in the queue; now it's empty
        front = -1;
        rear = -1;
    } else {
        // More than one element; simply advance front
        front = (front + 1) % k;
    }
    
    return true;
    }   
    
    public int Front() {
        if (front == -1){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if (rear == -1){
            return -1;
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if (rear == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if ((rear+1)%k == front){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */