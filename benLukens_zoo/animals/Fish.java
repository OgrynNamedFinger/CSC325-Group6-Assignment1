package animals;

public class Fish extends Animal { // does not have walkable or flyable
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes bubbling sounds.");
    }

    @Override
    public void move() { // still moves because of default methods in Animal.java
        System.out.println(getName() + " swims through the water.");
    }
}

