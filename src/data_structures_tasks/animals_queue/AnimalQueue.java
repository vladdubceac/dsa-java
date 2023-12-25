package data_structures_tasks.animals_queue;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Animal> animalsList;
    int firstNumber;
    int lastNumber;
    
    public AnimalQueue(){
        animalsList = new LinkedList<>();
        firstNumber = 0;
        lastNumber = 0;
    }

    public void enqueue(Animal animal){
        if(firstNumber==0){
            firstNumber = 1;
            lastNumber = firstNumber;
        }else{
            lastNumber++;
        }
        animal.setOrder(lastNumber);
        animalsList.add(animal);
    }
    
    public Animal dequeueAny(){
        if(animalsList.isEmpty()){
            System.out.println("Animal queue is empty !");
            return null;
        }
        Animal animal = animalsList.poll();
        if(animalsList.isEmpty()){
            firstNumber = lastNumber = 0;
        }else{
            firstNumber++;
        }
        return animal;
    }
    
    public Dog dequeueDogs(){
        if(animalsList.isEmpty()){
            System.out.println("Animal queue is empty !");
            return null;
        }
        Iterator<Animal> iterator = animalsList.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if(animal instanceof Dog) {
                return (Dog)animal;
            }
        }
        return null;
    }
    
    public Cat dequeueCats(){
        if(animalsList.isEmpty()){
            System.out.println("Animal queue is empty !");
            return null;
        }
        Iterator<Animal> iterator = animalsList.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if(animal instanceof Cat) {
                return (Cat)animal;
            }
        }
        return null;
    }
}