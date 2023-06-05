package recursiveAlgorithm.재귀함수_기초;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3_팩토리얼 {

    //field
    public int answer = 1;

    //method
    public static void main(String[] args) {
        try {
            No3_팩토리얼 obj = new No3_팩토리얼();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            System.out.println(obj.DFS(N));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int DFS(int N){
        if(N == 1){
            /*System.out.println(answer);
            answer = 1;*/
            return 1;
        } else{
            return N * DFS(N-1);
        }
    }
}
