package 재귀함수;

import java.util.Scanner;

public class 이진수출력 {

    //cons
    public 이진수출력() {

    }

    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        solution(N);
    }

    /**
     * N의 2진수를 출력
     * @param N
     */
    public static void solution(int N){
        if(N == 0){
            return;
        }else{
            solution(N/2);
            System.out.printf("%d", (N%2));
        }
    }
}
