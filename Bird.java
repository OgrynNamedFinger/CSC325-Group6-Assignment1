package src.Animals;
import src.Animals.Interfaces.Climbable;
import src.Animals.Interfaces.Flyable;
/**
 * Represents a bird that can fly and climb.
 */
public class Bird extends Animal implements Flyable, Climbable {
    public Bird(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps.");
    }


    @Override
    public void move() {
        System.out.println(getName() + " hops and flutters.");
    }


    @Override
    public void fly() {
        System.out.println(getName() + " soars through the sky.");
    }


    @Override
    public void climb() {
        System.out.println(getName() + " climbs branches using claws.");
    }
}
