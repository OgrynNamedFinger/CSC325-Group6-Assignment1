package src.Animals;


/**
 * Abstract base class for all animals.
 */
public abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }


    /**
     * Gets the animal's name.
     * @return name of the animal
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the animal's name.
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Abstract method for animal sound.
     */
    public abstract void makeSound();
    /**
     * Abstract method for animal movement.
     */
    public abstract void move();
}