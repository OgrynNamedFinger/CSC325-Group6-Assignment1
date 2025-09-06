package src.Animals.main;
import java.util.ArrayList;

import src.Animals.Animal;
import src.Animals.Bird;
import src.Animals.Fish;
import src.Animals.Lion;
import src.Animals.Interfaces.Climbable;
import src.Animals.Interfaces.Flyable;
import src.Animals.Interfaces.Runnable;
import src.Animals.Interfaces.Swimmable;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal Bird = new Bird("Parakeet");
        Animal Fish = new Fish("Bass");
        Animal Lion = new Lion("Barbary");

        animals.add(Bird);
        animals.add(Fish);
        animals.add(Lion);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            animal.move();
            animal.makeSound();

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Runnable) {
                ((Runnable) animal).run();
            }
            if (animal instanceof Climbable) {
                ((Climbable) animal).climb();
            }

            System.out.println();
        }
    }
}