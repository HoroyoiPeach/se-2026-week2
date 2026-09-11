public class Example {

    public static void main(String[] args) {
        Node root = new Node("Root");
        Node child1 = new Node("Child 1");
        Node child2 = new Node("Child 2");
        Node grandchild1 = new Node("Grandchild 1");
        Node grandchild2 = new Node("Grandchild 2");

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        System.out.println("Root label: " + root.label);
        System.out.println("Children of Root:");
        for (Node child : root.children) {
            System.out.println("- " + child.label);
        }
        System.out.println("Root has child: " + root.hasChild());
        System.out.println("Children have child:");
        for (Node child : root.children) {
            System.out.println("- " + child.label + " has child: " + child.hasChild());
        }
        System.out.println("Root height: " + root.height());

        System.out.println("DFS traversal:");
        root.dfs();

        System.out.println("BFS traversal:");
        root.bfs();
    }
}
