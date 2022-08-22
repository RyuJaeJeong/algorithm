package basicAlgorithm;
import java.util.Scanner;

//반복 과정에서 조건 판단하기
public class 실습1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 n 까지의 합과 그 과정을 출력 하시오.");
        int N = sc.nextInt();
        int sum = 0;
        String str = "";

        // 마지막 한번을 위해 N-1번이나 조건식 연산을 해야함

        /*for (int i = 1; i <= N ; i++) {
            sum += i;
            if (i<N){
                str += i + "+";
            }else {
                str += i + "=" + sum;
            }
        }

        System.out.println(str);*/

        for (int i = 1; i < N ; i++) {
            sum += i;
            str += i + "+";
        }

        System.out.println(str + N +" = " + (sum+=N));


    }

}
