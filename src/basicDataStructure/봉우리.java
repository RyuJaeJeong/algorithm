package basicDataStructure;

import java.util.Scanner;

public class 봉우리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =Integer.parseInt(sc.nextLine());
        int[][] inputArray = new int[size+2][size+2];
        for (int i = 1; i <= size; i++) {
            String temp = sc.nextLine();
            inputArray[i] = StringToIntArray(size, temp);
        }

        solution(size, inputArray);

    }

    public static void solution(int size, int[][] inputArray){
        int cnt = 0;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(inputArray[i][j]>inputArray[i-1][j]
                   &&inputArray[i][j]>inputArray[i+1][j]
                   &&inputArray[i][j]>inputArray[i][j-1]
                   &&inputArray[i][j]>inputArray[i][j+1]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    /**
     * " " 공백포함한 문자열을 받아 정수형 배열을 반환
     * @param size 배열의 길이
     * @param text 대상이 되는 문자열
     * @return 정수형 배열
     */
    public static int[] StringToIntArray(int size, String text){
        String[] temp = text.split(" ");
        int[] intArray = new int[size+2];
        for (int i = 1; i <= size; i++) {
            intArray[i] = Integer.parseInt(temp[i-1]);
        }
        return intArray;
    }

}
