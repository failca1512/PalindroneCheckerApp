public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean result1 = stackStrategy.check(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = dequeStrategy.check(input);
        long end2 = System.nanoTime();

        System.out.println("Input: " + input);

        System.out.println("\nStack Strategy:");
        System.out.println("Is Palindrome?: " + result1);
        System.out.println("Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Strategy:");
        System.out.println("Is Palindrome?: " + result2);
        System.out.println("Time: " + (end2 - start2) + " ns");
    }
}