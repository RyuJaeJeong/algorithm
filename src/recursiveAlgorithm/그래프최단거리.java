package recursiveAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {

    //field
    public static int node, edge;
    public static int[][] graph;
    public static int[] check, distance;

    //cons
    public 그래프최단거리() {

    }

    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        graph = new int[node+1][node+1];
        check = new int[node+1];
        distance = new int[node+1];

        for (int i = 0; i < edge; i++) {
            int send = sc.nextInt();
            int receive = sc.nextInt();
            graph[send][receive] = 1;
        }
        BFS(1);
        System.out.println(Arrays.toString(distance));
    }

    /**
     * 레벨이용한 최단거리 계산
     * @param root 루트노드
     */
    public static void BFS(int root){
      check[root] = 1;
      distance[root] = 0;
      Queue<Integer> queue = new LinkedList<>();
      queue.offer(root);
      int level = 0;
      while (!queue.isEmpty()){
        int loopSize = queue.size();
        level++;
        for (int i = 0; i < loopSize; i++) {
            int currentNode = queue.poll();
            int [] currentArr = graph[currentNode];
            for (int j = 1; j < currentArr.length; j++) {
                if(currentArr[j] == 1 && check[j] == 0){
                    check[j] = 1;
                    queue.offer(j);
                    distance[j] = level;
                }
            }
        }
      }
    }
}
