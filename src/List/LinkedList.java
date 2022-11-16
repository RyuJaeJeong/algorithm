package List;

import java.util.Comparator;

public class LinkedList<E> {

    // field
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

    // cons
    public LinkedList() {
        head = crnt = null;
    }

    /**
     * method
     */
    public E search(E obj, Comparator<? super E> c){
        //ptr을 머릿노드로 초기화
        Node<E> ptr = head;

        //키 값과 현재 노드가 같을 때 까지 검색
        while (ptr != null){
            if(c.compare(obj, ptr.data) == 0){
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next; //다음 노드 선택
        }
        return null;    //검색 실패 
    }

    /**
     * 머리에 노드 삽입
     */
    public void addFirst(E obj){
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    /**
     * 꼬리에 노드 삽입
     */
    public void addLast(E obj){
        if(head == null){
            addFirst(obj);
        }else{
            Node<E> ptr = head;
            while (ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    /**
     * 머리노드를 삭제하는 메서드
     */
    public void removeFirst(){
        if(head != null) head = crnt = head.next;
    }

    /**
     * 꼬리노드를 삭제하는 메서드
     */
    public void removeLast(){
        if(head != null) {
            if(head.next == null){
                removeFirst();
            }else{
                Node<E> ptr = head;
                Node<E> pre = head;
                while (ptr.next != null){
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null;
                crnt = pre;
            }
        }
    }

    /**
     * 노드 p를 삭제
     */
    public void remove(Node p){
        if(head !=null){
            if(p == head){
                removeFirst();
            }else{
                Node<E> ptr = head;
                while (ptr.next != p){
                    ptr = ptr.next;
                    if(ptr == null) return;
                }
                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

    /**
     * 선택 노드를 삭제
     */
    public void removeCurrentNode(){
        remove(crnt);
    }

    /**
     * 모든 노드를 삭제
     */
    public void clear(){
        while (head != null){
            removeFirst();
        }
        crnt = null;
    }

    /**
     * 선택 노드를 하나 뒤로 진행
     */
    public boolean next(){
        if(crnt == null || crnt.next == null){
            return false;
        }
        crnt = crnt.next;
        return true;
    }

    /**
     * 선택 노드를 출력
     */
    public void printCurrentNode(){
        if(crnt == null){
            System.out.println("선택한 노드가 없습니다.");
        }else{
            System.out.println(crnt.data);
        }
    }

    /**
     * 선택 노드를 출력
     */
    public void dump(){
        Node<E> ptr = head;
        while(ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

}
