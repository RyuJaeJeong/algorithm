package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class QuickSort {

    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    /**
     * 퀵정렬 재귀적 구현 
     * @param a
     * @param left
     * @param right
     */
    static void quickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int pivot =  a[(pl + pr) / 2];

        System.out.printf("a[%d] ~ a[%d]: {", left, right);
        for (int i = left; i < right; i++) {
            System.out.printf("%d , ", a[i]);
        }
        System.out.printf("%d}\n", a[right]);

        do {
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pl<= pr)
                swap(a, pl++, pr--);
        }while (pl <= pr);

        if(left < pr) quickSort(a, left, pr);
        if(right > pl) quickSort(a, pl, right);
    }

    /**
     * 퀵정렬 비재귀적 구현
     * @param a
     * @param left
     * @param right
     */
    static void quickSort2(int[] a, int left, int right){
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true){
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int pivot =  a[(left + right) / 2];

            do {
                while(a[pl] < pivot) pl++;
                while(a[pr] > pivot) pr--;
                if(pl<= pr)
                    swap(a, pl++, pr--);
            }while (pl <= pr);

            if(left < pr) {
                lstack.push(left);
                rstack.push(pr);
            };

            if(right > pl) {
                lstack.push(pl);
                rstack.push(right);
            }
        }

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
        quickSort(x, 0, nx-1);
        System.out.println("정렬 끄읏");
        System.out.println(Arrays.toString(x));

    }

}
