package stackAndQueue;

// int형 고정 길이 스택
public class IntStackTwice {

    //field
    private int[] stk;     //스택용 배열
    private int capacityA;  //스택 용량
    private int capacityB;  //스택 용량
    private int ptrA;      //스택A 포인터
    private int ptrB;      //스택B 포인터

    //cons(생성자)
    public IntStackTwice(int maxlenA, int maxlenB) {
        capacityA = maxlenA;
        capacityB = maxlenB;
        ptrA = 0;
        ptrB = capacityA+capacityB+6-1;
        try {
            stk = new int[capacityA+capacityB+6];
        }catch (OutOfMemoryError e){
            //스택 생성에 실패 할 경우 스택 용량을 0으로 설정하여 잘못된 배열에 접근하는 것을 방지 할 수 있다.
            capacityA = 0;
            capacityB = 0;
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
    public int push(char where, int x) throws OverflowIntStackException{
        if(where == 'A'){
            if(ptrA >= capacityA) throw new OverflowIntStackException();
            return stk[ptrA++] = x;
        }else if(where == 'B'){
            if(ptrB <= stk.length - 1 -capacityB) throw new OverflowIntStackException();
            return stk[ptrB--] = x;
        }else{
            System.out.println("입력 오류입니다.");
        }
        return -1;
    }

    /**
     * 스택 꼭대기에 있는 데이터를 꺼냄
     * */
    public int pop(char where) throws EmptyIntStackException{
        if(where == 'A'){
            if(ptrA >= capacityA) throw new OverflowIntStackException();
            return stk[--ptrA];
        }else if(where == 'B'){
            if(ptrB <= stk.length - 1 -capacityB) throw new OverflowIntStackException();
            return stk[++ptrB];
        }else{
            System.out.println("입력 오류입니다.");
        }

        return -1;
    }

    /**
     * 데이터를 들여다 보는 메서드
     * */
    public int peak(int where) throws EmptyIntStackException{
        if(where == 'A'){
            if(ptrA >= capacityA) throw new OverflowIntStackException();
            return stk[ptrA-1];
        }else if(where == 'B'){
            if(ptrB <= stk.length - 1 -capacityB) throw new OverflowIntStackException();
            return stk[ptrB+1];
        }else{
            System.out.println("입력 오류입니다.");
        };
        return -1;
    }

    /**
     *스택을 비움
     * */
    public void clear(){
        ptrA = 0;
        ptrB = capacityA+capacityB+6-1;;
    }

    /**
     * 선형 검색을 통해 스택 내에 x값이 있으면 반환 없으면 -1
     * */
    public int indexOf(int where, int x){

        if(where == 'A'){
            for (int i = ptrA-1; i >= 0; i--) {
                if(stk[i] == x){
                    return i;
                }
            }
        }else if(where == 'B'){
            for (int i = stk.length-1-ptrB; i < stk.length-1; i++) {
                if(stk[i] == x){
                    return i;
                }
            }
        }


        return -1;
    }

    /**
     * 스택의 용량을 반환
     * */
    public int getCapacity(char where){
        if(where == 'A'){
            return capacityA;
        }else if(where == 'B'){
            return capacityB;
        }
        return -1;
    }

    /**
     * 스택에 쌓여있는 데이터 개수를 반환
     * */
     public int size(int where){
         if(where == 'A'){
             return ptrA;
         }else if(where == 'B'){
             return stk.length-ptrB-1;
         }

         return 0;
     }

     /**
      * 스택이 비어있는가?
      * */
      public boolean isEmpty(int where){
          if(where == 'A'){
            return (ptrA <= 0);
          }else if(where == 'B'){
            return (ptrB >= stk.length-1);
          }
          return false;
      }

     /**
     * 스택이 가득 찼는가?
     * */
     public boolean isFull(char where){
         if(where == 'A'){
             return ptrA >= capacityA;
         }else if(where == 'B'){
             return (ptrB <= stk.length-capacityB-1);
         }
         return false;
     }

     /**
      * 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
      * */
     public void dump(char where){
         if(isEmpty(where)) System.out.println("스택이 비어있습니다.");
         else{

             if(where == 'A'){
                 for (int i = 0; i < ptrA; i++) {
                     System.out.print(stk[i]+ " ");
                 }
             }else if(where == 'B'){
                 for (int i = stk.length-1; i > stk.length-capacityB-1; i--) {
                     System.out.print(stk[i]+ " ");
                 }
             }

             System.out.println();
         }
     }


}
