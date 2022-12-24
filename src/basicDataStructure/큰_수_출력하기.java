package basicDataStructure;

import java.util.Scanner;

public class 큰_수_출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int [] input = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            input[i] = sc.nextInt();
        }
        solution(input, arrayLength);
    }

    public static void solution(int[] input, int length){
        System.out.print(input[0] + " ");
        for (int i = 1; i < length; i++) {
            if(input[i]>input[i-1]) System.out.printf("%d ",input[i]);
        }
    }
}
