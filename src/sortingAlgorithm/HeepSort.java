package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class HeepSort {

    /**
     * 배열 간의 요소를 교환하는 메서드
     * @param a 배열 참조변수
     * @param idx1 인덱스1
     * @param idx2 인덱스2
     */
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;

    }

    /**
     * a[left] ~ a[right] 를 힙으로 만듬
     * @param a
     * @param left
     * @param right
     */
    static void downHeap(int[] a, int left, int right){
        int temp = a[left];     //루트
        int child;
        int parent;


        for (parent = left; parent < (right + 1)/2; parent = child){
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && a[cr] > a[cl]) ? cr: cl;
            if(temp >= a[child]) break;
            a[parent] = a[child];
        }

        a[parent] = temp;

    }

    /**
     * 해당 배열을 힙 정렬 로 정렬
     * @param a
     * @param n
     */
    static void heapSort(int[] a, int n){
        for (int i = (n-1) / 2; i >= 0; i--) {
            downHeap(a, i, n-1);
        }

        for (int i = n-1; i > 0; i--) {
            swap(a, 0, i);
            downHeap(a, 0, i-1);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("힙정렬");
        System.out.printf("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
        }

       heapSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(x));
    }
}
