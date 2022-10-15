package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

    static void countingSort(int[] a, int n, int max){
        int[] f = new int[max + 1];     //누적도수 분포표
        int[] b = new int[n];           //정렬 위한 작업용 배열

        for (int i = 0; i < n; i++) f[a[i]]++;  //도수분포표 작성
        for (int i = 1; i <= max; i++) f[i] += f[i-1];  //누적 도수분포표 작성
        for (int i = n-1; i >= 0; i--) b[--f[a[i]]] = a[i];  //작업용 배열에 정렬
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        };

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("도수 정렬!");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();  //배열의 길이 
        int[] x = new int[nx];
        for (int i = 0; i < nx; i++) {  //배열의 요소를 입력
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            }while(x[i] < 0);
        }

        int max = x[0];
        for (int i = 0; i < nx; i++) {  //배열의 최대값을 구함
            if(max < x[i]) max = x[i];
        }

        countingSort(x, nx, max);

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));

    }
}
