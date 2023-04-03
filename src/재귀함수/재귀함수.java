package 재귀함수;

import java.util.Scanner;

public class 재귀함수 {

    //cons
    public 재귀함수() {

    }

    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        DFS(N);
    }

    public static void DFS(int N){
        if(N <= 0){
            return;
        }else{
            DFS(N-1);
            System.out.printf("%d ", N);
        }
    }
}
