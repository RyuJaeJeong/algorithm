package stackAndQueue;

import java.util.Scanner;

public class DequeTester {
    public static void main(String[] args) {
        Deque deque = new Deque(6);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n", deque.size(), deque.getCapacity());
            System.out.print("(1) 오퍼_1 (2) 오퍼_2 (3) 폴_1 (4)폴_2 (5)피크_1  (6)피크_2 (0) 종료 : ");

            int menu = sc.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        deque.addFirst(x);
                    }catch (Deque.OverflowDequeueException e){
                        System.out.println("덱이 가득 찼습니다.");
                    }
                    break;
                case 2 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        deque.addLast(x);
                    }catch (Deque.OverflowDequeueException e){
                        System.out.println("덱이 가득 찼습니다.");
                    }
                    break;
                case 3 :
                    try{
                        x = deque.pollFirst();
                        System.out.printf("폴한 데이터는 %d 입니다.\n", x);
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
                case 4 :
                    try{
                        x = deque.pollLast();
                        System.out.printf("폴한 데이터는 %d 입니다.\n", x);
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
                case 5 :
                    try{
                        x = deque.peekFirst();
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
                case 6 :
                    try{
                        x = deque.peekLast();
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
                case 7 :
                    try{
                        deque.dumpFirst();
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
                case 8 :
                    try{
                        deque.dumpLast();
                    }catch (Deque.EmptyDequeueException e){
                        System.out.println("덱이 비어있습니다.");
                    }
                    break;
            }
        }// --- end while ---
    }
}
