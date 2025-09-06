package src.Animals;
import src.Animals.Interfaces.Swimmable;
/**
 * Represents a fish that can swim.
 */
public class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes bubbly sounds.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " swims gracefully.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " glides through water.");
    }
}