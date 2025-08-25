public class HelloWorld {
    final private String name;
    final private int age;

    public HelloWorld(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded greet method
    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        HelloWorld student = new HelloWorld("Connor", 19);
        student.greet();
        student.greet("Welcome");
        student.introduce();

        HelloWorld student2 = new HelloWorld("Alex", 25);
        student2.greet();
        student2.greet("Hi");
        student2.introduce();
    }
}