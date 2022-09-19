package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 알고리즘 개선하기
 */
public class BubbleSort2 {

    /**
     * 두 값을 교환 하는 정렬
     * @param a 정렬 할 배열
     * @param idx1 교환할 배열의 인덱스 1
     * @param idx2 교환할 배열의 인덱스 2
     */
    public static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    /**
     * 버블정렬(단순 교환 정렬)
     * @param a 정렬 할 배열
     * @param n 배열의 길이
     */
    public static void bubbleSort(int[] a, int n){
        int exchg = 0;
        int h = 1;
        for (int i = 0; i < n-1; i++) {
            System.out.printf("패스 %d : \n", h++);
            for (int j = n-1; j > i; j--) {
                for (int k = 0; k < n; k++) {
                    if(k == j){
                        if (a[k-1]>a[k]){
                            System.out.printf("+%2d", a[k]);
                        }else{
                            System.out.printf("-%2d", a[k]);
                        }
                    }else{
                        System.out.printf("%2d", a[k]);
                    }
                }   //end for k
                System.out.println();
                if(a[j-1] > a[j]){
                    //바꿔줘라
                    swap(a, j-1, j);
                    exchg++;
                }
            }   //end for j
            if(exchg == 0) break;
        }   //end for i
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬v2");
        System.out.printf("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
            //System.out.println();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.!");
        System.out.println(Arrays.toString(x));

    }
}
