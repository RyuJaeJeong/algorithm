package StringSearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문장_속_단어 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input){
        String[] arr = input.split(" ");
        String maxWord = "";
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if(arr[i].length()>maxWord.length()) maxWord = arr[i];
        }

        return maxWord;
    }
}
