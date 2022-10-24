package StringSearch;

import java.util.Scanner;

public class bmMatch {

    static int bmMatch(String txt, String pat){
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1];

        for (pt = 0; pt < Character.MAX_VALUE; pt++) {
            skip[pt] = patLen;
        }

        for (pt = 0; pt < patLen - 1; pt++) {
            skip[pat.charAt(pt)] = patLen - pt -1;
        }

        while (pt < txtLen){
            System.out.printf("%s\n", txt);
            pp = patLen -1;
            while (txt.charAt(pt) == pat.charAt(pp)){
                String temp = "";
                for (int i = 0; i < pt; i++) {
                    temp += " ";
                }
                System.out.printf("%s\n", temp+"+");
                if(pp == 0){
                    System.out.printf("%s\n", temp + pat);
                    return pt;
                }

                pp--;
                pt--;
            }
            if(txt.charAt(pt) != pat.charAt(pp)){
                String temp = "";
                for (int i = 0; i < pt; i++) {
                    temp += " ";
                }
                temp+="-";
                System.out.printf("%s\n", temp);
            }else{
            }
            System.out.printf("%s\n", pat);
            pt += (skip[txt.charAt(pt)] > patLen - pp)?skip[txt.charAt(pt)]:patLen-pp;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = sc.next();

        System.out.print("패 턴: ");
        String s2 = sc.next();

        int index = bmMatch(s1, s2);

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
