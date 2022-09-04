package stackAndQueue;

public class Deque {

    //field
    private int[] deque;
    private int capacity;
    private int f_front;    //앞쪽
    private int f_rear;
    private int r_front;
    private int r_rear;
    private int num;

    //constructor(생성자)
    public Deque(int maxlen) {
        num = f_front = f_rear = 0;
        capacity = maxlen;
        r_front = r_rear = maxlen-1;
        try{
            deque = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    //Exception
    public class EmptyDequeueException extends RuntimeException{
        public EmptyDequeueException(){}
    }

    public class OverflowDequeueException extends RuntimeException{
        public OverflowDequeueException(){}
    }

    //method
    public int addFirst(int x) throws Deque.OverflowDequeueException {
        if(num>=capacity) throw new Deque.OverflowDequeueException();
        deque[f_rear++] = x;
        num++;
        if(f_rear == capacity) f_rear = 0;
        System.out.printf("front : %d, rear : %d\n", f_front, f_rear);
        return x;
    }

    public int addLast(int x) throws Deque.OverflowDequeueException {
        if(num>=capacity) throw new Deque.OverflowDequeueException();
        deque[r_rear--] = x;
        num++;
        if(r_rear == -1) r_rear = capacity-1;
        System.out.printf("front : %d, rear : %d\n", r_front, r_rear);
        return x;
    }

    public int pollFirst() throws Deque.EmptyDequeueException {
        if(num<=0) throw new Deque.EmptyDequeueException();
        int x = deque[f_front++];
        num--;
        if(f_front == capacity) f_front = 0;
        System.out.printf("front : %d, rear : %d\n", f_front, f_rear);
        return x;
    }

    public int pollLast() throws Deque.EmptyDequeueException {
        if(num<=0) throw new Deque.EmptyDequeueException();
        int x = deque[r_front--];
        num--;
        if(r_front == -1) r_front = capacity-1;
        System.out.printf("front : %d, rear : %d\n", r_front, r_rear);
        return x;
    }

    public int peekFirst() throws Deque.EmptyDequeueException {
        if(num<=0) throw new Deque.EmptyDequeueException();
        return deque[f_front];
    }

    public int peekLast() throws Deque.EmptyDequeueException {
        if(num<=0) throw new Deque.EmptyDequeueException();
        return deque[r_front];
    }

    public int indexOf(int x){
        int length = f_rear - f_front + 1;
        for (int i = 0; i < length; i++) {
            int idx = (i+f_front) % length;
            if(deque[idx] == x) return idx;
        }

        length = r_rear - r_front + 1;
        for (int i = 0; i < length; i++) {
            int idx = (i+r_front) % length;
            if(deque[idx] == x) return idx;
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

    public void dumpFirst(){
        if(num<=0){
            System.out.println("큐가 비어 있습니다.");
        }else{
            int length = f_rear - f_front + 1;
            for (int i = 0; i < length; i++) {
                System.out.print(deque[(i+f_front) % capacity] + " ");
            }
        }
    }

    public void dumpLast(){
        if(num<=0){
            System.out.println("큐가 비어 있습니다.");
        }else{
            int length = r_front - r_rear + 1;
            for (int i = 0; i < length; i++) {
                System.out.print(deque[(i+r_front) % capacity] + " ");
            }
        }
    }

}
