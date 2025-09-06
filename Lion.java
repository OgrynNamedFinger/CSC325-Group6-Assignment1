package src.Animals;
import src.Animals.Interfaces.Climbable;
import src.Animals.Interfaces.Runnable;
/**
 * Represents a Lion that can run and climb.
 */
public class Lion extends Animal implements Runnable, Climbable {
    public Lion(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " growls.");
    }


    @Override
    public void move() {
        System.out.println(getName() + " walks or runs.");
    }


    @Override
    public void run() {
        System.out.println(getName() + " sprints across the field.");
    }


    @Override
    public void climb() {
        System.out.println(getName() + " climbs trees swiftly.");
    }
}
