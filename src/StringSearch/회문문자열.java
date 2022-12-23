package StringSearch;

import java.util.Scanner;

public class 회문문자열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input){
        input = input.toLowerCase();
        String reverseInput = new StringBuilder(input).reverse().toString().toLowerCase();
        if(input.equals(reverseInput)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
