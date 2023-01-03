package basicDataStructure;

import java.util.Scanner;

public class 소수의_개수_구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        solution(input);
    }


    /**
     * 2부터 input 까지의 배열을 만들어서 소수일 경우, 그 배수를 모두 지워 나가라.
     * @param input 입력 받은 수.
     */
    public static void solution(int input){
        int[] arr = new int[input+1];
        int answer = 0;
        int loopSize = arr.length;
        for (int i = 2; i < loopSize; i++) {
            //배열의 값이 0 인 경우에는 소수
            if(arr[i] == 0){
                answer++;
                //소수의 배수의 인덱스에는 값을 1로 수정
                for (int j = 1; j*i <= input; j++) {
                    arr[j*i] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
