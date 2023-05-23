package recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그래프와_인접행렬 {


    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] firstRow = br.readLine().split(" ");
            int nodeSize = Integer.parseInt(firstRow[0]);   //vertax라고도 부르고, 우리는 정점이라고 부른다.
            int edgeSize = Integer.parseInt(firstRow[1]);   //간선
            String[] array = new String[edgeSize];
            for (int i = 0; i < nodeSize; i++) {
                array[i] = br.readLine();
            }
            //undirectedGraph(array, nodeSize, edgeSize);
            directedGraph(array, nodeSize, edgeSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 무방향 그래프를 출력
     * @param input 입력된 간선정보
     * @param nodeSize 정점 갯수
     * @param edgeSize 간선 갯수
     */
    public static void undirectedGraph(String[] input, int nodeSize, int edgeSize){
        int[][] graph = new int[nodeSize+1][edgeSize+1];
        for (String inputStr : input) {
            String[] positionArray = inputStr.split(" ");
            int sendPosition = Integer.parseInt(positionArray[0]);
            int receivePosition = Integer.parseInt(positionArray[1]);
            graph[sendPosition][receivePosition] = 1;
            graph[receivePosition][sendPosition] = 1;
        }

        for (int i = 0; i < nodeSize+1; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }

    }

    /**
     * 방향 그래프를 출력
     * @param input 입력된 간선정보
     * @param nodeSize 정점 갯수
     * @param edgeSize 간선 갯수
     */
    public static void directedGraph(String[] input, int nodeSize, int edgeSize){
        int[][] graph = new int[nodeSize+1][edgeSize+1];
        for (String inputStr : input) {
            String[] positionArray = inputStr.split(" ");
            int sendPosition = Integer.parseInt(positionArray[0]);
            int receivePosition = Integer.parseInt(positionArray[1]);
            graph[sendPosition][receivePosition] = 1;
        }

        for (int i = 0; i < nodeSize+1; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }

    }



}
