package palindrome;

/**
 *
 * @author 22cseb40
 */
import java.util.*;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Palindromic substrings found:");

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    count++;
                    System.out.println(count + ". " + substring);
                }
            }
        }

        System.out.println("\nTotal palindromic substrings: " + count);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
