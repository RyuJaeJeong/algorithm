package basicAlgorithm;

import java.util.Scanner;

public class 연습7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 N 까지의 합 : ");
        int N = sc.nextInt();

        int sum = (1 + N)* N / 2;

        System.out.println(sum);
    }
}
