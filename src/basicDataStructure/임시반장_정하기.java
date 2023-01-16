package basicDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 임시반장_정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =Integer.parseInt(sc.nextLine());
        int[][] inputArray = new int[size][5];
        for (int i = 0; i < size; i++) {
            String temp = sc.nextLine();
            inputArray[i] = StringToIntArray(5, temp);
        }

        solution(size, inputArray);
    }

    public static void solution(int size, int[][] inputArray){
        int cnt = 0;
        String [] outputArr = new String[size];
        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = "";
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 5; j++) {
                int[] standard = inputArray[i];
                for (int k = 0; k < size; k++) {
                    if(i == k){

                    }else{
                        if((!outputArr[i].contains(k+""))){
                            if(standard[j]==inputArray[k][j]) outputArr[i] += k + ",";
                        }
                    };
                }
            }
        }
        int max = outputArr[0].length();
        int banjang = 1;
        System.out.println(Arrays.toString(outputArr));
        for (int i = 1; i < outputArr.length; i++) {
            if(outputArr[i].length() > max){
                max = outputArr[i].length();
                banjang = i +1;
            }
        }

        System.out.println(banjang);

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
