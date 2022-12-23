package StringSearch;

import java.util.Scanner;

public class 단어뒤집기 {

    public static void solution(String[] input){
        int inputLength = input.length;
        for (String word : input) {
            int wordLength = word.length();
            String reverseWord = new StringBuilder(word).reverse().toString();
            /*
                for (int i = wordLength-1; 0 <= i; i--) {
                    reverseWord += word.charAt(i);
                }
            */
            System.out.println(reverseWord);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = "";
        for (int i = 0; i < n; i++) {
            input += sc.next() + ",";
        }

        input = input.substring(0, input.lastIndexOf(","));
        String[] inputArray = input.split(",");
        solution(inputArray);
    }
}
