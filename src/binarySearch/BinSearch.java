package binarySearch;

import java.util.Scanner;

public class BinSearch {

    public static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", (i));
        }
        System.out.println();
        //길이가 n인 배열 a에서 key와 같은 요소를 2진 탐색
        do{
            int pc = (pl + pr) / 2;         //중앙 요소의 인덱스 값.

            for (int i = 0; i < n; i++) {
                String str = " ";
                if(i == pl){
                    str = "<-";
                }else if(i == pc){
                    str = "+";
                }else if(i == pr){
                    str = "->";
                }
                System.out.printf("%3s", str);
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", a[i]);
            }
            System.out.println();
            if(a[pc] == key){
                return pc;
            }else if(a[pc]>key){
                pr = pc -1;                 //검색 범위를 앞쪽 절반으로 좁힘
            } else{
                pl = pc + 1;                //검색 범위를 뒤쪽 절반으로 좁힘
            }
        }while(pl <= pr);

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
        System.out.print("a[" + "0" + "] : ");
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
