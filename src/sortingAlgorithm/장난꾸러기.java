package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 장난꾸러기 {

    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            int[] arr = StringToIntArr(br.readLine(), N);
            solution(arr, N);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void solution(int[] arr, int N){
        int[] arr2 = arr.clone();
        for (int i = 1; i < N; i++) {
            int tmp = arr[i];
            int j;
            for (j = i; j > 0 && tmp<arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }

        for (int i = 0; i < N; i++) {
            if(arr[i] != arr2[i]){
                System.out.print((i+1) + " ");
            }
        }

    }

    public static int[] StringToIntArr(String str, int N){
        StringTokenizer st = new StringTokenizer(str);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

}
