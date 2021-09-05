package CollectionsInJava;
import java.util.*;

class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    
        cars.addFirst("Merc");
        cars.addLast("Honda");
        System.out.println(cars);
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst() + " " + cars.getLast());
    }
}
