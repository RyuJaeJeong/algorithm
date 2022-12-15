package StringSearch;

import java.util.Scanner;

public class 대소문자변환 {

    public static String solution(String input){
        char[] inputArray = input.toCharArray();
        int length = inputArray.length;
        for (int i = 0; i < length; i++) {
            if(65<=inputArray[i]&&inputArray[i]<=90){
                 inputArray[i] = (char) (inputArray[i] + 32);
            }else if(97<=inputArray[i]&&inputArray[i]<=122){
                 inputArray[i] = (char) (inputArray[i] - 32);
            }
        }
        input = inputArray[0]+"";
        for (int i = 1; i < length; i++) {
            input += inputArray[i];
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
}
