import java.util.Scanner;

/**
 * AppLauncher is the entry point for the HelloWorld demonstration.
 * It displays a splash screen, collects user input, and demonstrates
 * the features of the HelloWorld class.
 */
public class AppLauncher {

    /**
     * Main method to launch the application.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        printSplashScreen();

        Scanner scanner = new Scanner(System.in);
        String userName = "";
        int userAge = 0;

        // Gather user name with validation
        while (true) {
            System.out.print("Enter your name: ");
            userName = scanner.nextLine().trim();
            if (userName.isEmpty()) {
                System.out.println("Error: Name cannot be empty. Please try again.");
            } else {
                break;
            }
        }

        // Gather user age with validation
        while (true) {
            System.out.print("Enter your age: ");
            String ageInput = scanner.nextLine().trim();
            try {
                userAge = Integer.parseInt(ageInput);
                if (userAge < 0) {
                    System.out.println("Error: Age cannot be negative. Please try again.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer for age.");
            }
        }

        HelloWorld user = new HelloWorld(userName, userAge);
        user.greet();
        user.greet("Welcome");
        user.introduce();

        HelloWorld student1 = new HelloWorld("Connor", 19);
        HelloWorld student2 = new HelloWorld("Alex", 25);

        student1.greet();
        student1.greet("Hello there");
        student1.introduce();

        student2.greet();
        student2.greet("Hi");
        student2.introduce();

        scanner.close();
    }

    /**
     * Prints an ASCII art splash screen.
     */
    public static void printSplashScreen() {
        System.out.println("**********************************");
        System.out.println("*    Welcome to HelloWorld App   *");
        System.out.println("*        __    __   ___          *");
        System.out.println("*       / /   / /  / _ \\         *");
        System.out.println("*      / /   / /  | | | |        *");
        System.out.println("*     / /___/ /   | |_| |        *");
        System.out.println("*    /_______/    \\____/          *");
        System.out.println("**********************************\n");
    }
}