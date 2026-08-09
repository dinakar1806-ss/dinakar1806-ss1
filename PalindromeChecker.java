import java.util.Scanner;

public class PalindromeChecker {

    
    public static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    
    public static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    
    public static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        int j = 0;

        for (int i = original.length - 1; i >= 0; i--) {
            reverse[j] = original[i];
            j++;
        }

        String reversedText = new String(reverse);

        return text.equals(reversedText);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.next();

        System.out.println();

        if (isPalindromeIterative(text))
            System.out.println("Iterative : Palindrome");
        else
            System.out.println("Iterative : Not Palindrome");

        if (isPalindromeRecursive(text))
            System.out.println("Recursive : Palindrome");
        else
            System.out.println("Recursive : Not Palindrome");

        if (isPalindromeArrayReversal(text))
            System.out.println("Array Reversal : Palindrome");
        else
            System.out.println("Array Reversal : Not Palindrome");

        sc.close();
    }
}