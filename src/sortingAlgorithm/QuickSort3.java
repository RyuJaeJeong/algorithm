package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort3 {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 교환  
    static void swap(int[] a, int idx1, int idx2){
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

    // 배열의 a[a], a[b], a[c]를 정렬하고 가운데 값의 인덱스를 반환
    static int sort3elem(int[] x, int a, int b, int c){
        if(x[b] < x[a]) swap(x, b, a);
        if(x[c] < x[b]) swap(x, b, c);
        if(x[b] < x[a]) swap(x, b, a);
        return b;
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

        /********************************
         * pivot 값을 구하는 과정 start
         * *****************************/

        int middleIndex = sort3elem(a, pl, (pl+pr)/2, pr);
        int pivot = a[middleIndex];

        swap(a, middleIndex, right - 1);
        pl++;
        pr -= 2;

        /********************************
         * pivot 값을 구하는 과정 end
         *
         * *****************************/


        do{
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pl<= pr){
              swap(a, pl++, pr--);
            }
        }while (pl <= pr);

        int lengthLeft = pr - left + 1;
        int lengthRight = right - pl + 1;

        //우측 배열이 더 짧다면, 순서를 교환함
        if(lengthLeft > lengthRight){
            int temp;
            temp = left;
            left = pl;
            pl = temp;

            temp = right;
            right = pr;
            pr = temp;
        }

        if(left < pr){
            quickSort(a, left, pr);
        }

        if(right > pl){
            quickSort(a, pl, right);
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

        if(nx > 9){
            quickSort(x, 0, nx-1);
        }else{
            insertionSort(x, nx);
        }


        System.out.println("정렬 끄읏");
        System.out.println(Arrays.toString(x));

    }
}
