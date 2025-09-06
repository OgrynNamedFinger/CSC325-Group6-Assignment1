package src.Animals.main;

import src.Animals.*;
import src.Animals.Interfaces.*;

import java.util.*;


/**
 * Manages the zoo and user interaction.
 */
public class ZooManager {
    private final List<Animal> animals = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);


    /**
     * Loads sample animals into the zoo.
     */
    public void loadAnimals() {
        animals.add(new Bird("Parakeet"));
        animals.add(new Fish("Bass"));
        animals.add(new Lion("Barbary"));
    }


    /**
     * Displays the main menu and handles user input.
     */
    public void run() {
        loadAnimals();
        boolean exit = false;


        while (!exit) {
            System.out.println("\n--- Zoo Menu ---");
            System.out.println("1. List All Animals");
            System.out.println("2. Make All Move");
            System.out.println("3. Make All Sound");
            System.out.println("4. Show Special Abilities");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");


            try {
                int choice = Integer.parseInt(scanner.nextLine());


                switch (choice) {
                    case 1:
                        listAnimals();
                        break;
                    case 2:
                        makeAllMove();
                        break;
                    case 3:
                        makeAllSound();
                        break;
                    case 4:
                        showAbilities();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }


        System.out.println("Goodbye!");
    }


    private void listAnimals() {
        System.out.println("\nAnimals in the Zoo:");
        for (Animal a : animals) {
            System.out.println("- " + a.getName());
        }
    }


    private void makeAllMove() {
        System.out.println("\nAnimal Movements:");
        for (Animal a : animals) {
            a.move();
        }
    }

    private void makeAllSound() {
        System.out.println("\nAnimal Sounds:");
        for (Animal a : animals) {
            a.makeSound();
        }
    }
    private void showAbilities() {
        System.out.println("\nSpecial Abilities:");
        for (Animal a : animals) {
            if (a instanceof Flyable) ((Flyable)a).fly();
            if (a instanceof Swimmable) ((Swimmable)a).swim();
            if (a instanceof src.Animals.Interfaces.Runnable) ((src.Animals.Interfaces.Runnable)a).run();
            if (a instanceof Climbable) ((Climbable)a).climb();
        }
    }
    /**
     * Main method to start the ZooManager.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        new ZooManager().run();
    }
}