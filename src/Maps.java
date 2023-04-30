import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        //Below is the syntax for a new hashmap. inside the angle brackets the first value is the keys and the second value. So the keys are strings and the values are integer
        HashMap <String,Integer> empids = new HashMap<>();

        empids.put("John",1234);
        empids.put("Carl",363846);
        empids.put("Steve", 284683);
        //Above you must put a string first and then an integer like it's specified in the top where the hasmap is created.
        System.out.println(empids);
        //Below to get the value for Carl we put in the key Carl to get his empl number
        System.out.println(empids.get("Carl"));

        System.out.println(empids.containsKey("Carl"));
        //Gets true or false based on if the key is there
        System.out.println(empids.containsValue(1234));

        empids.put("Joe",1357);
        System.out.println(empids);
        //Adds values to the hasmap and if the key already exisit it will update it with the new value

        empids.replace("Steve",987654);
        System.out.println(empids);
        //this updates the value based on the key

        empids.putIfAbsent("Redman",2345678);
        // puts if the key and value don't exist
        System.out.println(empids);

        empids.remove("Redman");
        // removes based on the key
        System.out.println(empids);
    }
}
