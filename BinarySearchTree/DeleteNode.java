package BinarySearchTree;
public class DeleteNode {
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
    // Delete Node from BST
    public static Node delete(Node root, int val) {

        // Base case
        if (root == null) {
            return null;
        }
        // Search in right subtree
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        // Search in left subtree
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        // Node found
        else {
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }
            // Case 2: Only left child
            else if (root.right == null) {
                return root.left;
            }
            // Case 3: Both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // Find Inorder Successor
    public static Node findInorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
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

        // Before deletion
        System.out.print("Inorder before deletion: ");
        inorder(root);
        System.out.println();

        // Delete node
        root = delete(root, 1);

        // After deletion
        System.out.print("Inorder after deletion: ");
        inorder(root);
        System.out.println();
    }
}
