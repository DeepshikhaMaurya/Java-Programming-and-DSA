package BinarySearchTree;
import java.util.ArrayList;
public class RootLeafPath {
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
    // Insert in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // Print one root-to-leaf path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    // Print all Root-to-Leaf paths
    public static void printRoot2Leaf(
            Node root,
            ArrayList<Integer> path) {
        // Base case
        if (root == null) {
            return;
        }
        // Add current node
        path.add(root.data);
        // Check if current node is leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        // Left subtree
        printRoot2Leaf(root.left, path);
        // Right subtree
        printRoot2Leaf(root.right, path);
        // Backtracking
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int values[] = {
            8, 5, 3, 1, 4, 6, 10, 11, 14
        };
        Node root = null;
        // Build BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        // Root to Leaf Paths
        System.out.println("Root to Leaf Paths:");

        printRoot2Leaf(root, new ArrayList<>());
    }
}
