package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 연속된_자연수의_합 {

    //field
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 연속된_자연수의_합() {

    }

    //method
    public static void main(String[] args) {

        try{
            int N = Integer.parseInt(br.readLine());
            solution(N);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }

    static void solution(int N) {
        int [] numArr = new int[N/2+1];
        int loopSize = numArr.length;
        for (int i = 0; i < loopSize; i++) {
            numArr[i] = i + 1;
        }

        int cnt = 0;
        int left = 0;
        int right = 0;

        while(left<loopSize){
            int sum = numArr[left];
            for (int i = left+1; i <= right; i++) {
                sum += numArr[i];
            }

            if(N > sum){
                right = (right+1>=loopSize)?++left:right+1;
            }else if(N == sum){
                cnt++;
                right = ++left;
            }else{
                right = ++left;
            }
        }


        System.out.printf("%d\n", cnt);

    }

}
