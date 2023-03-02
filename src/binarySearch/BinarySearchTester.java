package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("오름차순으로 입력하세요.");
        System.out.print("arr[0] : ");
        arr[0] = sc.nextInt();
        for (int i = 1; i < arr.length; i++) {
            do {
                System.out.printf("arr[%d] : ", i);
                arr[i] = sc.nextInt();
            }while (arr[i] < arr[i-1]);
        }
        System.out.print("검색할 값: ");
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(arr, key);
        if(idx<0){
            System.out.printf("그 값의 요소가 없습니다 : %d", idx);
        }else{
            System.out.printf("그 값은 arr[%d]에 있습니다.\n", idx);
        }

    }
}
