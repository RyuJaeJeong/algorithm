package SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 두_배열_합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int NSize = Integer.parseInt(bf.readLine());
        int[] NArray = StringToIntArray(NSize, bf.readLine());
        int MSize = Integer.parseInt(bf.readLine());
        int[] MArray = StringToIntArray(MSize, bf.readLine());
        solution(NArray, MArray);
    }

    public static void solution(int[]NArray, int[]MArray){
        int NSize = NArray.length;
        int MSize = MArray.length;
        int arrSize = NSize + MSize;
        int [] arr = new int[arrSize];
        int loopSize = arr.length;

        int frontCursor = 0;
        while (true){
            int backCursor = frontCursor + NSize;

            if(frontCursor < NSize) arr[frontCursor] = NArray[frontCursor];
            if(backCursor < arrSize) arr[backCursor] = MArray[frontCursor];

            if(frontCursor == ((MSize>NSize)?MSize-1:NSize-1)){
                break;
            }else{
                frontCursor++;
            }

        }

        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("%d ", arr[j]);
        }
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
