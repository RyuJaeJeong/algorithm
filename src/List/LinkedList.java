package List;

public class LinkedList<E> {

    class Node<E>{
        private E data;         // 데이터
        private Node<E> next;   // 뒷쪽 포인터

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; //머리 포인터
    private Node<E> crnt; //선택 포인터

    public LinkedList() {
        head = crnt = null;
    }
}
