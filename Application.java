import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application{
    public static void main(String[] args){
        Object myObj = new Object();

        MyClass myObj2 = new MyClass();
        myObj2.add(4);
        //System.out.println(myObj2.get(0));
        System.out.println(myObj);
        //Animal a = new Animal();
        //System.out.println(a);
        System.out.println("toString of MyClass "+ myObj2);

        /**
         * A - Inheritance
         * 1 - Class can 'extend' other Classes
         * 2 - Extending an Object will cause to inherit all behavior of the parent class
         * 3 - All classes that don't extend a class will inherently extend the object class
         * 4 - the object class contains methods like toString, equals, hashcode
         * 
         * B - Polymorphism
         * 5 - When extending an object, we can potentially overwrite the behavior of the parent class
         *   eg it's pretty common to overwrite the behavior of the object class's toString and equals methods.
         *   This is a type of polymorphism.
         * 6 - Polymorphism can be divided into runtime/compile time polymorphism.
         * 7 - compile time polymorphism - method overloading, having methods with same name, but different parameters.
         * 8 - Runtime polymorphism - method overriding, having a child class overwrite the behavior of the parent(eg overwrite toString)
         */

         ArrayList myAl = new MyClass();
         Object myO = new ArrayList();
         Object myO2 = new MyClass();

         Car myTruck = new Truck();
         myTruck.move();

         List<Animal> animals = new ArrayList<>();
         List<Animal> animals2 = new LinkedList<>();
         Animal kitty = new Cat();

         /**
          * myTruck is a Truck, which inherits all of the behavior of Car
          * including the move() method
          *
          * INHERITANCE
          *
          * POLYMORPHISM
          *
          * compile-time a(method overloading), run-time(overriding)
          *
          * ENCAPSULATION
          * encapsulation has to do with the ability for an object to 'hide' its data
          * access modifiers - public, protected, default, private
          * public - accessible everywhere
          * protected - accessible within package and subclasses
          * default - accessible within package
          * private - accessible within class
          * Encapsulation contains everything within a single unit
          * 
          * ABSTRACTION
          * avoiding complicated implementation details, referring to human-readable descriptions
          * of code instead - 'simplification'
          * multiple ways to achieve this - the best way is interfaces
          *
          * A class can only imediately extend one other class
          * (multiple inheretance - we want to avoid conflicts when inheriting fields/methods)
          * if we want to have an extremely useful class, we may have a class that implements multiple interfaces
          * whats the difference in inheritance between extends and implements 
          */
         
    }
}