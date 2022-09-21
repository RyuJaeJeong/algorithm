package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제6 {

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
     * 단순 선택 정렬 - 가장 작은 숫자부터 교환 함.
     * @param a 정렬 할 배열
     * @param n 요솟수
     */
    static void selectionSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            for (int j = 0; j < n; j++) {
                if(j == i)
                    System.out.printf("%s", "* ");
                else if (j == min)
                    System.out.printf("%s", "+ ");
                else
                    System.out.printf("%s", "  ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            swap(a, i, min);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순 선택 정렬");
        System.out.printf("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
            //System.out.println();
        }

        selectionSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(x));
    }
}
