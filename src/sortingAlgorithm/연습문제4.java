package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제4 {

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
        int k = 0;
        int h = n-1;
        int x = 1;
        while(k < n - 1){
            int last = n - 1;
            int temp = n - 1;
            if(x++%2 == 0){ //짝수 분기 일때
                for (int j = 0; j < h; j++) {
                    if(a[j] > a[j+1]){
                        //바꿔줘라
                        swap(a, j, j+1);
                        temp = j;
                    }
                    h = temp;
                }
            }else {  //홀수 분기 일때
                for (int j = n - 1; j > k; j--) {
                    if(a[j-1] > a[j]){
                        swap(a, j-1, j);
                        last = j;
                    }
                }
                k = last;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬v3");
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
