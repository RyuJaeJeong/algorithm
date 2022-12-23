package StringSearch;

import java.util.Scanner;

public class 문자열_압축 {

    public static String solution(String input){
        String result = input.charAt(0) + "";
        int cnt  = 1;

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1)){
                cnt++;
            }else{
                if(cnt > 1){
                    result += cnt + "" + input.charAt(i);
                }else{
                    result += input.charAt(i);
                }
                cnt = 1;
            }
        }
        if(cnt>1) result+=cnt;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        System.out.println(solution(input1));
    }
}
