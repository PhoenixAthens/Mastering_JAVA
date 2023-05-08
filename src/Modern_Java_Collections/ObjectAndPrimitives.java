package Modern_Java_Collections;
import java.util.*;
public class ObjectAndPrimitives {
    public static void main(String...args){
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3));
        int value=numbers.get(0);//if we declare arrayList as follows
        //ArrayList numbers= new ArrayList<>(Arrays.asList(1,2,3)), then statement at 6 gives an error
        //However, with the way ArrayList is declared at 5, there is no problem and auto-unboxing does the necessary
        //conversion without any problems. This happens because compiler sees us as assigning an object to an int type
        //Even if statement at 6, is changed to "Integer value=numbers.get(0)" we get the same error, since Integer is
        //a subclass of Object, not the other way around
        Object a= 2;
        ArrayList listOfNumbers=new ArrayList();
        listOfNumbers.add(98); // auto-boxing convert int to Integer
        listOfNumbers.add(102);
        System.out.println(listOfNumbers);
        //however, when we read the values
        //int val =listOfNumbers.get(0); //like so, we get an error because there is not auto-Unboxing, there should be,
        // but there isn't. this is because our collection is storing int values as Objects, or we can say that our
        // int value was autoboxed into an Object rather than an Integer. Objects cannot be a auto-unboxed to "int"
        // however.
        Integer val = (Integer)listOfNumbers.get(0); //cast from Object to Integer
        int val2 = val; //Auto-unboxing
        int val3 = (Integer)listOfNumbers.get(1); //Auto-unboxing







    }
}
