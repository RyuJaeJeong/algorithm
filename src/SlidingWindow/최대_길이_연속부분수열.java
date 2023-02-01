package SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대_길이_연속부분수열 {

    //field
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //method
    public static void main(String[] args) {
        try{
            String[] firstRow = bufferedReader.readLine().split(" ");
            int N = Integer.parseInt(firstRow[0]);
            int K = Integer.parseInt(firstRow[1]);
            String secondRow = bufferedReader.readLine();
            int[] inputArray = StringToIntArray(N, secondRow);
            solution(inputArray, K);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }


    }

    /**
     * @param inputArray 입력받은 정수형 배열
     * @param K 0을 1로 바꿀수 있는 횟수
     */

    public static void solution(int[] inputArray, int K){
        int front = 0;  // 앞쪽 커서
        int rear = front; //뒷쪽 커서
        int cnt = 0;    //0을 1로 몇번 바꿨는지 갯수
        int arraySize = inputArray.length;  //inputArray 길이
        int max = 0;    //최대길이
        while(rear < arraySize){
            if(inputArray[rear] == 0) cnt++;
            if(cnt > K){
                max = ((rear - front)> max)?(rear - front):max;
                front++;
                rear = front;
                cnt = 0;
            }else if(rear >= (arraySize - 1)){
                max = ((rear - front + 1)> max)?(rear - front + 1):max;
                front++;
                rear = front;
                cnt = 0;
            }else{
                rear++;
            }

        }
        System.out.println(max);
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
