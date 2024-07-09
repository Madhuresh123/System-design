package Polymorphimus;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of Animal type

        myAnimal = new Dog();
        myAnimal.sound(); // Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Cat meows
    }
}
