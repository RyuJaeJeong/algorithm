package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 크레인_인형뽑기 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    //method

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        try{
            int boardSize = Integer.parseInt(br.readLine());
            int[][] board = new int[boardSize][boardSize];
            for (int i = 0; i < boardSize; i++) {
                board[i] = StringToIntArray(boardSize, br.readLine().toString());
            }
            int movesSize = Integer.parseInt(br.readLine());
            int[] moves = StringToIntArray(movesSize, br.readLine());
            solution(board, moves);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void solution(int[][] board, int[] moves){
        int loopSize = moves.length;
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < loopSize; i++) {
            int move = moves[i];
            int innerLoopSize = board.length;
            for (int j = 0; j < innerLoopSize; j++) {
                int nowCrain = board[j][move-1];
                if(nowCrain != 0){
                    if(stack.isEmpty()){
                        stack.push(nowCrain);
                        board[j][move-1] = 0;
                    }else{
                        if(stack.peek() == nowCrain){
                            stack.pop();
                            cnt+=2;
                        }else{
                            stack.push(nowCrain);
                        }
                        board[j][move-1] = 0;
                    }
                    break;
                }
            }

        }

        System.out.println(cnt);
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
