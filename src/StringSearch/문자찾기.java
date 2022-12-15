package StringSearch;

import java.util.Scanner;

public class 문자찾기 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String find = sc.next();
        char findChar = find.toLowerCase().charAt(0);
        System.out.println(solution(input, findChar));
    }

    public static int solution(String input, char findChar){
        input = input.toLowerCase();

        int length = input.length();
        int cnt = 0;
       /* for (int i = 0; i < length; i++) {
            if(input.charAt(i) == findChar) cnt++;
        }*/
        for (Character c: input.toCharArray()) {
            if(c == findChar) cnt++;
        }


        return cnt;
    }
}
