package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 연속부분수열 {

    //field
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 연속부분수열() {

    }

    //method
    public static void main(String[] args) throws IOException {
           String[] firstRow = br.readLine().split(" ");
           int N = Integer.parseInt(firstRow[0]);
           int M = Integer.parseInt(firstRow[1]);
           int [] secondRow = StringToIntArray(N, br.readLine());
           solution(N, M, secondRow);
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

    public static void solution(int size, int M, int[] inputArray){
        int cnt = 0;
        int left = 0;
        int right = 0;

        while(left<size){
            int sum = inputArray[left];
            for (int i = left+1; i <= right; i++) {
                sum += inputArray[i];
            }

            if(M > sum){
                right = (right+1>=size)?++left:right+1;
            }else if(M == sum){
                cnt++;
                right = ++left;
            }else{
                right = ++left;
            }
        }

        System.out.println(cnt);
    }
}
