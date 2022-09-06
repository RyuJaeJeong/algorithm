package recursiveAlgorithm;

import java.util.Scanner;

/**
 * 배열 a의 모든 요소의 최대 공약수를 구하는 메서드
 */
public class 연습문제_3 {

    static int gcd(int x, int y){
        int temp = 0;
        while(y>0){
            temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int gcdArray(int a[], int start, int no){
        if(no == 1){
           return a[start];
        }else if (no == 2){
           return gcd(a[start], a[start+1]);
        }else{
            return gcd(a[start], gcdArray(a, start+1, no-1));
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개 정수의 최대 공약수를 구할까요? : ");
        int num;
        do {
            num = stdIn.nextInt();
        } while (num <= 1);

        int[] x = new int[num];					// 길이가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }

}
