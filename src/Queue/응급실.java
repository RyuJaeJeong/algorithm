package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 응급실 {

    //field
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static class Node{
        public int index;
        public int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        try{
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);
            int[] inputArray = StringToIntArray(N, br.readLine());
            solution(M, inputArray);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void solution(int M, int[] inputArray){
        Node m = new Node(M, inputArray[M]);
        Queue<Node> queue = new LinkedList<>();
        int loopSize = inputArray.length;
        for (int i = 0; i < loopSize; i++) {
            queue.add(new Node(i, inputArray[i]));
        }

        int answer = 0;
        while(true){
            Node nowNode = queue.poll();
            loopSize = queue.size();
            int max = 0;
            for (int i = 0; i < loopSize; i++) {
                Node checkNode = queue.poll();
                if(max < checkNode.getValue()){
                    max = checkNode.getValue();
                }
                queue.add(checkNode);
            }
            if(max> nowNode.getValue()){
                queue.add(nowNode);
            }else{
                answer++;
                if(m.getIndex() == nowNode.getIndex() && m.getValue() == nowNode.getValue()){
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    /**
     * " " 공백포함한 문자열을 받아 정수형 배열을 반환
     * @param size 배열의 길이
     * @param text 대상이 되는 문자열
     * @return 정수형 배열
     */
    public static int[] StringToIntArray(int size, String text){
        String[] temp = text.split(" ");
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.parseInt(temp[i]);
        }
        return intArray;
    }

}
