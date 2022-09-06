package recursiveAlgorithm;

import java.util.Scanner;

public class RecurMemo {

    public static int i = 0;
    public static String[] memo;
    static void recur(int n){
        i++;
        if(memo[n+1] != null){
            System.out.println(memo[n+1]);
        }else{
            if (n > 0) {
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n +"\n"+memo[n-1];
            }else{
                memo[n+1] = "";
            }
        }


    }

    /*static void recur(int n){
        while(n > 0) {
            recur(n-1);
            System.out.println(n);
            n = n-2;
        }
    }*/

   /* static void recur(int n){
        IntStack stack = new IntStack(n);
        while (true) {
            if(n>0){
                stack.push(n);
                n = n -1;
                continue;
            }

            if(stack.isEmpty() != true){
                n = stack.pop();
                System.out.println(n);
                n = n-2;
                continue;
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();
        memo = new String[x+2];
        recur(x);
        System.out.printf("호출 횟수는 %d 회입니다.", i);
    }
}
