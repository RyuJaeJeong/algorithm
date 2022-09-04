package stackAndQueue;

public class Queue<E> {
    //field
    private E[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    //constructor
    public Queue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try{
            que = (E[]) new Object[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    //Exception
    public static class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    public static class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){}
    }

    //method
    public E enque(E x) throws IntQueue.OverflowIntQueueException {
        if(num>=capacity) throw new Queue.OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if(rear == capacity) rear = 0;
        System.out.printf("front : %d, rear : %d\n", front, rear);
        return x;
    }

    public E deque() throws IntQueue.EmptyIntQueueException {
        if(num<=0) throw new Queue.EmptyIntQueueException();
        E x = que[front++];
        num--;
        if(front == capacity) front = 0;
        System.out.printf("front : %d, rear : %d\n", front, rear);
        return x;
    }

    public E peek() throws IntQueue.EmptyIntQueueException {
        if(num<=0) throw new Queue.EmptyIntQueueException();
        return que[front];
    }

    public int indexOf(E x){
        for (int i = 0; i < num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx] == x) return idx;
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= capacity;
    }

    public void dump(){
        if(num<=0){
            System.out.println("큐가 비어 있습니다.");
        }else{
            for (int i = 0; i < num; i++) {
                System.out.println("idx: " + ((i+front)&capacity));
                System.out.println("idxBefore: " + ((i+front)));
                System.out.print(que[(i+front) % capacity] + "\n");
            }
        }
    }

    public int search(E x){
        for (int i = 0; i < num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx] == x) return (idx-front+1);
        }
        return -1;
    }
}
