package Stacks;
import java.util.*;

public class ValidParenthesesCode {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Ignore spaces
            if (ch == ' ') {
                continue;
            }
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {

                    s.pop();
                } else {
                    return false;
                }
            }
            // Invalid character
            else {
                return false;
            }
        }
        return s.isEmpty();
    }
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while ( s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate
                }else{
                    s.pop(); //opeming pair
                }
                }else{
                    //opening
                    s.push(ch);
                }
          }
          return false;
        }    
    
    public static void main(String[] args) {
        //Valid string
     String str = "((a+b))"; //true
     String str2 = "(a-b)"; //false
     System.out.println(isDuplicate(str));
    }
}