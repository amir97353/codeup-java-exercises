public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name);
    }
    public static void main(String[] args){
    Person person1 = new Person();
        person1.setName("Joe");
        System.out.println(person1.getName());
        person1.sayHello();
    }
};



//The class should have a constructor that accepts a `String` value and sets
//        the person's name to the passed string.
//
//        Create a `main` method on the class that creates a new `Person` object and
//        tests the above methods.




