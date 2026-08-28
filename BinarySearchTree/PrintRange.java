package BinarySearchTree;
public class PrintRange {
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
    // Print values in range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        // Case 1: Root is within range
        if (root.data >= k1 && root.data <= k2) {
            // Check left subtree
            printInRange(root.left, k1, k2);
            // Print root
            System.out.print(root.data + " ");
            // Check right subtree
            printInRange(root.right, k1, k2);
        }
        // Root is smaller than range
        else if (root.data < k1) {
            // Go to right subtree
            printInRange(root.right, k1, k2);
        }
        // Root is greater than range
        else {
            // Go to left subtree
            printInRange(root.left, k1, k2);
        }
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
        // Print values from 5 to 12
        System.out.print("Range [5, 12]: ");
        printInRange(root, 5, 12);
        System.out.println();
    }
}
