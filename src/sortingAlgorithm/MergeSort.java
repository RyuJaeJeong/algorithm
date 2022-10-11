package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static int[] buff;

    static void __mergeSort(int[] a, int left, int right){
        if(left < right){
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;
            
            __mergeSort(a, left, center);         // 배열의 앞부분을 병합 정렬
            __mergeSort(a, center+1, right);  // 배열의 뒷부분을 병합 정렬

            //1. 배열 a의 앞부분을 배열 buff에 복사합니다.
            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }
            
            //2. 배열 a의 뒷부분과 배열 buff를 배열 a에 병합합니다.
            while (i <= right && j < p){
                a[k++] = (buff[j]<=a[i]) ? buff[j++]:a[i++];
            }

            //3. 배열 buff에 아직 남아있는 요소를 배열 a에 복사합니다.
            while (j < p){
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n){
        buff = new int[n];
        __mergeSort(a, 0, n-1);
        buff = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("병합 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int [] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i +"]: ");
            x[i] = sc.nextInt();
        }
        mergeSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        System.out.println(Arrays.toString(x));


    }

}
