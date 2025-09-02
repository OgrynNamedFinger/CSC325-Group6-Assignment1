package main;

import animals.*;
import interfaces.Flyable;
import interfaces.Walkable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ZooManager handles user interaction with a collection of animals.
 */
public class ZooManager {
    private ArrayList<Animal> animals;

    /**
     * Constructs a ZooManager and loads default animals.
     */
    public ZooManager() {
        animals = new ArrayList<>();
        loadAnimals();
    }

    /**
     * Loads some sample animals into the zoo.
     */
    private void loadAnimals() {
        animals.add(new Bird("Parrot"));
        animals.add(new Fish("Goldfish"));
        animals.add(new Mammal("Lion"));
    }

    /**
     * Displays the menu and processes user input.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            try {
                System.out.println("\n=== Zoo Menu ===");
                System.out.println("1. List All Animals");
                System.out.println("2. Make All Animals Move");
                System.out.println("3. Make All Animals Sound");
                System.out.println("4. Make Walkable Animals Walk");
                System.out.println("5. Make Flyable Animals Fly");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> listAnimals();
                    case 2 -> moveAll();
                    case 3 -> soundAll();
                    case 4 -> walkAll();
                    case 5 -> flyAll();
                    case 0 -> System.out.println("Exiting Zoo Manager...");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    private void listAnimals() {
        System.out.println("\n--- Animal List ---");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    private void moveAll() {
        System.out.println("\n--- Moving Animals ---");
        for (Animal animal : animals) {
            animal.move();
        }
    }

    private void soundAll() {
        System.out.println("\n--- Animal Sounds ---");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    private void walkAll() {
        System.out.println("\n--- Walkable Animals ---");
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk();
            }
        }
    }

    private void flyAll() {
        System.out.println("\n--- Flyable Animals ---");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }
}

