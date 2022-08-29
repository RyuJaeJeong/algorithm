package basicDataStructure;

import java.util.Arrays;

public class 실습2_7 {
    public static void main(String[] args) {
        int counter = 0;
        int[] prime = new int[500];



        for (int i = 2; i < 1001; i++) {
            int j;
            for (j = 2; j < i; j++) {
                counter++;
                if(i%j == 0) break;
            }


        }


        System.out.println("연산횟수 : " + counter);
    }
}
