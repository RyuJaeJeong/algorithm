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
    private void add(K key, V data){
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
}
