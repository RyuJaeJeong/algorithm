package recursiveAlgorithm.재귀함수_기초;

import java.util.Scanner;

public class No1_재귀함수 {

    /*
    //field
    public Stack<Integer> stk;

    //cons
    public 재귀함수() {
        this.stk = new Stack<>();
    }*/

    //method
    public static void main(String[] args) {
        No1_재귀함수 재귀 = new No1_재귀함수();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        재귀.DFS2(N);
        //재귀.DFS(N-1);
    }

    /*public void DFS(int N){
        if(N < 1){
            while (!stk.isEmpty()) System.out.printf("%d ", stk.pop());
            System.out.println();
        }else{
            stk.push(N--);
            DFS(N);
        }
    }*/

    public void DFS2(int N){
        if(N <= 0){

        }else{
            DFS2(N-1);
            System.out.print(N + " ");
        }
    }
}
