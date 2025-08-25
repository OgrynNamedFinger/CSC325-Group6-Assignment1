public class HelloWorld { 
  String name; 
  private int age;

  public HelloWorld(String name) {
    this.name = name;
  }

  // second constructor method setting age
  public HelloWorld(String name, int age) { 
    this.name = name; 
    this.age = age;
  } 

  // new introduction method including age
  public void introduce() {
    System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
  }

  public void greet() {
    System.out.println("Hello, " + name + "!");
  }

  // overloading, still needs original
  public void greet(String customMessage) { 
    System.out.println(customMessage + " " + name + "!"); 
  } 
}

