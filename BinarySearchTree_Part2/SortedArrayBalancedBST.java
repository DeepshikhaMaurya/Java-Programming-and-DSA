package BinarySearchTree_Part2;

public class SortedArrayBalancedBST {
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
    // Create Balanced BST from Sorted Array
    public static Node createBST(int arr[], int st, int end) {
        // Base case
        if (st > end) {
            return null;
        }
        // Find middle element
        int mid = (st + end) / 2;
        // Create root
        Node root = new Node(arr[mid]);
        // Create left subtree
        root.left = createBST(arr, st, mid - 1);
        // Create right subtree
        root.right = createBST(arr, mid + 1, end);
        return root;
    }
    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {
            3, 5, 6, 8, 10, 11, 12
        };
        Node root = createBST(arr, 0, arr.length - 1);
        System.out.print("Preorder: ");
        preorder(root);
    }
}
