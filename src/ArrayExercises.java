import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Amir");
        people[1] = new Person("Bob");
        people[2] = new Person("Steve");

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array,array.length+1);
                people[array.length] = newPerson;
                return people;
    }
}
