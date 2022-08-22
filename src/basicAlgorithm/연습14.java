package basicAlgorithm;

import java.util.Scanner;

public class 연습14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        triangleLB(N);


    }

    public static void triangleLB(int N){
        String str = "";
        for (int i = 1; i <= N; i++) {
            str += "*";
            for (int j = 2; j <= 2*i-1; j++) {
                str += "*";
            }
            str = str + "\n";
        }
        System.out.println(str);
    }

    public static void triangleLU(int N){
        String str = "";
        for (int i = N; i >= 1; i--) {
            str += "*";
            for (int j = 2; j <= 2*i-1; j++) {
                str += "*";
            }
            str = str + "\n";
        }
        System.out.println(str);
    }



}
