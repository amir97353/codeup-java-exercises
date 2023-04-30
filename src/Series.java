


public interface Series {

    //Side note-interfaces can extend other interfaces

    //Below inside the interface you can define variables. The variables will be able to be accessed in the classes that have Series implemented

    int Max = 10;
    String Error = "Can not go above" + Max;
    int getNext();

    //interfaces can have a body in the method if it is a default method.
    default void printStuff(){
        printMoreStuff();
        System.out.println("this is a default method");
    }
//This is a private method below that is being ran in a the public method above.
    private void printMoreStuff(){
        System.out.println("more stuff");
    }


}
