package Stack;

import java.util.Scanner;

public class IntStackTwiceTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStackTwice stack = new IntStackTwice(3, 3);

        while(true){
            System.out.print("어디에?");
            char where = sc.next().charAt(0);

            if(where == 'A'){
                System.out.printf("현재 데이터의 개수 : %d / %d\n", stack.size('A'), stack.getCapacity('A'));
            }else if(where == 'B'){
                System.out.printf("현재 데이터의 개수 : %d / %d\n", stack.size('B'), stack.getCapacity('B'));
            }

            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");
            int menu = sc.nextInt();
            if(menu == 0) break;
            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        stack.push(where, x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2 :
                    try{
                        x = stack.pop(where);
                        System.out.printf("팝한 데이터는 %d 입니다.\n", x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3 :
                    try{
                        x = stack.peak(where);
                        System.out.printf("피크한 데이터는 %d 입니다.\n", x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 4 :
                    stack.dump(where);
                    break;
            }
        }
    }
}
