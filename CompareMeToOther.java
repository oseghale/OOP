/**
 * this class can take in a generic type that *must* implement comparable
 * so that it can compare its contained object with other objects of the same type 
 * 
 * T's should be comparable to other T's
 * (eg, Strings should be comparable to other Strings) for us to write comparison logic 
 */
public class CompareMeToOther<T extends Comparable<T>> {
    T item;
    public CompareMeToOther(T item){
        this.item = item;
    }
   /**
    * Compare my object to the other's object.
    * eg, if String, then comparing Dog-Cat should return true, but comparing Apple-Banana 
    * should return false (dictionary ordering)
    * if int, then comparing 1-2 should return false, 4-3 should return true(numeric ordering)
    * if date, then comparing 2/9-1/9 should return true, but comparing 2/9-2/10 
    * should return false (temporal ordering)
    *
    * eg, I could sort dates, ints, strings all with the same piece of code
    *
    * Interface gurantee behavior exists
    * Generics can stand in for any type of object
    * @return
    */ 

    boolean amIGreaterThanTheOther(T other){
        int value = item.compareTo(other);
        if(value>0){
            /**
             * my generic's value is greater than the other
             */
            return true;
        }
        /** my generic's value is less than the other */
        return false;
    }
    
}
