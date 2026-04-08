import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue & Push
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}