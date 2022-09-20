package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    /**
     * 스왑 함수
     * @param a
     * @param idx1
     * @param idx2
     */
    public static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    /**
     * 단순선택정렬
     * @param a
     * @param n
     */
    public static void SelectionSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
                swap(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버블정렬v1");
        System.out.printf("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
            //System.out.println();
        }

        SelectionSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(x));

    }

}
