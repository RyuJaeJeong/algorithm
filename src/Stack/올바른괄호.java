package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른괄호 {

    //field
    public static BufferedReader br;

    //cons

    //method
    public static void main(String[] args) {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine().toString();
            System.out.println(solution(input));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String solution(String input){
        char [] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        int loopSize = arr.length;
        String answer = "";
        for (int i = 0; i < loopSize; i++) {
            if(arr[i] == '('){
                stack.push(arr[i]);
            }else{
                if(stack.isEmpty()){
                    return  "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.size()>0){
            answer = "NO";
        }else{
            answer = "YES";
        }

        return answer;

    }
}
