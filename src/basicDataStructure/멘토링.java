package basicDataStructure;

import java.util.Scanner;

/**
 * 다차원 배열
 */
public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NM = sc.nextLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        int[][] inputArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            String temp = sc.nextLine();
            inputArray[i] = StringToIntArray(n, temp);
        }

        solution(m, n, inputArray);
    }

    public static void solution(int m, int n, int[][] inputArray){
        int[][] winCount = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = n-1; k > j; k--) {
                    winCount[inputArray[i][j]][inputArray[i][k]]++;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < winCount.length; i++) {
            for (int j = 0; j < winCount[i].length; j++) {
                if(winCount[i][j] == m) cnt++;
            }
        }

        System.out.println(cnt);

    }

    /**
     * " " 공백포함한 문자열을 받아 정수형 배열을 반환
     * @param size 배열의 길이
     * @param text 대상이 되는 문자열
     * @return 정수형 배열
     */
    public static int[] StringToIntArray(int size, String text){
        String[] temp = text.split(" ");
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.parseInt(temp[i]);
        }
        return intArray;
    }
}
