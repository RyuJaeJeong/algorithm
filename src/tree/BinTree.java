package tree;

import java.util.Comparator;

public class BinTree<K, V> {
    
    //field
    static class Node<K, V>{    //노드
        //field
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;
        
        //cons
        public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        //method
        K getKey() {
            return key;
        }

        V getValue() {
            return data;
        }

        void print(){
            System.out.println(data);
        }

    }
    private Node<K, V> root;
    private Comparator<? super K> comparator = null;


    //cons
    public BinTree() {  //comparator 없기때문에 자연수 순서로
        root = null;
    }

    public BinTree(Comparator<? super K> c) {
        this(); //메서드 오버로딩을 통해 root가 null인 BinTree를 생성해서 전달해줌
        comparator = comparator;
    }

    //method

    /**
     * 두 키 값을 비교하는 메서드
     * @param key1
     * @param key2
     * @return
     */
    private int comp(K key1, K key2){
        return (comparator == null)?((Comparable<K>)key1).compareTo(key2):comparator.compare(key1, key2);
    }

    /**
     * 키값을 검색하는 메서드
     * @param key 탐색 할 키값
     * @return value
     */
    public V search(K key){
        Node<K, V> p = root;
        while(true){
            if(p == null) return null;

            int cond = comp(key, p.getKey());
            if(cond == 0){
                return p.getValue();
            }else if(cond < 0){
                p = p.left;
            }else{
                p = p.right;
            }
        }
    }

    /**
     * 노드를 삽입
     * @param key
     * @param data
     */
    public void add(K key, V data){
        if(root == null)
            root = new Node<K,V>(key, data, null, null);
        else
            addNode(root, key, data);
    }

    /**
     * node를 루트로 하는 서브트리에 노드<K, V>를 삽입
     * @param node 서브트리의 노드
     * @param key 추가할 노드의 key값
     * @param data 추가할 노드의 value
     */
    private void addNode(Node<K,V> node, K key, V data){
        int cond = comp(key, node.getKey());
        if(cond == 0){
            return;         //키가 이미 이진트리 안에 있음
        }else if(cond < 0){
            if(node.left == null)
                node.left = new Node<K, V>(key, data, null, null);
            else
                addNode(node.left, key, data);
        }else{
            if(node.right == null)
                node.right = new Node<K, V>(key, data, null, null);
            else
                addNode(node.right, key, data);
        }
    }

    /**
     * 해당 Node 삭제
     * @param key 삭제할 노드의 key값
     * @return
     */
    public boolean remove(K key){
        Node<K,V> p = root;
        Node<K,V> parent = null;
        boolean isLeftChild = true;

        while(true){
            if(p == null) return false;     //더이상 나아 갈 수 없다면
            int condition = comp(key, p.getKey());
            if(condition == 0){             //같으면 검색성공
                break;
            }else{
                parent = p;                 //가지로 내려가기 전에 부모 설정
                if(condition < 0){
                    isLeftChild = true;
                    p = p.left;
                }else{
                    isLeftChild = false;
                    p = p.right;
                }

            }
        }

        if(p.left == null){
            if(p == root){
                root = p.right;
            }else if(isLeftChild){
                parent.left = p.right;
            }else{
                parent.right = p.right;
            }
        }else if(p.right == null){
            if(p == root){
                root = p.left;
            }else if(isLeftChild){
                parent.left = p.left;
            }else{
                parent.right = p.left;
            }
        }else{      //노드가 2개일때
            parent = p;
            Node<K,V> left = p.left;
            isLeftChild = true;
            while(left.right != null){
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key;
            p.data = left.data;
            if(isLeftChild){
                parent.left = left.left;
            }else{
                parent.right = left.left;
            }
        }

        return true;
    }

    private void printSubTree(Node node){
        if(node != null){
            printSubTree(node.left);
            System.out.println(node.key + " " + node.data);
            printSubTree(node.right);
        }
    }

    public void print(){
        printSubTree(root);
    }

    private void printSubTreeReverse(Node node){
        if(node != null){
            printSubTreeReverse(node.right);
            System.out.println(node.key + " " + node.data);
            printSubTreeReverse(node.left);

        }
    }

    /**
     * 모든 키 값의 내림차순으로 정렬 하는 메서드
     */
    public void printReverse(){
        printSubTreeReverse(root);
    }

    /**
     * @return 가장 작은 키값을 반환
     */
    public K getMinKey(){
        Node<K,V> p = root;
        if(p == null) return null;
        while(true){
            if(p.left == null){
                return p.getKey();
            }else {
                p = p.left;
            }
        }
    }

    /**
     * @return 가장 작은 키값을 갖는 데이터를 반환
     */
    public V getDataWithMinKey(){
        Node<K,V> p = root;
        if(p == null){
            return null;
        }else {
            while(p.left != null){
                p = p.left;
            }
            return p.getValue();
        }
    }

    /**
     * @return 가장 큰 키값을 반환
     */
    public K getMaxKey(){
        Node<K,V> p = root;
        if(p == null){
            return null;
        }else {
            while(p.right != null){
                p = p.right;
            }
            return p.getKey();
        }
    }

    /**
     * @return 가장 큰 키값을 갖는 데이터를 반환
     */
    public V getDataWithMaxKey(){
        Node<K,V> p = root;
        if(p == null){
            return null;
        }else {
            while(p.right != null){
                p = p.right;
            }
            return p.getValue();
        }
    }

}
