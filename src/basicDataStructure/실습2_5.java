package basicDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 실습2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이");
        int length = sc.nextInt();
        int [] a = new int[length];

        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reverse(a)));

    }

    //method
    public static int[] reverse(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        return a;
    }
}
