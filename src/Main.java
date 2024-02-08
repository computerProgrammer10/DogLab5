// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
	Labrador labrad = new Labrador("Bob", "blue");
        System.out.println(labrad.getName() + " says " + labrad.bark());
	Yorkshire york = new Yorkshire("Banana",10);
        System.out.println(york.getName() + " says " + york.bark());
        york.waddle();
        // there is no waddle method in the labrador class
        labrad.waddle();
//
//ARRAY
//        Dog[] dogs = new Dog[3];
//        dogs[0] = dog; dogs[1] = labrad; dogs[2] = york;
//        for(int i =0;i<dogs.length;i++)System.out.println(dogs[i].bark());for (Dog hi : dogs) System.out.println(hi.bark());
//        for (Dog hi : dogs) {
//            if (hi instanceof Labrador)
//                ((Labrador)hi).waddle();
//        }

        // ARRAYLIST
//        ArrayList<Dog> dogs = new ArrayList<Dog>();
//        dogs.add(dog); dogs.add(labrad); dogs.add(york);
//        for (int i = 0; i<dogs.size(); i++) System.out.println(dogs.get(i).bark());
//        for (Dog hi : dogs) System.out.println(hi.bark());
//        for (Dog hi : dogs) {
//            if (hi instanceof Labrador)
//                ((Labrador)hi).waddle();
//        }
//        // you don't need to cast to call the bark method, because
//        // all of them have the dog class attributes
//        // you have to cast to call the waddle method
//        // because the dog class does not come with the waddle method
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Bob")); animals.add(new Labrador("Bananan","Blue"));
        animals.add(new Yorkshire("Monkey",20));
        for (int i = 1; i<animals.size() + 1; i++) animals.get(i-1).setAge(i);

        for(Animal bye: animals){
            System.out.println(bye.getAge());
            bye.eat();
            // barking doesn't work because it's an attribute of the dog class, cast it to a dog.
            System.out.println(((Dog)bye).bark());
        }
    }
}
