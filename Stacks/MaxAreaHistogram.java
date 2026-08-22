package Stacks;
import java.util.Stack;

public class MaxAreaHistogram {
 public static int maxArea(int arr[]) {
        int n = arr.length;
        int maxArea = 0;

        int nsr[] = new int[n]; // Next Smaller Right
        int nsl[] = new int[n]; // Next Smaller Left

        Stack<Integer> s = new Stack<>();
        // Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Clear stack
        s.clear();
        // Next Smaller Left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }
        // Calculate Maximum Area
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum Rectangle Area = " + maxArea(arr));
    }
}