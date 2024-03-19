package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중복확인 {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = 0;
            while (st.hasMoreTokens()){
                arr[idx++] = Integer.parseInt(st.nextToken());
            }

            System.out.println(solution(arr));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(int[] arr){
        int loopSize = arr.length;
        arr = quickSort(arr, 0, loopSize-1);
        int cnt = 0;
        for (int i = 1; i < loopSize; i++) {
            int pivot = arr[i];
            int idx = i;
            while (idx>=1&&arr[--idx]>=pivot) cnt ++;
            idx = i;
            while (idx<loopSize-1&&arr[++idx]<=pivot) cnt ++;
        }

        return (cnt>0)?"D":"U";
    }

    /**
     * 배열을 퀵정렬을 통해 정렬
     * @param arr 정렬 대상 배열
     * @param left 정렬 대상 배열 첫 인덱스
     * @param right 정렬 대상 배열 마지막 인덱스
     */
    public static int[] quickSort(int[] arr, int left, int right){
        int pl = left;
        int pr = right;
        int pivot = arr[(pl + pr)/2];

        do {
            while (arr[pl] < pivot) pl++;
            while (arr[pr] > pivot) pr--;

            if(pl <= pr){
                swap(arr, pl++, pr--);
            }
        } while (pl<=pr);

        if(left < pr) quickSort(arr, left, pr);
        if(pl < right) quickSort(arr, pl, right);

        return arr;
    }

    /**
     * 배열요소를 스왑
     * @param arr 배열
     * @param idx1 인덱스 1
     * @param idx2 인덱스 2
     */
    public static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

}
