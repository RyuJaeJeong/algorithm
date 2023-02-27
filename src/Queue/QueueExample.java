package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.add(new Message("sendMail", "홍길동"));
        messageQueue.add(new Message("sendSMS", "신용권"));
        messageQueue.add(new Message("sendKaKaoTalk", "김자바"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            System.out.printf("%s님에게 %s 했습니다.\n", message.to, message.command);
        }
    }
}
