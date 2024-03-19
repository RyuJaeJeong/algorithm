package basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int[] inputArr = new int[N];
        int i = 0;
        while (st.hasMoreTokens()){
            inputArr[i++] = Integer.parseInt(st.nextToken());
        }

        solution(N, K, inputArr);
    }


    public static void solution(int N, int K, int[] inputArr){
        int front = 0;
        int rear = front + (K-1);
        int sum = 0;
        for (int i = front; i <= rear; i++) {
            sum += inputArr[i];
        }
        int max = sum;
        while ((N-1) > rear){
            sum = sum - inputArr[front++] + inputArr[++rear];
            if(max<sum) max = sum;
        }

        System.out.println(max);
    }

}
