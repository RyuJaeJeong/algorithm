package recursiveAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색2 {
    public static int nodeSize, edgeSize, answer = 0;
    public static List<List<Integer>> graph;
    public static int[] check;

    /**
     * 인접리스트를 이용한 그래프 경로탐색
     * @param node
     */
    public static void DFS(int node){
        if(node == nodeSize){
            answer++;
        }else{
            for (int i = 0; i < graph.get(node).size(); i++) {
                int position = graph.get(node).get(i);
                if(check[position] == 0) {
                    check[position] = 1;
                    DFS(position);
                    check[position] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nodeSize = sc.nextInt();
        edgeSize = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= nodeSize; i++) {
            graph.add(new ArrayList<>());
        }
        check = new int[nodeSize + 1];
        for (int i = 0; i < edgeSize; i++) {
            int send = sc.nextInt();
            int receive = sc.nextInt();
            graph.get(send).add(receive);
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
