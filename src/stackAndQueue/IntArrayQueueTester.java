package stackAndQueue;

import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        IntArrayQueue queue = new IntArrayQueue(5);
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n", queue.size(), queue.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 피크리어 (5)덤프 (0) 종료 : ");

            int menu = sc.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        queue.push(x);
                    }catch (IntArrayQueue.OverflowIntQueueException e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2 :
                    try{
                        x = queue.pop();
                        System.out.printf("팝한 데이터는 %d 입니다.\n", x);
                    }catch (IntArrayQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 3 :
                    try{
                        x = queue.peakFront();
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (IntArrayQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 4 :
                    try{
                        x = queue.peakRear();
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (IntArrayQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 5 :
                    try{
                        queue.dump();
                    }catch (IntArrayQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
            }
        }// --- end while ---

    }
}
