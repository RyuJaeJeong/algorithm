package Queue;

/**
 * 링버퍼를 활용 한 큐
 */
public class IntQueue {

    //field
    private int[] que;      //큐용 배열
    private int capacity;   //큐의 용량
    private int front;      //맨 앞의 요소 커서
    private int rear;       //맨 뒤의 요소 커서 
    private int num;        //현재 데이터 개수

    //constructor(생성자)
    public IntQueue(int capacity) {
        num = front = rear = 0;
        this.capacity = capacity;
        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    //Exception
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){}
    }

    //method
    public int enque(int x) throws OverflowIntQueueException{
        if(num>=capacity) throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if(rear == capacity) rear = 0;
        System.out.printf("front : %d, rear : %d\n", front, rear);
        return x;
    }

    public int deque() throws EmptyIntQueueException{
        if(num<=0) throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front == capacity) front = 0;
        System.out.printf("front : %d, rear : %d\n", front, rear);
        return x;
    }

    public int peek() throws EmptyIntQueueException{
        if(num<=0) throw new EmptyIntQueueException();
        return que[front];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i+front) % capacity;         //p155
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

    public int search(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx] == x) return (idx-front+1);
        }
        return -1;
    }
}
