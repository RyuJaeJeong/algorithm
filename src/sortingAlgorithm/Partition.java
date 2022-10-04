package sortingAlgorithm;

import java.util.Scanner;

public class Partition {

    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void partition(int[] a, int n){
        int pl = 0;
        int pr = n - 1;
        int pivot =  a[n/2];

        do {
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pl<= pr)
                swap(a, pl++, pr--);
        }while (pl <= pr);

        System.out.printf("피벗값은 %d 입니다.\n", pivot);
        for (int i = 0; i < pl-1; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println();
        
        //피벗값과 같은 그룹이 있을 경우
        if(pl > pr+1){
            System.out.printf("피벗과 같은 그룹\n", pivot);
            for (int i = pr + 1; i <= pl - 1; i++) {
                System.out.printf("%2d", a[i]);
            }
            System.out.println();
        }

        System.out.printf("피벗 이상의 그룹\n", pivot);
        for (int i = pr + 1; i <= n-1; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x  = new int[nx];
        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        partition(x, nx);
    }

}
