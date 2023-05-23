package recursiveAlgorithm;

import java.util.Scanner;

public class 경로탐색 {

    public static int nodeSize, edgeSize, answer = 0;
    public static int[][] graph;
    public static int[] check;

    public static void DFS(int v){
        if(v == nodeSize){
            answer++;
        }else{
            for (int i = 1; i <= nodeSize; i++) {
                if(graph[v][i] == 1){
                    if(check[i] == 0) {
                        check[i] =1;
                        DFS(i);
                        check[v] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nodeSize = sc.nextInt();
        edgeSize = sc.nextInt();
        graph = new int[nodeSize+1][edgeSize+1];
        check = new int[nodeSize+1];
        for (int i = 0; i < edgeSize; i++) {
            int send = sc.nextInt();
            int receive = sc.nextInt();
            graph[send][receive] = 1;
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);

    }
}
