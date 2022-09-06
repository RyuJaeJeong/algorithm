package recursiveAlgorithm;

import java.util.Scanner;
/**
 * 재귀적 호출 사용하지 않고  factorial 메서드 작성하기
 * */
public class 연습문제_1 {
    static int factorial(int x){
        int a = 1;
        while(x>0){
            a *= x--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.println(x + "의 팩토리얼은 "+factorial(x)+"입니다.");
    }
}
