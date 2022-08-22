package basicAlgorithm;

import java.util.Scanner;

public class 연습13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = 0;
        String str = "";
        do {
            System.out.print("W ");
            W = sc.nextInt();
        }while (W<=0);

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < W; j++) {
                str += "*";
            }
            str += "\n";
        }
        System.out.println(str);

    }
}
