package basicAlgorithm;

import java.util.Scanner;

public class 연습9 {
    //사후 판단 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값 : ");
        int a = sc.nextInt();
        int b = 0;
        do {
            System.out.print("b값 : ");
            b = sc.nextInt();
        }while (b<=a);

        int answer = b - a;

        System.out.println("b - a의 값은 " + answer + "입니다.");

    }
}
