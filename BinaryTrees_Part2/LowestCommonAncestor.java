package BinaryTrees_Part2;
import java.util.ArrayList;
public class LowestCommonAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  // Find path from root to node n
    public static boolean getPath(
            Node root,
            int n,
            ArrayList<Node> path) {
        // Base case
        if (root == null) {
            return false;
        }
        // Add current node to path
        path.add(root);
        // If current node is the target node
        if (root.data == n) {
            return true;
        }
        // Search in left subtree
        boolean foundLeft = getPath(root.left, n, path);
        // Search in right subtree
        boolean foundRight = getPath(root.right, n, path);
        // If node found in either subtree
        if (foundLeft || foundRight) {
            return true;
        }
        // Node not found, remove current node
        path.remove(path.size() - 1);
        return false;
    }
    // Find Lowest Common Ancestor
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        // Find paths from root to n1 and n2
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // Find last common node
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // Last common node is at i - 1
        Node lca = path1.get(i - 1);
        return lca;
    }
    public static void main(String[] args) {
        // Main Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println("LCA = " + lca(root, n1, n2).data);
    }
}