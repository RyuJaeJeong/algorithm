package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제7 {

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

    static void insertionSort(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", a[k]);
            }
            System.out.println();
            for (j = i; j > 0 && a[j-1] > tmp ; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
            for (int k = 0; k < n; k++) {
                if(k == i){
                    System.out.printf("%s ", "+");
                }else if(k == j){
                    System.out.printf("%s ", "^");
                }else if(j<k && k<i){
                    System.out.printf("%s", "--");
                }else{
                    System.out.printf("  ");
                }
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순 삽입 정렬");
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
