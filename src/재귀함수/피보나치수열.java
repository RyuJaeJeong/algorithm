package 재귀함수;

import java.util.Scanner;

public class 피보나치수열 {

    //field
    public static int[] fibo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        fibo = new int[N+1];
        solution3(N);
        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", fibo[i]);
        }
    }

    public static int solution1(int N){
        if(N == 1){
            return 1;
        }else if(N == 2){
            return 1;
        }else{
            return solution1(N-2) + solution1(N-1);
        }
    }

    public static int solution2(int N){
        if(N == 1){
            return fibo[N] = 1;
        }else if(N == 2){
            return fibo[N] = 1;
        }else{
            return fibo[N] = solution2(N-2) + solution2(N-1);
        }
    }

    /**
     * 메모이제이션을 활용한 피보나치수열 구현
     * @param N
     * @return
     */
    public static int solution3(int N){
        if(fibo[N] > 0){
            return fibo[N];
        }

        if(N == 1){
            return fibo[N] = 1;
        }else if(N == 2){
            return fibo[N] = 1;
        }else{
            return fibo[N] = solution3(N-2) + solution3(N-1);
        }
    }


}
