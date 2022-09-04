package searchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

//binary Search test
public class 실습3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("a[0]");
        a[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            do{
                System.out.print("a[" + i + "] : ");
                a[i] = sc.nextInt();
            }while (a[i] < a[i-1]);
        }
        System.out.print("탐색 할 값 : ");
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(a, key);
        if(idx<0) System.out.println("그 값은 a[" + (-idx-1) + "] 에 있어야 합니다.");
        else System.out.println("그 값은 a[" + idx + "] 에 있습니다.");
    }
}
