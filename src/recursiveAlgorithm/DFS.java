package recursiveAlgorithm;

public class DFS {

    //field
    public Node root;

    //생성자
    public DFS() {

    }

    //method
    public static void main(String[] args) {
        DFS dfs = new DFS();
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
     * 재귀함수 이용한 트리 탐색
     * @param root 탐색할 노드
     */
    public void solution(Node root){
        if(root == null){

        }else{
            solution(root.lt);
            solution(root.rt);
            System.out.printf("%d ", root.data);
        }
    }

}

