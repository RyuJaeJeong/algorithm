package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 선택정렬 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 선택정렬() {

    }

    //method
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(br.readLine());
            int[] arr = StringToIntArray(n, br.readLine());
            arr = solution(n, arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] solution(int size, int[] arr){
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i; j < size; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }

        return arr;
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

    /**
     * 배열의 두 요소를 교체
     * @param arr 교환 대상 배열
     * @param idx1 교환 인덱스 1
     * @param idx2 교환 인덱스 2
     */
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
