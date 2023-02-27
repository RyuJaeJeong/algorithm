package Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 공주구하기 {

    //field
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 메인 메서드
     * @param args
     */
    public static void main(String[] args) {
        try{
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            solution(N, K);
        }catch (Exception e){

        }
    }

/*    public static void solution(int N, int K){
        int[] arr = new int[N];
        int loopSize = arr.length;
        for (int i = 0; i < loopSize; i++) {
            arr[i] = i+1;
        }

        Stack<Integer> stk = new Stack<>();
        int pointer = 0;
        int zeroCnt = 0;

        while (zeroCnt<N-1){
            // 1. 배열을 선형 탐색하면서 stack에 값을 push
            if(arr[pointer] >0){
                stk.push(arr[pointer]);
            }else{
                if(pointer >= N-1){
                    pointer = 0;
                }else{
                    pointer++;
                }
                continue;
            }

            // 2. 사이즈가 3이되면 pop
            if(stk.size() >= K){
                int outer = stk.pop();
                arr[outer-1] = 0;
                zeroCnt++;
                stk.clear();
            }



            //3.  pointer가
            if(pointer >= N-1){
                pointer = 0;
            }else{
                pointer++;
            }
        }

        int ans = 0;
        for (int i = 0; i < loopSize; i++) {
            if(arr[i] != 0) ans = arr[i];
        }
        System.out.println(ans);
    }*/

    public static void solution(int N, int K){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        int cnt = 1;
        while(queue.size()>1){
            int now = queue.poll();
            if(cnt < K){
                queue.add(now);
                cnt++;
            }else{
                cnt = 1;
            }
        }

        System.out.println(queue.peek());
    }
}
