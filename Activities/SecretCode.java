/*
 * Project: Secret Code Name Generator
 * Author: Ntombi Takana
 * Description: A Java program that collects user's name, trims it, converts it to lowercase using methods,
 * creates a secret code name using Stringbuilder
 */

import java.util.Scanner;

public class SecretCode {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String fullName;
while (true) {
    System.out.println("Enter your full name (or type 'exit' to quit): ");
    fullName = sc.nextLine().trim();

    if (fullName.equalsIgnoreCase("exit")) {
    System.out.println("Exiting Secret Code Name Generator.");
    break;
 }

String[] names = fullName.toLowerCase().split(" ");

    if (names.length >= 2) {
    String firstName = names[0];
    String lastName = names[1];

   // Capitalize first letter
    firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

   // Display names
System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);

  // Step 9: Compare first and last names
    int comparison = firstName.compareTo(lastName);

    if (comparison < 0) {
             System.out.println(firstName + " comes before " + lastName + " alphabetically.");
    } else if (comparison > 0) {
System.out.println(lastName + " comes before " + firstName + " alphabetically.");
   } else {
              System.out.println("First and last names are the same alphabetically.");
          }

   // Step 4: Reverse last name
  StringBuilder reversedLastName = new StringBuilder(lastName);
        reversedLastName.reverse();

   // Step 5: Create codename
    String codeName = firstName.substring(0, 2) + reversedLastName;

  // Step 6: Add special ending
    char lastChar = codeName.toLowerCase().charAt(codeName.length() - 1);
    boolean containsX = codeName.toLowerCase().contains("x");

    if (containsX || "aeiou".indexOf(lastChar) >= 0) {
          codeName = new StringBuilder(codeName).append("X-Agent").toString();
         } else {
                    int mid = codeName.length() / 2;
                    codeName = new StringBuilder(codeName).insert(mid, "-007").toString();
                }

   // Step 10: Choose Hero/Villain mode
     System.out.print("Choose mode (Hero Mode / Villain Mode): ");
     String mode = sc.nextLine().trim().toLowerCase();

    if (mode.equals("villain mode")) {
          codeName = codeName.toUpperCase(); // Villains yell 
          } else {
                codeName = codeName.replace("-", " "); // Heros are elegant
           }

  // Step 7: Format and display
     System.out.println(String.format("🕵️‍♂️ Your secret code name is: %s", codeName));

      } else {
          System.out.println("Please enter both first and last names.");
      }

        System.out.println("------------------------------------------------");
       }
    }
}
