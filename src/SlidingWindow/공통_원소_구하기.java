package SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공통_원소_구하기 {
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
        Arrays.sort(NArray);
        Arrays.sort(MArray);
        String str = "";
        int i = 0;
        int j = 0;
        while (true){
            if(MArray[i] > NArray[j]){
                j++;
            }else if(MArray[i] == NArray[j]){
                str += MArray[i++] + ",";
            }else{
                i++;
            }

            if(i == MSize || j == NSize){
                break;
            }
        }


        String [] arr = str.split(",");
        int loopSize = arr.length;
        for (int k = 0; k < loopSize; k++) {
            System.out.printf("%s ", arr[k]);
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
