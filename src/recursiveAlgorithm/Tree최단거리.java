package recursiveAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Tree최단거리 {

    //field
    private Node root;

    //method
    public static void main(String[] args) {
        Tree최단거리 tree = new Tree최단거리();
        tree.root = new Node(1);
        tree.root.lt  = new Node(2);
        tree.root.rt  = new Node(3);
        tree.root.lt.lt  = new Node(4);
        tree.root.lt.rt  = new Node(5);
        System.out.println(tree.solution(tree.root));
    }

    /**
     * Tree 최단거리(DFS)
     * @param distance
     * @param root
     * @return
     */
    public int solution(int distance, Node root){
        if(root.lt == null && root.rt == null){     //막내노드일때.
            return distance;
        }else{          //아닐때.
            return Math.min(solution(distance+1, root.lt), solution(distance+1, root.rt));
        }
    }

    /**
     * Tree 최단거리(BFS)
     * @param root
     * @return
     */
    public int solution(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int loopSize = queue.size();
            for (int i = 0; i < loopSize; i++) {
                  Node node = queue.poll();
                  if(node.lt == null && node.rt == null) return level;
                  if(node.lt != null) queue.add(node.lt);
                  if(node.rt != null) queue.add(node.rt);
            }
            level++;
        }
        return 0;
    }

}
