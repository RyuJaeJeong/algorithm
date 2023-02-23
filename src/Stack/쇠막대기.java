package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 쇠막대기 {

    //field
    public static class Data{
        //field
        int index;
        char str;

        public Data(int index, char str) {
            this.index = index;
            this.str = str;
        }

        public int getIndex() {
            return index;
        }

        public char getStr() {
            return str;
        }
    }

    /**
     * 메인메서드
     * @param args
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            solution2(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 내가 낸 해답
     * @param input (((()(()()))(())()))(()())
     */
    public static void solution(String input){
        char[] arr = input.toCharArray();
        int loopSize = arr.length;
        char before = arr[0];

        for (int i = 1; i < loopSize; i++) {
            if (before == '('&&arr[i]==')'){
                arr[i] = '0';
                arr[i-1] = '0';
            }
            before = arr[i];
        }

        Stack<Data> stack = new Stack<>();
        int barCount = 0;
        for (int i = 0; i < loopSize; i++) {
            if(arr[i] == '('){
                stack.push(new Data(i, arr[i]));
            }else if(arr[i] == ')'){
                Data left = stack.pop();
                int bimCount = 0;
                for (int j = left.getIndex()+1; j < i; j++) {
                    if(arr[j] == '0'){
                        bimCount++;
                    }
                }
                barCount += bimCount/2 + 1;
            }
        }

        System.out.println(barCount);

    }


    /**
     * 강사가 낸 해답
     * @param input (((()(()()))(())()))(()())
     */
    public static void solution2(String input){
        char[] arr = input.toCharArray();
        int loopSize = arr.length;
        Stack<Character> stk = new Stack<>();
        int ans = 0;
        for (int i = 0; i < loopSize; i++) {
            if(arr[i] == '('){
                stk.push(arr[i]);
            }else if(arr[i] == ')'){
                stk.pop();  //레이저 이든, 쇠막대기 끝부분이든, 앞에꺼 pop해야함.
                switch (arr[i-1]){
                    case '(' : ans+=stk.size();
                               break;
                    case ')' : ans++;
                               break;
                }
            }
        }
        System.out.println(ans);
    }



}
