public class PalindromeCheckerApp {
    public static void main(String[]args){



        String input="madam";
    boolean isPalindrome = true;
    for (int i=0;i<input.length()/2;i++){
        if (input.length()-i-1)){
            isPalindrome=false;
               break;
        }
    }
    System.out.println("Input text:" +input);
    System.out.println("Is it a Palindrome?:"+ isPalindrome);
    }
}
