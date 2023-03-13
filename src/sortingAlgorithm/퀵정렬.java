package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 퀵정렬 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    //cons
    public 퀵정렬() {

    }

    //method
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(br.readLine());
            int[] arr = StringToIntArray(n, br.readLine());
            solution3(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 전달 받은 배열을 정렬
     * @param arr 배열 
     * @param left 정렬 시작 지점
     * @param right 정렬 끝지점
     */
    public static void solution(int[] arr, int left, int right){
        int pl = left;
        int pr = right;
        int pivot = arr[(pl+pr)/2];

        do {
            while (arr[pl] < pivot){
                pl++;
            }

            while (arr[pr] > pivot){
                pr--;
            }

            if(pl <= pr){
                swap(arr, pl++, pr--);
            }

        } while (pl <= pr);

        if(left < pr) solution(arr, left, pr);
        if(right > pl) solution(arr, pl, right);

    }

    /**
     * 전달 받은 배열을 비 재귀적으로 정렬
     * @param arr 배열 
     * @param left 정렬 시작 지점
     * @param right 정렬 끝지점
     */
    public static void solution2(int[] arr, int left, int right){
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true){
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int pivot = arr[(left + right) / 2];

            do {
                while (arr[pl] < pivot) pl++;
                while (arr[pr] > pivot) pr--;
                if(pl <= pr){
                    swap(arr, pl++, pr--);
                }
            } while (pl <= pr);

            if(left < pr){
                lstack.push(left);
                rstack.push(pr);
            }

            if(right > pl){
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }

    /**
     * 전달 받은 배열을 비 재귀적으로 정렬, pivot값 추가 로직
     * @param arr 배열
     * @param left 정렬 시작 지점
     * @param right 정렬 끝지점
     */
    public static void solution3(int[] arr, int left, int right){
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true){
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int middle = sort3elem(arr, pl, (pl+pr)/2, pr);
            int pivot = arr[middle];

            swap(arr, middle, right-1);
            pl++;
            pr -= 2;

            do {
                while (arr[pl] < pivot) pl++;
                while (arr[pr] > pivot) pr--;
                if(pl <= pr){
                    swap(arr, pl++, pr--);
                }
            } while (pl <= pr);

            if(left < pr){
                lstack.push(left);
                rstack.push(pr);
            }

            if(right > pl){
                lstack.push(pl);
                rstack.push(right);
            }
        }
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

    public static int sort3elem(int[] arr, int a, int b, int c){
        if(arr[b]<arr[a]) swap(arr, b, a);
        if(arr[c]<arr[b]) swap(arr, c, b);
        if(arr[b]<arr[a]) swap(arr, b, a);
        return b;
    }

}
