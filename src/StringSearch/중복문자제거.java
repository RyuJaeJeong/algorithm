package StringSearch;

import java.util.Scanner;

public class 중복문자제거 {

    //field
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input){
        StringBuilder result = new StringBuilder("");
        result.append(input.charAt(0));
        int loopLength = input.length();
        for (int i = 1; i < loopLength; i++) {
            if(result.indexOf(input.charAt(i)+"") == -1){
                result.append(input.charAt(i));
            }else{

            }
        }

        return result.toString();
    }
}
