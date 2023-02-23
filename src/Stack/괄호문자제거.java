package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        try{
            String input = br.readLine().toString();
            solution(input.toCharArray());
        }catch (Exception e){

        }
    }

    /**
     * 해결책
     * @param input
     */
    public static void solution(char[] input){
        int loopSize = input.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < loopSize; i++) {
            stack.push(input[i]);
            if(stack.peek() == ')'){
                while(stack.pop() != '('){}
            }
        }
        String str = "";
        while (stack.size() != 0){
            str += stack.pop();
        }
        String ans = new StringBuffer(str).reverse().toString();
        System.out.println(ans);
    }

}
