package basicAlgorithm;
import java.util.Scanner;

public class 실습1_2 {
    public static void main(String[] args) {

        //1. 세 수를 비교한다.
        System.out.println("최댓값은 " + max3(1,3,2) + "입니다.");
        System.out.println("최댓값은 " + max3(3,3,4) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,5) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,1) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,6) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,7) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,8) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,9) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,0) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,1) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,2) + "입니다.");
        System.out.println("최댓값은 " + max3(1,3,3) + "입니다.");

    }

    //method
    public static int max3(int a,int b,int c){
        //2. 세 수를 비교한다.
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
    
}
