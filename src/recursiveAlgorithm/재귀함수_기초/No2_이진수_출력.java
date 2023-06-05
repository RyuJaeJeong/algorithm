package recursiveAlgorithm.재귀함수_기초;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2_이진수_출력 {

    //method
    public static void main(String[] args) {
        try {
            No2_이진수_출력 obj = new No2_이진수_출력();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            obj.DFS(N);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void DFS(int N){
        if(N == 0) return;
        else{
            DFS(N/2);
            System.out.print(N%2);
        }
    }
}
