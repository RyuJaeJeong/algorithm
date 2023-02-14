package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class K번째큰수 {

    //field
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public K번째큰수() {

    }

    //method
    public static void main(String[] args) {
        try {
            String[] firstRow = br.readLine().split(" ");
            int N = Integer.parseInt(firstRow[0]);
            int K = Integer.parseInt(firstRow[1]);
            int[] inputArr = StringToIntArray(N, br.readLine());
            solution(inputArr, K);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param arr
     * @param K
     */
    public static void solution(int[] arr, int K){
        int N = arr.length;
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int first = arr[i];
            for (int j = 0; j < N; j++) {
                if(j == i) continue;
                int second = arr[j];
                for (int k = 0; k < j; k++) {
                    if(k == i) continue;
                    if(k == j) continue;
                    int third = arr[k];
                    tree.add(first + second + third);
                }
            }
        }

        int max = tree.last();
        int cnt = 1;
        while (cnt < K){
            if(tree.lower(max) == null){
                max = -1;
                break;
            }
            max = tree.lower(max);
            cnt ++;
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
