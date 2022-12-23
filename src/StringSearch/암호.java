package StringSearch;

import sun.misc.FloatingDecimal;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        String word = sc.nextLine();
        for (int i = 0; i < word.length()-1; i+=7) {
            String character = word.substring(i, i+7);
            character = character.replaceAll("#", "1");
            character = character.replaceAll("[*]", "0");
            System.out.print((char)Integer.parseInt(character, 2));
        }
    }
}
