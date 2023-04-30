import java.util.ArrayList;
//You have to import the above to use the ArrayList
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        // TODO: create cities ArrayList;
      ArrayList<String> cities = new ArrayList<>();
      //above is the syntax for an array list
         cities.add("Paris");
         cities.add("Florence");
         cities.add("Venice");
         cities.add("Versailles");
         cities.add("London");
         cities.add("Petra");
         cities.add("Oslo");
         cities.add("Rome");
         cities.add("Madrid");
         cities.add("Tokyo");
         cities.add("Prague");
         cities.add("Dublin");
         cities.add("Athens");
         cities.add("Marseille");
         cities.add("Chicago");

         System.out.println(cities.size());
         //Gets the size of the array
         System.out.println(cities.get(5));
         //Gets the element at that index
         System.out.println(cities.get(8));

         cities.set(2, "Naples");
         //Sets based on the index
        System.out.println(cities.get(2));
         cities.remove(5);
       System.out.println(cities.get(5));





        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element

       //Below is how you add an element at a specific index
        numbers.add(0, 21);
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        numbers.size(); // 3
        numbers.get(2); // 22

        numbers.indexOf(20);    // 1
        numbers.indexOf("cat"); // -1







       // We'll start by defining an array list and adding some items to it
       ArrayList<String> roasts = new ArrayList<>();
       roasts.add("light");
       roasts.add("medium");
       roasts.add("medium");
       roasts.add("dark");

       System.out.println(roasts); // [light, medium, medium, dark]

// using .contains
       roasts.contains("dark"); // true
       roasts.contains("espresso"); // false

// using .lastIndexOf
       roasts.lastIndexOf("medium"); // 2

// using .isEmpty
       roasts.isEmpty(); // false
       ArrayList<String> emptyList = new ArrayList<>();
       emptyList.isEmpty(); // true

// .remove has two variants
       roasts.remove("espresso"); // false
        //Above remove with an element in the brackets returns a boolean
       roasts.remove("medium"); // true
       System.out.println(roasts); // [light, medium, dark]

       roasts.remove(2); // "dark"
        //Above remove based on the index of the array 
       System.out.println(roasts); // [light, medium]






    }


}
