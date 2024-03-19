package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수_정렬하기1 {

    //method
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            solution(N, arr);
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    /**
     * 전달 받을 배열을 정렬
     * @param N 배열의 길이
     * @param arr 대상 배열
     */
    public static void solution(int N, int[] arr){
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                if(arr[j] < arr[j-1]){
                    swap(j, j-1, arr);
                }
            }
        }
    }

    /**
     *
     * @param idx1 교환 대상 인덱스 1
     * @param idx2 교환 대상 인덱스 2
     * @param arr 교환 대상 배열
     */
    public static void swap(int idx1, int idx2, int[] arr){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

}
