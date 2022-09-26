package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort2 {

    static void shellSort(int[] a, int n){
        int h;
        for (h = 1; h < n; h = h * 3 + 1);
        for (; h > 0; h /= 3) {
                int cnt = 0;
                for (int i = h; i < n; i++) {
                    int j;
                    int tmp = a[i];
                    for (j = i - h; j >= 0 && a[j] > tmp; j-=h) {
                        a[j + h] = a[j];
                    }

                    a[j+h] = tmp;
                    if(a[i] != tmp) cnt++;
                }
                System.out.printf("%d간격으로 띄운 셀끼리 교환한 경우의 교환횟수는 %d회임\n", h, cnt);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전 2)");
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
