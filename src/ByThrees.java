public class ByThrees implements Series{
    //Below is the field and data type
    int val;
    // Below is the constructor for the class Bytwos
    ByThrees(){
        val = 0;
    }
    //Below the getNext method comes from the interface Series. When implementing an interface you must use all the methods from the interface class
    public int getNext(){
        val += 3;
        return val;
    }
}
