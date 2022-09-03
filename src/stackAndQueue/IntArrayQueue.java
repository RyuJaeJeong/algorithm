package stackAndQueue;

public class IntArrayQueue {

    //field
    private int[] que;
    private int capacity;
    private int num;

    //cons
    public IntArrayQueue(int capacity) {
        num = 0;
        this.capacity = capacity;
        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            this.capacity = 0;
        }
    }

    //exception
    public static class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){

        }
    }

    //실행시 예외 : 스택이 가득 참
    public static class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){

        }
    }

    //method
    /**
     * 큐에 x를 푸쉬
     * */
    public int push (int value) throws OverflowIntQueueException{
        if(num >= capacity) throw new OverflowIntQueueException();
        return que[num++] = value;
    }

    /**
     * 큐에 x를 팝
     * */
    public int pop() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();
        int returnValue = que[0];
        num--;
        // 뒤에서부터 한칸씩 당김
        for (int i = 1; i < que.length; i++) {
            que[i-1] = que[i];
        }
        return returnValue;
    }

    /**
     * front 데이터를 들여다 보는 메서드
     * */
    public int peakFront() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();
        return que[0];
    }

    /**
     * rear 데이터를 들여다 보는 메서드
     * */
    public int peakRear() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();
        return que[num];
    }

    /**
     * 데이터 초기화
     * */
    public void clear(){
        num = 0;
    }

    /**
     * 선형 검색을 통해 스택 내에 x값이 있으면 반환 없으면 -1
     * */
    public int indexOf(int x){
        for (int i = num-1; i >= 0; i--) {
            if(que[i] == x){
                return i;
            }
        }
        return -1;
    }

    /**
     * 수용량 반환
     * */
    public int getCapacity() {
        return capacity;
    }

    /**
     * 사이즈 반환
     * */
    public int size() {
        return num;
    }

    /**
     * 큐 가득 찾는지
     * */
    public boolean isFull(){
        return num >= capacity;
    }

    /**
     * 큐 비었는지
     * */
    public boolean isEmpty(){
        return num <= 0;
    }

    /**
     * 큐 front to rear
     * */
    public void dump(){
        if(num <= 0) throw new EmptyIntQueueException();
        for (int i = 0; i < num; i++) {
            System.out.print(que[i]);
        }
    }
}
