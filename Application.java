import java.util.ArrayList;

public class Application{
    public static void main(String[] args){
        Object myObj = new Object();

        MyClass myObj2 = new MyClass();
        myObj2.add(4);
        //System.out.println(myObj2.get(0));
        System.out.println(myObj);
        Animal a = new Animal();
        System.out.println(a);
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
    }
}