import java.util.ArrayList;
import java.util.List;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    //TODO: 매소드 hasChild(), height(), dfs(), bfs() 구현

    public boolean hasChild() {
        return !this.children.isEmpty();
    }

    // 가장 높은 자식의 높이에 현재 노드의 높이 1을 더한다.
    public int height() {
        int maxHeight = 0;
        for (Node child : this.children) {
            maxHeight = Math.max(maxHeight, child.height());
        }
        return maxHeight + 1;
    }

    public void dfs() {
        System.out.println(this.label);
        for (Node child : this.children) {
            child.dfs();
        }
    }

    public void bfs() {
        List<Node> queue = new ArrayList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            Node current = queue.remove(0);
            System.out.println(current.label);
            queue.addAll(current.children);
        }
    }
    
}
