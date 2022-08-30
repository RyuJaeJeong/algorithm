package searchAlgorithm;

import java.util.Scanner;

public class SeqSearch {

    /**
     * @param a 검색할 배열
     * @param n 검색할 배열의 길이
     * @param key 검색할 값
     */
    public static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while (true){
            if(i == n) return -1;
            if(a[i] == key) return i;

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("탐색 할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearch(a, n, key);

        if(idx == -1){
            System.out.println("검색에 실패 했습니다.");
        }else{
            System.out.print("그 값은 a[" + idx + "]에 있습니다.");
        }

    }
}
