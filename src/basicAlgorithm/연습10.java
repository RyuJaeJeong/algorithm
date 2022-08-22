package basicAlgorithm;

import java.util.Scanner;

public class 연습10 {

    //사후 판단 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        do {
            System.out.print("b값 : ");
            b = sc.nextInt();
        }while (b<=0);
        String temp = b + "";
        int answer = temp.length();

        System.out.println("b 의 길이는" + answer + "입니다.");

    }

}
