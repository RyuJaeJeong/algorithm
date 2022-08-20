package basicAlgorithm;

import java.util.Scanner;

//세 수의 중간 값을 구하기.
public class 연습4 {
    public static void main(String[] args) {
        System.out.println("세 수의 중간값은 " + med3(3, 2, 1) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 2, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 1, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 2, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 1, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 3, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 2, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 1) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(1, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(1, 2, 3) + "입니다.");
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
