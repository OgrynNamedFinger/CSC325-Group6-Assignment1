package animals;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes bubbling sounds.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " swims through the water.");
    }
}

