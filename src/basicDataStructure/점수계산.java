package basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산 {

    //method
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        String point = br.readLine();
        String [] pointArray = point.split(" ");
        solution(count, pointArray);
    }

    public static void solution(String count, String[] pointArray){
        int loopSize = Integer.parseInt(count);
        int plusPoint = 0; //가산점
        int totalPoint = 0; //점수 합계
        for (int i = 0; i < loopSize; i++) {
            if(pointArray[i].equals("1")){
                totalPoint += ++plusPoint;
            }else{
                plusPoint = 0;
            }
        }
        System.out.printf("%d", totalPoint);
    }

}
