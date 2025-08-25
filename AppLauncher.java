package WesLee_Williams_Hello;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * AppLauncher serves as the entry point of the application.
 * It collects user input, handles errors, and demonstrates the usage of HelloWorld class.
 */
public class AppLauncher {


    /**
     * Displays a simple ASCII splash screen.
     */
    public static void displaySplashScreen() {
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*        WELCOME TO JAVA APP        *");
        System.out.println("*             HelloWorld            *");
        System.out.println("*                                   *");
        System.out.println("*************************************\n");
    }


    /**Main method to run the application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        displaySplashScreen();


        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = -1;


        // Get valid name input
        while (true) {
            try {
                System.out.print("Enter your name: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        // Get valid age input
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer for age.");
                scanner.next(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        // Create HelloWorld objects
        HelloWorld user = new HelloWorld(name, age);
        //HelloWorld guest = new HelloWorld("Guest");


        // Call methods
        user.greet();                         // greet() without message
        user.greet("Good morning");           // greet() with message
        user.introduce();                     // introduce()


        //guest.greet();                        // greet() for guest
       // guest.greet("Welcome");               // greet() with message
        // Not calling guest.introduce() because age is not initialized


        scanner.close();
    }
}