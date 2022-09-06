package recursiveAlgorithm;

import java.util.Scanner;

public class 연습문제_2 {
    static int gcd(int x, int y){
        int temp = 0;
        while(y>0){
            temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수의 최대 공약수를 구합니다.\n");
        System.out.print("정수를 입력하세요 : "); int x = sc.nextInt();
        System.out.print("정수를 입력하세요 : "); int y = sc.nextInt();
        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
    }
}
