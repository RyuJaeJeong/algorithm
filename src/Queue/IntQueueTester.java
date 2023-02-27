package Queue;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue(5);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n", queue.size(), queue.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4)덤프 (5)서치 (0) 종료 : ");

            int menu = sc.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        queue.enque(x);
                    }catch (Queue.OverflowIntQueueException e){
                        System.out.println("인큐가 가득 찼습니다.");
                    }
                    break;
                case 2 :
                    try{
                        x = queue.deque();
                        System.out.printf("디큐한 데이터는 %d 입니다.\n", x);
                    }catch (Queue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 3 :
                    try{
                        x = queue.peek();
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (Queue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 4 :
                    try{
                        queue.dump();
                    }catch (Queue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 5 :
                    try{
                        System.out.print("데이터 : ");
                        x = sc.nextInt();
                        System.out.printf("해당 데이터는 %d에 있습니다.\n", queue.search(x));
                    }catch (Queue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
            }
        }// --- end while ---
    }
}
