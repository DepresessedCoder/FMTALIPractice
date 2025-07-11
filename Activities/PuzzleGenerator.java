import java.util.Scanner;
import java.util.Arrays;

public class PuzzleGenerator{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
 int n;
 do {
  System.out.print("How many words do you want to enter (3 to 5): ");
    n = sc.nextInt();
    sc.nextLine();
    } while (n < 3 || n > 5);

  String[] array = new String[n];

  for (int i = 0; i < n; i++) {
      System.out.print("Enter word " + (i + 1) + ": ");
      array[i] = sc.nextLine();
      array[i] = array[i].trim();
      array[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1).toLowerCase();
     }
 System.out.println("You entered:");
for (int i = 0; i < array.length; i++) {
    System.out.println((i + 1) + ". " + array[i]);
}

// Sort and display the array
Arrays.sort(array);

System.out.println("Sorted words:");
for (int i = 0; i < array.length; i++) {
    System.out.println((i + 1) + ". " + array[i]);
}

System.out.print("Choose the first word number (1 to " + n + "): ");
int option1 = sc.nextInt();

System.out.print("Choose the second word number (1 to " + n + "): ");
int option2 = sc.nextInt();

if (option1 < 1 || option1 > n || option2 < 1 || option2 > n) {
    System.out.println("Invalid selection. Please run the program again.");
} else {
    System.out.println("You selected:");
    System.out.println("First word: " + array[option1 - 1]);
    System.out.println("Second word: " + array[option2 - 1]);
}

//create a password suggestion


char specialChar;
String password;
boolean satisfied = false;
sc.nextLine(); // consume leftover newline

while (!satisfied) {
    System.out.print("Enter a special character to include in the password: ");
    String symbolInput = sc.nextLine();
    specialChar = symbolInput.length() > 0 ? symbolInput.charAt(0) : '@';

    StringBuilder reversedWord = new StringBuilder(array[option1 - 1]);
    reversedWord.reverse(); 

    String secondWord = array[option2 - 1];
    String partOfSecondWord = secondWord.length() >= 3 ? secondWord.substring(0, 3) : secondWord;

    int totalLength = array[option1 - 1].length() + array[option2 - 1].length();

    password = reversedWord.toString() + partOfSecondWord + specialChar + String.valueOf(totalLength);

    // Check if password starts with a vowel
    char firstChar = password.toLowerCase().charAt(0);
    boolean isVowel = "aeiou".indexOf(firstChar) != -1;

    if (isVowel) {
        System.out.println("🎉 Your password starts with a vowel – that's unique!");
    }

    // Display formatted password
    System.out.println(String.format("Your suggested password is: [%s]", password));

    System.out.print("Are you happy with this password? (yes/no): ");
    String response = sc.nextLine().trim().toLowerCase();

    if (response.equals("yes")) {
        satisfied = true;
        System.out.println(" Password accepted!");
    }
}




























}
}