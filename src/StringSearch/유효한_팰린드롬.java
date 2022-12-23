package StringSearch;

import java.util.Scanner;

public class 유효한_팰린드롬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input){
        input = input.toLowerCase();
        char [] inputArray = input.toCharArray();
        int looplength = inputArray.length;
        //알파벳 아닌 글자들 제거
       /* for (int i = 0; i < looplength; i++) {
            if(!Character.isAlphabetic(inputArray[i])){
                input = input.replace(inputArray[i]+"", "");
            }else{
                
            }
        }*/
        input = input.replaceAll("[^A-Z]", "");

        String reverseInput = new StringBuilder(input).reverse().toString();
        if(input.equals(reverseInput)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }


}
