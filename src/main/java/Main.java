import com.example.todo.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("📋 Welcome to Java To-Do App (Now with Priority)!");

        while (true) {
            System.out.println("\nOptions: add | list | complete | exit");
            System.out.print("Choose an action: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "add":
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine().trim();

                    System.out.print("Enter priority (Low, Medium, High): ");
                    String priority = scanner.nextLine().trim();

                    taskManager.addTask(title, priority);
                    break;

                case "list":
                    taskManager.listTasks();
                    break;

                case "complete":
                    System.out.print("Enter task number to complete: ");
                    try {
                        int number = Integer.parseInt(scanner.nextLine().trim());
                        taskManager.completeTask(number);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format.");
                    }
                    break;

                case "exit":
                    System.out.println("👋 Goodbye!");
                    return;

                default:
                    System.out.println("Unknown command. Please use: add, list, complete, or exit.");
            }
        }
    }
}
