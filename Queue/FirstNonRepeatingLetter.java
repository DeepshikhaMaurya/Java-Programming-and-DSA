package Queue;

import java.util.*;

public class FirstNonRepeatingLetter {

    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Update frequency
            freq[ch - 'a']++;

            // Add current character to queue
            q.add(ch);

            // Remove repeating characters from front
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print first non-repeating character
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        String str = "aabccxb";
        printNonRepeating(str);
    }
}