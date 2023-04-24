package recursiveAlgorithm;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    //field
    public Node root;

    //생성자
    public BFS() {

    }

    //method
    public static void main(String[] args) {
        BFS dfs = new BFS();
        dfs.root = new Node(1);
        dfs.root.lt = new Node(2);
        dfs.root.rt = new Node(3);
        dfs.root.lt.lt = new Node(4);
        dfs.root.lt.rt = new Node(5);
        dfs.root.rt.lt = new Node(6);
        dfs.root.rt.rt = new Node(7);
        dfs.solution(dfs.root);
    }

    /**
     * 재귀함수 이용한 트리 탐색(BFS)
     * @param root 탐색할 노드
     */
    public void solution(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int Level = 0;

        while(!queue.isEmpty()){
            System.out.print(Level + " : ");
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if(current.lt != null) queue.offer(current.lt);
                if(current.rt != null) queue.offer(current.rt);
            }
            Level++;
            System.out.println();

        }
    }

}

