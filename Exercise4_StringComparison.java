
/*
 * Exercise 4: String Comparison
 * 
 * Write a program that asks the user for two strings and checks if they are equal,
 * both with and without considering case sensitivity.
 */
import java.util.Scanner;

public class Exercise4_StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // TODO: Compare the strings using equals() and equalsIgnoreCase()
        // and print whether they are equal or not in both cases
        if (str1.equals(str2)) {
            System.out.println("These strings are exactly the same");
        }  else {
            System.out.println("These strings aren't equal");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("These strings are equal");
        }  else {
            System.out.println("These strings aren't equal");
        }

        scanner.close();
    }
}

// Expected output (if input is "Java" and "java"):
// Case sensitive comparison: The strings are not equal.
// Case insensitive comparison: The strings are equal.
