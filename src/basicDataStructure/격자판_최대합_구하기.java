package basicDataStructure;

import java.util.Scanner;

public class 격자판_최대합_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =Integer.parseInt(sc.nextLine());
        int[][] inputArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            String temp = sc.nextLine();
            inputArray[i] = StringToIntArray(size, temp);
        }

        solution(size, inputArray);

    }

    public static void solution(int size, int[][] inputArray){
        int maxValue = 0;
        for (int i = 0; i < size; i++) {
            int sumVertical = 0;
            int sumHori = 0;

            for (int j = 0; j < size; j++) {
                sumVertical += inputArray[i][j];
                sumHori += inputArray[j][i];
            }

            maxValue = (sumVertical>maxValue)?sumVertical:maxValue;
            maxValue = (sumHori>maxValue)?sumHori:maxValue;

        }

        int sumCross = 0;
        for (int i = 0; i < size; i++) {
            sumCross += inputArray[i][i];
        }
        maxValue = (sumCross>maxValue)?sumCross:maxValue;

        sumCross = 0;
        for (int i = 0; i < size; i++) {
            sumCross += inputArray[i][size-1-i];
        }
        maxValue = (sumCross>maxValue)?sumCross:maxValue;
        System.out.println(maxValue);
    }

    /**
     * " " 공백포함한 문자열을 받아 정수형 배열을 반환
     * @param size 배열의 길이
     * @param text 대상이 되는 문자열
     * @return 정수형 배열
     */
    public static int[] StringToIntArray(int size, String text){
        String[] temp = text.split(" ");
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.parseInt(temp[i]);
        }
        return intArray;
    }

}
