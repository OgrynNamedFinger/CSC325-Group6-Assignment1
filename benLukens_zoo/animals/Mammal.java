package animals;

import interfaces.Walkable;

public class Mammal extends Animal implements Walkable {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " growls: Grrr!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on land.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks steadily on four legs.");
    }
}

