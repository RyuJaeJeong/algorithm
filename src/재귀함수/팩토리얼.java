package 재귀함수;

import java.util.Scanner;

public class 팩토리얼 {

    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        System.out.println(DFS(N));
    }

    public static int DFS(int N){
        if(N == 1){
            return 1;
        }else{
            return N * DFS(N-1);
        }
    }
}
