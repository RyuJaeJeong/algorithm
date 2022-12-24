package basicDataStructure;

import java.util.Scanner;

public class 보이는_학생 {

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
        int cnt = 1;
        int max = input[0];
        for (int i = 1; i < length; i++) {
            if(input[i]>max){
                max = input[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
