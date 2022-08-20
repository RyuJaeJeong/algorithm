package basicAlgorithm;
import java.util.Scanner;

public class 실습1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");

        // 1. 세 수 a b c를 입력 받음
        System.out.println("a의 값 : ");
        int a = sc.nextInt();
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        //2. 세 수를 비교한다.
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }

}
