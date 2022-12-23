package StringSearch;

import java.util.Scanner;

public class 가장_짧은_문자거리 {

    /**
     * 내가 낸 해답.
     */
    public static void solution(String input1, String input2){
        String input2Position = "";
        int loopLength = input1.length();
        for (int i = 0; i < loopLength; i++) {
            if(input1.charAt(i) == input2.charAt(0)){
                input2Position += i + ",";
            }
        }

        input2Position = input2Position.substring(0, input2Position.length()-1);
        String[] position = input2Position.split(",");
        String result = "";
        for (int i = 0; i < loopLength; i++) {
            int minDistance = 0;
            for (int j = 0; j < position.length; j++) {
                int distance = (Integer.parseInt(position[j]) - i >= 0)?Integer.parseInt(position[j]) - i:(Integer.parseInt(position[j]) - i)*-1;
                if(j == 0) minDistance = distance;
                if(minDistance>distance) minDistance = distance;
            }
            if(i != loopLength-1){
                result += minDistance+" ";
            }else{
                result += minDistance;
            }

        }
        System.out.println(result);
    }

    /**
     * 강사가 낸 해답.
     */
    public static int[] solution2(String input1, String input2){
        int input1Length = input1.length();
        int[] answer = new int[input1Length];
        int p = 1000;
        for (int i = 0; i < input1Length; i++) {
            if(input1.charAt(i) == input2.charAt(0)){
                p = 0;
                answer[i] = p;
            }else{
                answer[i] = ++p;
            }
        }

        for (int i = input1Length-1; i >= 0; i--) {
            if(input1.charAt(i) == input2.charAt(0)){
                p = 0;
                answer[i] = p;
            }else{
               answer[i] = Math.min(answer[i],++p);
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        int [] answer = solution2(input1, input2);
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
