package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이분검색 {


    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] firstRow = br.readLine().split(" ");
            int N = Integer.parseInt(firstRow[0]);
            int M = Integer.parseInt(firstRow[1]);
            String secondRow = br.readLine();
            StringTokenizer st = new StringTokenizer(secondRow);
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(arr, M) + 1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int solution(int[] arr, int m){
        Arrays.sort(arr);
        int positon = Arrays.binarySearch(arr, m);
        return positon;
    }

}
