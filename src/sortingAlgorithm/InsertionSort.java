package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 삽입정렬
 */
public class InsertionSort {
    
    //단순삽입정렬
    public static void insertionSort(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1]>tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정렬v1");
        System.out.printf("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(x));
    }
}
