package basicDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치_수열 {

    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = solution(length);
        for (int num : array){
            System.out.printf("%d ", num);
        }
    }

    public static int[] solution(int length){
        int[] array = new int[length+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < length+1; i++) {
            array[i] = array[i-2] + array[i-1];
        }

        return Arrays.copyOfRange(array, 1, length+1);
    }



}
