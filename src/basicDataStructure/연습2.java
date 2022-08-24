package basicDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이");
        int length = sc.nextInt();
        int [] a = new int[length];

        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(reverse(a)));
        System.out.println(sumOf(a));
        System.out.println(Arrays.toString(copyOf(a)));
        System.out.println(Arrays.toString(rcopyOf(a)));
    }

    //method
    public static int[] reverse(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length/2; i++) {
            System.out.println("a["+i+"]와 a["+ (a.length-i-1)+"]의 값을 교환합니다." );
            temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
            System.out.println(Arrays.toString(a));
        }
        return a;
    }

    public static int sumOf(int[] a){
        int sum = 0;
        for(int num : a){
            sum += num;
        }
        return sum;
    }

    public static int[] copyOf(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static int[] rcopyOf(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length/2+1; i++) {
            b[i] = a[a.length-i-1];
            b[a.length-i-1] = a[i];
        }
        return b;
    }

}
