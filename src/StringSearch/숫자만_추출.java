package StringSearch;

import java.util.Scanner;

public class 숫자만_추출 {

    public static void solution(String input){
        input = input.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(input));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }
}
