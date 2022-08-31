package basicAlgorithm;

import java.util.Scanner;

public class 연습14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        triangleRU(N);


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

    public static void triangleRU(int N){
        String str = "";
        for (int i = 1; i <= N; i++) {
            str += " ";
            for (int j = 2; j <= 2*i-1; j++) {
                str += " ";
            }

            for (int j = 2*i-1; j <= 2*N-1; j++) {
                str += "*";
            }

            str = str + "\n";
        }
        System.out.println(str);
    }

    public static void triangleRB(int N){
        String str = "";
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 2*N-2*i; j++) {
                str += " ";
            }
            for (int j = 2*N-2*i; j < 2*N-1; j++) {
                str += "*";
            }
            str+="\n";
            System.out.println();
        }
        System.out.println(str);

    }

}
