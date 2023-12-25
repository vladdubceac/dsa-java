package data_structures_tasks.animals_queue;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Beji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueAny().name());
        System.out.println("\t- - - - -");
        AnimalQueueSolution solution = new AnimalQueueSolution();
        solution.enqueue(new Cat("Kiki"));
        solution.enqueue(new Cat("Kari"));
        solution.enqueue(new Dog("Beji"));
        solution.enqueue(new Cat("Reki"));
        solution.enqueue(new Dog("Dexter"));

        System.out.println(solution.dequeueAny().name());
        System.out.println(solution.dequeueAny().name());
        System.out.println(solution.dequeueAny().name());
    }
}
