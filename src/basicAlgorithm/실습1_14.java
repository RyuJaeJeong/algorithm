package basicAlgorithm;

import java.util.Scanner;

public class 실습1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        int N = 0;
        do {
            System.out.print("N ");
            N = sc.nextInt();
        }while (N<=0);

        int W = 0;
        do {
            System.out.print("W ");
            W = sc.nextInt();
        }while (W<=0||W>=N);

        for (int i = 0; i < N/W; i++) {
            for (int j = 0; j < W; j++) {
                str += "*";
            }
            str += "\n";
        }

        int rest = N%W;
        if(rest != 0){
            for (int j = 0; j < rest; j++) {
                str += "*";
            }
            str += "\n";
        }

        System.out.println(str);

    }
}
