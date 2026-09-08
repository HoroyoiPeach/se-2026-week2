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

    public int height() {
        int max_height = 1;
        for (Node child : this.children) {
            if (max_height <= child.height()) {
                max_height += child.height();
            }
        }
        return max_height;
    }
}
