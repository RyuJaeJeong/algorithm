package basicDataStructure;


import java.util.Scanner;

public class 뒤집은_소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String nums = sc.nextLine();
        String[] numArr = nums.split(" ");
        solution(count, numArr);

    }

    public static void solution(int count, String[] numArr){
        int[] aloneNumArr = new int[100001];
        aloneNumArr[0] = 1;
        aloneNumArr[1] = 1;
        int loopSize = aloneNumArr.length;
        int cnt = 0;
        for (int i = 2; i < loopSize; i++) {
            cnt++;
            //배열의 값이 0 인 경우에는 소수
            if(aloneNumArr[i] == 0){
                //소수의 배수의 인덱스에는 값을 1로 수정
                for (int j = 2; j*i <= 100000; j++) {
                    aloneNumArr[j*i] = 1;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            String num = numArr[i];
            String reverseNumTxt = "";
            for (int j = num.length()-1; j >= 0; j--) {
                reverseNumTxt += num.charAt(j) + "";
            }
            int reverseNum = Integer.parseInt(reverseNumTxt);
            if(aloneNumArr[reverseNum] == 0){
                System.out.printf("%d ", reverseNum);
            }
        }

    }
}
