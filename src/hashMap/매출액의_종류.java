package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 매출액의_종류 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 매출액의_종류() {

    }

    //method
    public static void main(String[] args) {
        try {
            String[] firstRow = br.readLine().split(" ");
            int N = Integer.parseInt(firstRow[0]);
            int K = Integer.parseInt(firstRow[1]);
            int [] secondRow = StringToIntArray(N, br.readLine());
            solution(secondRow, K);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * timeout
     * @param inputArr
     * @param K
     */
    public static void solution(int[] inputArr, int K){
        int front = 0;
        int rear = K-1;
        int N = inputArr.length;
        int loopSize = N-K+1;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> cntMap = new HashMap<>();

        for (int i = front; i <= rear; i++) {
            cntMap.put(inputArr[i], cntMap.getOrDefault(inputArr[i], 0) + 1);
        }

        System.out.print(cntMap.size()+" ");

        while (rear < inputArr.length - 1){
            cntMap.put(inputArr[front], cntMap.getOrDefault(inputArr[front], 0)-1);

            if(cntMap.getOrDefault(inputArr[front], 0) == 0){
                cntMap.remove(inputArr[front]);
            }
            front++;

            cntMap.put(inputArr[++rear], cntMap.getOrDefault(inputArr[rear], 0)+1);

            Set<Integer> keys = cntMap.keySet();
            Iterator keyIterator = keys.iterator();
            int count = 0;
            while (keyIterator.hasNext()){
                if(cntMap.get(keyIterator.next()) > 0){
                    count++;
                }
            }
            System.out.print(cntMap.size()+" ");
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
