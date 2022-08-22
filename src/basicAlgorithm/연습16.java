package basicAlgorithm;

import java.util.Scanner;

public class 연습16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N-i; j++) {
                str += " ";
            }
            str += i;
            for (int j = 2; j <= 2*i-1; j++) {
                str += "" + i;
            }
            str = str + "\n";
        }
        System.out.println(str);
    }
}
