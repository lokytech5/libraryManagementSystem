import java.util.Scanner;

public class Console {
   private static final Scanner scanner = new Scanner(System.in);
    public static void displayMenu(){
        System.out.println("Welcome to the Library Management System!");
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. List all available books");
//            System.out.println("2. Search for a book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    // List all available books logic
                    break;
                case 2:
                    // Borrow a book logic
                    break;
                case 3:
                    // Return a book logic
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System.");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
    }

