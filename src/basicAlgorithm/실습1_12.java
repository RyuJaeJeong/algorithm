package basicAlgorithm;
import java.util.Scanner;

//반복 과정에서 조건 판단하기
public class 실습1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+와 -를 N번 반복 출력 합니다 ");
        int N = sc.nextInt();
        String str = "";

        // 마지막 한번을 위해 N-1번이나 조건식 연산을 해야함
        /*
        for (int i = 0; i < N ; i++) {
            if (i%2 == 0){
                str += "+";
            }else {
                str += "-";
            }
        }

        System.out.println(str);
        */


       for (int i = 0; i < N/2 ; i++) {
            str += "+-";
        }

       if(N%2 == 1) str += "+";

        System.out.println(str);



    }

}
