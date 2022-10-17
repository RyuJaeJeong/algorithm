package StringSearch;

import java.util.Scanner;

//p276 실습 7 -1
//p277 연습문제 Q1추가
//비루트-포스법
public class BFMatch {

    static int bfMatch(String text, String pattern){
        int pt = 0; //택스트 스캔 위하여 사용
        int pp = 0; //패턴을 스캔하기 위하여
        int cnt = 0;
        while (pt != text.length() && pp != pattern.length()){
            System.out.printf("%s\n", text);
            String nbsp = "";

            if(text.charAt(pt) == pattern.charAt(pp)){
                for (int i = 0; i < pt; i++) {
                    nbsp += " ";
                }
                nbsp += "+";
                System.out.printf("%s\n", nbsp);
                pt++;
                pp++;
                cnt++;
            }else{
                for (int i = 0; i < pt; i++) {
                    nbsp += " ";
                }
                nbsp += "|";
                System.out.printf("%s\n", nbsp);
                pt = pt - pp + 1;
                pp = 0;
                cnt++;
            }
        }

        System.out.printf("비교를 총 %d회 했습니다.\n", cnt);

        if(pp == pattern.length()){
            return pt - pp;
        }else{
            return -1;
        }
    }

    //가장 뒷쪽의 인덱스를 반환하는 메서드
    static int bfMatchLast(String text, String pattern){
        int pt = text.length() - 1; //택스트 스캔 위하여 사용
        int pp = pattern.length() - 1; //패턴을 스캔하기 위하여
        while (pt != 0 && pp != 0){
            if(text.charAt(pt) == pattern.charAt(pp)){
                pt--;
                pp--;
            }else{
                pt = pt - pattern.length() + pp;
                pp = pattern.length() - 1;
            }
        }

        if(pp == 0){
            return pt;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = sc.next();

        System.out.print("패 턴: ");
        String s2 = sc.next();

        int index = bfMatchLast(s1, s2);

        if(index == -1){
            System.out.println("택스트에 패턴이 없습니다.");
        }else {
            int len = 0;
            for (int i = 0; i < index; i++) {
                len += s1.substring(i, i+1).getBytes().length;
            }
            len += s2.length();

            System.out.println((index+1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트: " + s1);
            System.out.printf(String.format("패턴: %%%ds\n", len), s2);
        }
    }
}
