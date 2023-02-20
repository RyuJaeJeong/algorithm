package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack 컬렉션 생성
        Stack<Coin> coinStack = new Stack<>();
        
        //동전 넣기
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10));
        
        //동전을 하나씩 꺼내기
        while (!coinStack.isEmpty()){
            Coin coin = coinStack.pop();
            System.out.printf("꺼내온 동전 : " + coin.getValue() + "원\n");
        }
    }
}
