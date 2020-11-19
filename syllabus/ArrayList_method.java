package syllabus;
import java.util.*;
/* 
    class is a resizable array, which can be found in the java.util package.
    its list of strings =["hello","hai",.....]
*/

public class ArrayList_method {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        System.out.println(cars);
        cars.set(0,"opel");//set method to set at index
        cars.remove(0);//remove  element at poition
        cars.clear(); //Clear the list
        cars.size();//size of the list
        Collections.sort(cars);//sort the list
        
    }
}
