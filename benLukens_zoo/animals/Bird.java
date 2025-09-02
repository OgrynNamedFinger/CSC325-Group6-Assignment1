package animals;

import interfaces.Flyable;
import interfaces.Walkable;

public class Bird extends Animal implements Flyable, Walkable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet tweet!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " hops around.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies gracefully in the sky.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks by hopping with small steps.");
    }
}

