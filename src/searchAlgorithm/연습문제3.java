package searchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제3 {

    /**
     * @param a 탐색 할 배열
     * @param n 요소수
     * @param key 찾아야 할 값
     * @param idx 찾은 값의 인덱스
     * */

    public static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(key == a[i]){
                idx[count++]= i;
            }
        }
        System.out.println(Arrays.toString(idx));
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("탐색 할 값 : ");
        int key = sc.nextInt();
        int[] idx = new int[n];
        int length = searchIdx(a, n, key, idx);
        System.out.println(length);
    }
}
