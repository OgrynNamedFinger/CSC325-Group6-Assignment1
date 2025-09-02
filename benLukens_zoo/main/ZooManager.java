package main;

import animals.*;
import interfaces.Flyable;
import interfaces.Walkable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// largest functional part of the project
// displays options to the user, loops the choices until quit
// creates a list of animals that the user can see at the zoo
// checks for type errors for better user experience
public class ZooManager {
    private ArrayList<Animal> animals; // dynamic amount of animals

    // Constructs a ZooManager and loads default animals.
    public ZooManager() {
        animals = new ArrayList<>();
        loadAnimals(); // creates 4 new animals and categorizes them.
    }

    // Loads some sample animals into the zoo.
    private void loadAnimals() {
        animals.add(new Bird("Parrot"));
        animals.add(new Fish("Koi Fish"));
        animals.add(new Mammal("Lion"));
    }

    // Displays the menu and processes user input.
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1; // setting choice to something not taken and not zero

        while (choice != 0) {
            try {
                System.out.println("\n|~|~| Zoo Menu |~|~|");
                System.out.println("1. List All Animals");
                System.out.println("2. Make All Animals Move");
                System.out.println("3. Make All Animals Sound");
                System.out.println("4. Make Animals Walk");
                System.out.println("5. Make Birds Animals Fly");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                choice = scanner.nextInt();

                // uses switch-case to give each choice functionality
                switch (choice) {
                    case 1 -> listAnimals();
                    case 2 -> moveAll();
                    case 3 -> soundAll();
                    case 4 -> walkAll();
                    case 5 -> flyAll();
                    case 0 -> System.out.println("Thank you for coming!");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) { // input type error checking
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    private void listAnimals() {
        System.out.println("\n~~~ Animal List ~~~");
        for (Animal animal : animals) { // loop amount is the # of animals
            System.out.println(animal.getName());
        }
    }

    // looping applies for all animal interaction methods
    private void moveAll() {
        System.out.println("\n~~~ Moving Animals ~~~");
        for (Animal animal : animals) {
            animal.move();
        }
    }

    private void soundAll() {
        System.out.println("\n~~~ Animal Sounds ~~~");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    private void walkAll() {
        System.out.println("\n~~~ Walkable Animals ~~~");
        for (Animal animal : animals) {
            if (animal instanceof Walkable) { // if checking for animal type
                ((Walkable) animal).walk();
            }
        }
    }

    private void flyAll() {
        System.out.println("\n~~~ Flyable Animals ~~~");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) { // if checking for animal type
                ((Flyable) animal).fly();
            }
        }
    }
}

