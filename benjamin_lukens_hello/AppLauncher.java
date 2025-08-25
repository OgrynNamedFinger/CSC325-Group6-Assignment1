// imports
import java.util.Scanner;

public class AppLauncher {
  // moving main to second file 
  public static void main(String[] args) { 
    printSplash();
    int typedAge = 0;
    String typedName = "";

    // initializing scanner
    Scanner scanner = new Scanner(System.in);
    // get name
    while (true) {
      System.out.println("Enter Name Here:");
      typedName = scanner.nextLine().trim();
      if (typedName == "") { // if condition is the same as empty then warn
        System.out.println("Warning: Username required");
      } else {
        break;
      }
    }

    // get age
    while (true) {
      System.out.println("Enter your age:");
      String ageInput = scanner.nextLine().trim();
      try {
        typedAge = Integer.parseInt(ageInput);
        if (typedAge < 1) {
          System.out.println("Warning: Please input a valid age.");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Wrong type. Age needs to be a number.");
      }
    }

    HelloWorld noble6 = new HelloWorld(typedName, typedAge);
    noble6.greet();
    noble6.greet("Your filling shoes the rest of the team would rather leave unfilled,");
    noble6.introduce();

    HelloWorld noble1 = new HelloWorld("Carter", 27);
    HelloWorld noble2 = new HelloWorld("Cat", 26);
    HelloWorld noble3 = new HelloWorld("Jun", 29);

    noble1.greet();
    noble1.greet("Nice to meet you,");
    noble1.introduce();

    noble2.greet();
    noble2.greet("Glad to have you on the team,");
    noble2.introduce();

    noble3.greet();
    noble3.greet("Thank you for the letter of recommendation,");
    noble3.introduce();

    // preventing resource leaks
    scanner.close();
  } 

  public static void printSplash() {
    System.out.println(" __        __   _                            _          ");
    System.out.println(" \\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___    ");
    System.out.println("  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\   ");
    System.out.println("   \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) |  ");
    System.out.println("    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   ");
    System.out.println("                                                        ");
    System.out.println("               Benjamin Lukens' Hello World                ");
  }
}

