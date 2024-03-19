package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 삽입정렬
 */
public class InsertionSort {

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

    //단순삽입정렬
    public static void insertionSort2(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            int idx;

            if(i == 1){
               if(a[0] > a[1]){
                 swap(a, 0, 1);
               }
               continue;
            }else{
               idx = Arrays.binarySearch(Arrays.copyOf(a, i), tmp);
            }

            if(idx<0) {
                idx = -idx;
            }

            for (j = i; j > idx - 1; j--) {
                a[j] = a[j-1];
            }

            a[idx-1] = tmp;
        }
    }

    //단순삽입정렬
    public static int[] insertionSort3(int[] a, int n){

        int[] s = new int[n+1];

        for (int i = 1; i < s.length; i++) {
            s[i] = a[i - 1];
        }

        for (int i = 2; i < n + 1; i++) {
            int j;
            int tmp = s[i];
            for (j = i; s[j - 1] > tmp; j--) {
                s[j] = s[j-1];
            }
            s[j] = tmp;
        }

        return Arrays.copyOfRange(s, 1, s.length);
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

        int y[] = insertionSort3(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(y));
    }
}
