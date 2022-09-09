package recursiveAlgorithm;

import stackAndQueue.IntStack;

import java.util.Scanner;

public class Recur3 {

    static void recur3(int n){
        if (n > 0) {
            recur3(n-1);
            recur3(n-2);
            System.out.print(n+" ");
        }
    }

    //{ "", 1,  1 2, 1 2 1 3, 1 2 1 3 1 2 4}

    /**
     * recur3를 비재귀화
     * @param n 입력 받은 숫자
     */
    static void recur4(int n){
        String [] str = new String[n+1];
        str[0] = "";
        str[1] = "1";
        for (int i = 2; i <= str.length; i++) {
            str[i] = str[i-1] + " " + str[i-2]+ " " + + i;
        }
        System.out.printf("%s", str[n]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        recur3(x);
    }
}
