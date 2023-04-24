package recursiveAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기 {

    //field
    public static int[] distance = {-1, 1, 5};
    public static int[] ch;
    public static Queue<Integer> q = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);

    //method
    public static void main(String[] args) {
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(solution(start, end));
    }

    public static int solution(int start, int end){
        ch = new int[10001];
        ch[start] = 1;
        q.offer(start);
        int level = 0;
        while (!q.isEmpty()){
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                int current = q.poll();
                if(current == end) return level;
                for (int j = 0; j < distance.length; j++) {
                    int nx = current + distance[j];
                    if(1<=nx && nx <= 10000 && ch[nx] ==0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }

            level++;
        }
        return 0;
    }
}
