package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 병합정렬 {

    //field
    public static int[] buff;   //작업용 배열

    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int[] arr = StringToIntArray(n, br.readLine());
            solution(arr, 0, n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 분할 하여 병합 정렬 수행
     * @param arr
     * @param left
     * @param right
     */
    public static void __mergeSort(int[] arr, int left, int right){
        if(left<right){
            int i;
            int center = (left + right)/2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(arr, left, center);
            __mergeSort(arr, center+1, right);

            for (i = left; i <= center; i++) {
                buff[p++] = arr[i];
            }

            while(i <= right && j < p){
                arr[k++] = (buff[j] <= arr[i])?buff[j++]:arr[i++];
            }

            while(j < p){
                arr[k++] = buff[j++];
            }

        }
    }

    public static void solution(int[] arr, int n){
        buff = new int[n];
        __mergeSort(arr, 0, n-1);
        buff = null;
    }

    /**
     * 배열, 시작값, 끝값 주어진 경우의 병합 정렬
     * @param arr 정렬 대상 배열
     * @param start 시작값            
     * @param end 끝값
     */
    public static void solution(int[] arr, int start, int end){
        if(end - start < 1) return;
        int middle = (start + end)/2;
        solution(arr, start, middle);
        solution(arr, middle+1, end);

        int[] tmp = new int[arr.length];

        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int k = start;
        int index1 = start; //첫번째 배열의 출발 점
        int index2 = middle +1; //두번재 배열의 출발 점

        while(index1<=middle && index2<=end){
            if(tmp[index1]>tmp[index2]){
                arr[k++] = tmp[index2++];
            }else{
                arr[k++] = tmp[index1++];
            }
        }

        while (index1<=middle){
            arr[k++] = tmp[index1++];
        }

        while (index2<=end){
            arr[k++] = tmp[index2++];
        }

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
