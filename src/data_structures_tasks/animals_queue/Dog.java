package data_structures_tasks.animals_queue;

public class Dog extends Animal {
  public Dog(String n) {
    super(n);
  }

  public String name() {
    return "Dog: " + name;
  }
}