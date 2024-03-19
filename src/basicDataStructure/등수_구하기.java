package basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 등수_구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        String point = br.readLine();
        String [] inputArray = point.split(" ");
        solution(count, inputArray);
    }

    /**
     * 배열의 탐색
     * @param count
     * @param inputArray
     */
    public static void solution(String count, String[] inputArray){
        int size = Integer.parseInt(count);
        Integer [] pointArray = new Integer[size];   //입력 받은 배열 정수형 배열로 수정.
        int[] reversePoint = new int[size];
        for (int i = 0; i < size; i++) {
            pointArray[i] = Integer.parseInt(inputArray[i]);
        }

        //배열을 내림차순으로 정렬 하는 방법
        Arrays.sort(pointArray, Collections.reverseOrder());
        /*Arrays.sort(pointArray);
        for (int i = 0; i < size; i++) {
            reversePoint[i] = pointArray[size-1-i];
        }*/
       /* for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < reversePoint.length; j++) {
                if(inputArray[i].equals(reversePoint[j]+"")){
                    System.out.printf("%d ", j+1);
                    break;
                }
            }
        }*/

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < pointArray.length; j++) {
                if(inputArray[i].equals(pointArray[j]+"")){
                    System.out.printf("%d ", j+1);
                    break;
                }
            }
        }
    }
}
