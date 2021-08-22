package ArraysAndLists;
import java.util.HashMap; 

class HashMapUse {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.size();

        for (String i : capitalCities.keySet()) 
            System.out.println(i);

        for (String i : capitalCities.values()) 
            System.out.println(i);
          
        for (String i : capitalCities.keySet())     
            System.out.println("key: " + i + " value: " + capitalCities.get(i));


        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        // people.put("Steve", 4    0);
        people.put("Angie", 33);

        for (String i : people.keySet())
        System.out.println("key: " + i + " value: " + people.get(i));
        
    }
}
