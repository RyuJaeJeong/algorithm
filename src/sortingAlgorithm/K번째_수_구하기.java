package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K번째_수_구하기 {

    //field
    public static BufferedReader br;
    public static StringTokenizer st;

    //cons
    public K번째_수_구하기() {

    }

    //method
    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int [] firstRow = StringToIntArray(2, br.readLine());
            int N = firstRow[0];
            int K = firstRow[1];
            int [] secondRow = StringToIntArray(N, br.readLine());
            solution(secondRow, 0, secondRow.length-1);
            System.out.println(Arrays.toString(secondRow));
            System.out.println(secondRow[K-1]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solution(int[] arr, int left, int right){
        int pl = left;
        int pr = right;
        int pivot = arr[(pl+pr)/2];

        do{
            while (arr[pl] < pivot) pl++;
            while (arr[pr] > pivot) pr--;

            if(pl<=pr){
                swap(arr, pl++, pr--);
            }

        }while (pl <= pr);

        if(left < pr){
            solution(arr, left, pr);
        }

        if(right > pl){
            solution(arr, pl, right);
        }

    }


    /**
     * " " 공백포함한 문자열을 받아 정수형 배열을 반환
     * @param size 배열 길이
     * @param text 대상이 되는 문자열
     * @return 정수형 배열
     */
    public static int[] StringToIntArray(int size, String text){
        st = new StringTokenizer(text);
        int[] intArray = new int[size];
        int idx = 0;
        while (st.hasMoreTokens()){
            intArray[idx++] = Integer.parseInt(st.nextToken());
        }

        return intArray;
    }

    /**
     * 배열의 요소를 교환
     * @param a     교환 대상 배열
     * @param idx1  교환대상 인덱스 1
     * @param idx2  교환대상 인덱스 2
     */
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
