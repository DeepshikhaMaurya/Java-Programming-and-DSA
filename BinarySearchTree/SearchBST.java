package BinarySearchTree;
public class SearchBST {
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
    // Insert node in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // Left subtree
            root.left = insert(root.left, val);
        } else {
            // Right subtree
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
    // Search in BST
    public static boolean search(Node root, int key) {
        // Base case
        if (root == null) {
            return false;
        }
        // Key found
        if (root.data == key) {
            return true;
        }
        // Search in left subtree
        if (root.data > key) {
            return search(root.left, key);
        }
        // Search in right subtree
        else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        // Build BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        // Search
        if (search(root, 1)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
