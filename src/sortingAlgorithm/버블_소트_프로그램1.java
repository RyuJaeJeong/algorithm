package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 버블_소트_프로그램1 {

    //method
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            solution(N, arr);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    /**
     * 전달 받을 배열을 정렬
     * @param N 배열의 길이
     * @param arr 대상 배열
     */
    public static void solution(int N, int[] arr){
       int [] beforeArr = Arrays.copyOf(arr, N);
       int [] afterArr = arr;
       Arrays.sort(arr);
       Map<Integer, Integer> beforeMap = new HashMap<>();
       Map<Integer, Integer> afterMap = new HashMap<>();
       
       //각 요소별로 인덱스 저장
       for (int i = 0; i < N; i++) {
            beforeMap.put(beforeArr[i], i);
            afterMap.put(afterArr[i], i);
       }

       Set<Integer> keys = beforeMap.keySet();
       Iterator<Integer> keyIterator = keys.iterator();
       int answer = 0;
       while(keyIterator.hasNext()){
            int key = keyIterator.next();
            int beforeIdx = beforeMap.get(key);
            int afterIdx = afterMap.get(key);
            if(beforeIdx-afterIdx > answer) answer = beforeIdx-afterIdx;
       }
        System.out.println(answer+1);
    }
}
