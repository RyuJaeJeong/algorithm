package recursiveAlgorithm;

import stackAndQueue.IntStack;

import java.util.Scanner;

public class Recur3 {

    static void recur3(int n){
        if (n > 0) {
            recur3(n-1);
            recur3(n-2);
            System.out.println(n);
        }
    }

    static void recur4(int n){
        IntStack a = new IntStack(10);
        IntStack b = new IntStack(10);
        int temp = n;
        while (true){
            if(n>0){
                a.push(--n);
                continue;
            }

            if(a.isEmpty() == false){
                if(a.peak()>0){
                    System.out.println(a.pop());
                    continue;
                }else{
                    a.pop();
                    continue;
                }
            }
            break;
       }
        n = temp;
        while (true){
            if(n>0){
                b.push(n-=2);
                continue;
            }

            if(b.isEmpty() == false ){
                if(b.peak()>0){
                    System.out.println(b.pop());
                    continue;
                }else{
                    b.pop();
                    continue;
                }
            }
            break;
        }
        System.out.println(temp);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();
        recur4(x);
    }
}
