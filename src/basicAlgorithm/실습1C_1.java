package basicAlgorithm;

import java.util.Scanner;

//세 수의 중간 값을 구하기.
public class 실습1C_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중간값을 구합니다.");

        // 1. 세 수 a b c를 입력 받음
        System.out.println("a의 값 : ");
        int a = sc.nextInt();
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        System.out.println("세 수의 중간값은 " + med3(a, b, c) + "입니다.");
    }

    public static int med3(int a, int b, int c){
        if(a>=b){    // a 가 b 보다 크거나 같은 경우
           if(b>=c)  // b 가 c 보다 크거나 같은 경우
               return b;
           else if(a <= c)
               return a;
           else
               return c;
        }else if(a>c){   // a 가 c 보다 큰 경우
               return a;
        }else if(b > c){
               return c;
        }else
               return b;
    }
}
