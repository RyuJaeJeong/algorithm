package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 뮤직비디오 {

    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] firstRow = StringToIntArr(br.readLine(), 2);

            int N = firstRow[0];    //배열의 갯수
            int M = firstRow[1];    //DVD 갯수

            int[] secondRow = StringToIntArr(br.readLine(), N);
            solution(secondRow, M);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solution(int[] arr, int M){
        int N = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int sum = Arrays.stream(arr).sum();

        int lt = max;
        int rt = sum;
        int answer = 0;
        while (lt <= rt){
            int middle = (lt + rt)/2;

            int songSum = arr[0];
            int cnt = 1;
            for (int i = 1; i < N; i++) {
                if(songSum + arr[i] <= middle){
                    songSum += arr[i];
                }else{
                    songSum = arr[i];
                    cnt++;
                }
            }

            if(cnt <= M){
                rt = middle - 1;
                answer = middle;
            }else{
               lt = middle + 1;
            }
        }

        System.out.println(answer);
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
