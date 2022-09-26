package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

    static void shellSort(int[] a, int n){
        for (int h = n / 2; h > 0; h /= 2) {
            /**
             * 10행 부터 16행까지의 로직이 동일함
             */
            int cnt = 0;
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp ; j -= h) {
                    a[j+h] = a[j];
                }
                a[j+h] = tmp;

                if(a[i] != tmp) cnt++;
            }
            System.out.printf("%d간격으로 띄운 셀끼리 교환한 경우의 교환횟수는 %d회임\n", h, cnt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        shellSort(x, nx);

        System.out.println(Arrays.toString(x));
    }

}
