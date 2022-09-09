package recursiveAlgorithm;

import java.util.Scanner;


public class Hanoi {
    /**
     * 하노이의 탑
     * @param no 옮겨야 할 원반의 갯수
     * @param x 시작 기둥의 번호
     * @param y 목표 기둥의 번호
     */
    static void move(int no, int x, int y){
        if(no>1) move(no-1, x, 6-x-y);
        String [] name = {"","A 기둥","B 기둥","C 기둥"};
        System.out.printf("원반[%d]을(를) %s 에서 %s 으로 옮김\n", no, name[x], name[y]);
        if(no>1) move(no-1, 6-x-y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("원반의 갯수 : ");
        int n = sc.nextInt();
        move(n, 1, 2);
    }
}
