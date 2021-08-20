import java.util.*;

class ArrayListUse {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        cars.remove(0);
        // cars.clear();
        cars.size();

        Collections.sort(cars);
        System.out.println(cars);

        Iterator<String> it = cars.iterator();
        // Print the first item
        System.out.println(it.next());

        while(it.hasNext()) 
            System.out.println(it.next());
          
    }
}
