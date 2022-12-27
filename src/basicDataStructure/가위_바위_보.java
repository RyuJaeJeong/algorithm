package basicDataStructure;


import java.util.Scanner;

public class 가위_바위_보 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String player1 = sc.nextLine();
        String player2 = sc.nextLine();
        solution(count, player1, player2);
    }

    /**
     * 1(가위)<  2(바위) < 3(보) < 1(가위)
     */
    public static void solution(int count, String player1, String player2){
        String[] player1Array = player1.split(" ");
        String[] player2Array = player2.split(" ");
        String[][] winner = { { "D", "B", "A"}, {"A", "D", "B"}, {"B", "A", "D"} };

        for (int i = 0; i < count; i++) {
            int player1Hand = Integer.parseInt(player1Array[i]);
            int player2Hand = Integer.parseInt(player2Array[i]);
            System.out.println(winner[player1Hand-1][player2Hand-1]);
        }


    }

}
