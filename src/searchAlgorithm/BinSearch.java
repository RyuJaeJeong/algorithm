package searchAlgorithm;

import java.util.Scanner;

public class BinSearch {

    public static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do{
            int pc = (pl + pr) / 2;
            if(a[pc] == key) return pc;
            else if(a[pc]>key) pr = pc -1;
            else pl = pc + 1;
        }while(pl<=pr);

        return -1;
    }

    public static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;
        int idx = -1;
        do{
            int pc = (pl + pr) / 2;
            if(a[pc] == key) idx=pc;
            else if(a[pc]>key) pr = pc -1;
            else pl = pc + 1;
        }while(pl<=pr);

        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            do{
                System.out.print("a[" + i + "] : ");
                a[i] = sc.nextInt();
            }while (a[i] < a[i-1]);
        }

        System.out.print("탐색 할 값 : ");
        int key = sc.nextInt();

        int idx = binSearch(a, n, key);

        if(idx == -1){
            System.out.println("검색에 실패 했습니다.");
        }else{
            System.out.print("그 값은 a[" + idx + "]에 있습니다.");
        }
    }
}
