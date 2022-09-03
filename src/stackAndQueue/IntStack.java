package stackAndQueue;

// int형 고정 길이 스택
public class IntStack {

    //field
    private int[] stk;    //스택용 배열
    private int capacity; //스택 용량
    private int ptr;      //스택 포인터

    //cons(생성자)
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        }catch (OutOfMemoryError e){
            //스택 생성에 실패 할 경우 스택 용량을 0으로 설정하여 잘못된 배열에 접근하는 것을 방지 할 수 있다.
            capacity = 0;
        }
    }

    //exception
    //실행 시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){ }
    }

    //실행시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){ }
    }

    //method

    /**
     * 스택에 x를 푸쉬
     * */
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= capacity) throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    /**
     * 스택 꼭대기에 있는 데이터를 꺼냄
     * */
    public int pop() throws EmptyIntStackException{
        if(ptr<=0) throw new EmptyIntStackException();
        return stk[--ptr];
    }

    /**
     * 데이터를 들여다 보는 메서드
     * */
    public int peak() throws EmptyIntStackException{
        if(ptr<=0) throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    /**
     *스택을 비움
     * */
    public void clear(){
        ptr = 0;
    }

    /**
     * 선형 검색을 통해 스택 내에 x값이 있으면 반환 없으면 -1
     * */
    public int indexOf(int x){
        for (int i = ptr-1; i >= 0; i--) {
            if(stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    /**
     * 스택의 용량을 반환
     * */
    public int getCapacity(){
        return capacity;
    }

    /**
     * 스택에 쌓여있는 데이터 개수를 반환
     * */
     public int size(){
         return ptr;
     }

     /**
      * 스택이 비어있는가?
      * */
      public boolean isEmpty(){
          return ptr <= 0;
      }

     /**
     * 스택이 가득 찼는가?
     * */
     public boolean isFull(){
        return ptr >= capacity;
     }

     /**
      * 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
      * */
     public void dump(){
         if(ptr<=0) System.out.println("스택이 비어있습니다.");
         else{
             for (int i = 0; i < ptr; i++) {
                 System.out.print(stk[i]+ " ");
             }
             System.out.println();
         }
     }


}
