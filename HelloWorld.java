package WesLee_Williams_Hello;

public class HelloWorld{
    String name;
    private int age;
    public HelloWorld(String name){
        this.name = name;
    }
    public HelloWorld(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void greet(){
        System.out.println("Hello, " + name + "!");
    }
    public void greet(String message){
        System.out.println(message + ", " + name + "!");
    }
    public void introduce(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    public static void main(String[] args){
        HelloWorld student1 = new HelloWorld("WesLee Williams");
        student1.greet();
        HelloWorld student2 = new HelloWorld("WesLee", 21);
        student2.introduce();
    }
}