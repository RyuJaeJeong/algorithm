package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식연산자 {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //method
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        try{
            String[] arr = br.readLine().split("");
            solution(arr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void solution(String[] arr){
        int loopSize = arr.length;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < loopSize; i++) {
            switch (arr[i]){
                case "+":
                        int no1 = Integer.parseInt(stack.pop());
                        int no2 = Integer.parseInt(stack.pop());
                        int sum = no1 + no2;
                        stack.push(sum+"");
                        break;
                case "-": int no3 = Integer.parseInt(stack.pop());
                          int no4 = Integer.parseInt(stack.pop());
                          int minus = no4 - no3;
                          stack.push(minus+"");
                          break;
                case "*": int no5 = Integer.parseInt(stack.pop());
                          int no6 = Integer.parseInt(stack.pop());
                          int gob = no5 * no6;
                          stack.push(gob+"");
                          break;
                case "/": int no7 = Integer.parseInt(stack.pop());
                          int no8 = Integer.parseInt(stack.pop());
                          int divi = no8 / no7;
                          stack.push(divi+"");
                         break;
                default: stack.push(arr[i]);
                         break;
            }
        }
        System.out.println(stack.peek());
    }
}
