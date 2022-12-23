package StringSearch;


import java.util.Scanner;

public class 특정문자_뒤집기 {

    public static void solution(String input){
        char[] inputArray = input.toCharArray();
        int arrayLength = inputArray.length;
        int left = 0;
        int right = arrayLength-1;

        while(left<right){
            if(!Character.isAlphabetic(inputArray[left])){
                left++;
            }else if(!Character.isAlphabetic(inputArray[right])){
                right--;
            }else{
                char tmp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = tmp;
                left++;
                right--;
            }
        }

        String reverseWord = String.valueOf(inputArray);

        System.out.println(reverseWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }
}
