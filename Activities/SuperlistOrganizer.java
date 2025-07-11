import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SuperlistOrganizer {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> superlist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Dynamic Superlist Organizer!");

        while (true) {
            System.out.print("\nEnter category name (or type 'done'): ");
            String category = sc.nextLine().trim();

            if (category.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter tasks (comma-separated): ");
            String taskLine = sc.nextLine();
            String[] rawTasks = taskLine.split(",");

            // Remove duplicates and trim
            LinkedHashSet<String> cleanTasks = new LinkedHashSet<>();
            for (String task : rawTasks) {
                task = task.trim();
                if (!task.isEmpty()) {
                    task = task.substring(0, 1).toUpperCase() + task.substring(1).toLowerCase();
                    cleanTasks.add(task);
                }
            }

            // Show tasks and offer to delete
            ArrayList<String> finalTasks = new ArrayList<>(cleanTasks);
            Collections.sort(finalTasks); // ✅ Sort before showing

            System.out.println("Tasks you've entered:");
            for (int i = 0; i < finalTasks.size(); i++) {
                System.out.println((i + 1) + ". " + finalTasks.get(i));
            }

            System.out.print("Do you want to delete any task? (yes/no): ");
            String deleteAnswer = sc.nextLine();

            if (deleteAnswer.equalsIgnoreCase("yes")) {
                System.out.print("Enter the task number to delete: ");
                try {
                    int deleteIndex = Integer.parseInt(sc.nextLine());
                    if (deleteIndex >= 1 && deleteIndex <= finalTasks.size()) {
                        String removed = finalTasks.remove(deleteIndex - 1);
                        System.out.println("Task \"" + removed + "\" removed.");
                    } else {
                        System.out.println("Invalid task number. Skipping delete.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Skipping delete.");
                }
            }

            addTasks(category, finalTasks.toArray(new String[0]));
        }

        // Display all
        System.out.println("\nYour Superlist:");
        for (String item : superlist) {
            System.out.println(item);
        }
    }

    public static void addTasks(String category, String... tasks) {
        category = category.trim();
        category = category.substring(0, 1).toUpperCase() + category.substring(1).toLowerCase();

        StringBuilder formatted = new StringBuilder();
        formatted.append("\nCategory: ").append(category);
        for (String task : tasks) {
            formatted.append("\n- ").append(task);
        }

        superlist.add(formatted.toString());
    }
}
