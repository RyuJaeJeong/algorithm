package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LRU {

    //method
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int[] firstRow = StringToIntArr(2, br.readLine());

            int S = firstRow[0];    //캐시의 크기
            int N = firstRow[1];    //작업의 갯수

            int[] workArr = StringToIntArr(N, br.readLine());
            int[] cache = solution(workArr, S, N);
            int loopSize = cache.length;
            for (int i = 0; i < loopSize; i++) {
                System.out.printf("%d ", cache[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * LRU
     * @param workArr 작업번호 배열
     * @param S 캐시메모리 사이즈
     * @param N 작업번호 배열의 길이
     * @return 최종 캐시메모리
     */
    public static int[] solution(int[] workArr, int S, int N){
        int[] cache = new int[S];
        for (int i = 0; i < N; i++) {
            int idx = -1;
            for (int j = 0; j < S; j++) {
                if(workArr[i] ==  cache[j]){
                    idx = j;
                    break;
                }
            }

            if(idx >= 0){   //hit
                int tmp = cache[idx];
                for (int j = idx; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = tmp;
            }else{          //miss
                for (int j = S-1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = workArr[i];
            }
        }

        return cache;
    }

    public static int[] StringToIntArr(int length, String str){
        int[] arr = new int[length];
        StringTokenizer st =new StringTokenizer(str);
        int idx = 0;
        while (st.hasMoreTokens()){
            arr[idx++] = Integer.parseInt(st.nextToken());
        }

        return arr;

    }

}
