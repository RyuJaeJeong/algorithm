package basicDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 실습2_6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다 ");

        do {
            do {
                System.out.println("변환하는 음이 아닌 정수 ");
                no = sc.nextInt();
            }while(no<0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2~36)");
                cd = sc.nextInt();
            }while (cd<2||cd>36);

            dno = cardConv(no, cd, cno);
            System.out.print(cd+"진수로 ");
            System.out.print(Arrays.toString(cno));
            System.out.print("입니다.");
            System.out.println("한번 더 할까요 (1.예 / 0.아니오 )");
            retry = sc.nextInt();
        }while (retry != 0);
    }

    /**
     * @param x ~~진수로 변환 할 10진수
     * @param r ~~진수 할때 ~~
     * @param d x를 r로 나눈 나머지값을 저장 할 공간
     *
     * 정수 x를 r진수로 변환한 숫자 문자를 char형
     * 배열 d에 넣어두고 그 자릿수를 변환합니다.
     *
     * */

    public static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do{
            d[digits++] = dchar.charAt(x%r);
            System.out.println(r+"|          "+x);
            System.out.println("  +-------------");
            x /= r;
        }while(x!=0);
        System.out.println("               "+x+" --- " + d[digits-1]);
        for (int i = 0; i < d.length; i++) {
            char temp = d[i];
            d[i] = d[d.length-1-i];
            d[d.length-1-i] = temp;
        }

        return digits;
    }
}
