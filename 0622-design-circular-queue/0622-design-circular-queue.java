class MyCircularQueue {
    int[] q;
    int head = 0, tail = -1, size = 0;

    public MyCircularQueue(int k) {
        q = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        tail = (tail+1) % q.length;
        q[tail] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        head = (head+1) % q.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return q[head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return q[tail];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == q.length;
    }
}