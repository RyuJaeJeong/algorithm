package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 마구간정하기 {

    //method
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] firstRow = StringToIntArr(br.readLine(), 2);
        int N = firstRow[0];
        int C = firstRow[1];

        int[] positionArr = StringToIntArr(br.readLine(), N);
        Arrays.sort(positionArr);
        solution(positionArr, C);

    }

    /**
     * 가장 가까운 말의 최대거리
     * @param arr 마구간 좌표 배열
     * @param C 말의 마릿수
     */
    public static void solution(int[] arr, int C){
       int N = arr.length;
       int lt = arr[1] - arr[0];
       int rt = arr[N-1] - arr[0];
       int answer = 0;
       while (lt <= rt){
            int middle = (lt + rt) / 2;
            int count = count(arr, middle);
            if(count >= C){
                answer = middle;
                lt = middle + 1;
            }else{
                rt = middle - 1;
            }
       }
        System.out.println(answer);
    }

    /**
     * 주어진 거리를 간격으로 말을 배치 했을 때, 배치 할 수 있는 말의 마릿수
     * @param arr 마구간 좌표 배열
     * @param distance 거리
     * @return
     */
    public static int count(int[] arr, int distance){
        int endPosition = arr[0];
        int loopSize = arr.length;
        int cnt = 1;
        for (int i = 1; i < loopSize; i++) {
            if(arr[i] - endPosition >= distance){
                endPosition = arr[i];
                cnt++;
            }
        }

        return cnt;
    }

    /**
     * 문자열  > 배열
     * @param str 문자열
     * @param N 배열의 길이
     * @return
     */
    public static int[] StringToIntArr(String str, int N){
        StringTokenizer st = new StringTokenizer(str);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }



}
