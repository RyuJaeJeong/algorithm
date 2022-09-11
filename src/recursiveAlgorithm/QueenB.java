package recursiveAlgorithm;


/**
 * 각 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열
 */
public class QueenB {

    static int[] pos = new int[8];

    static void print(){
        for (int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    /**
     * 퀸을 배치하는
     * @param i 는 열, j 는 행
     */
    static void set(int i){
        for (int j = 0; j < 8; j++) {
            pos[i] = j;
            if(i == 7){
                print();
            }else{
                set(i+1);
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }

}
