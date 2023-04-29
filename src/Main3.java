public class Main3 {
    public static void main(String[] args) {
        Bytwos bytwos1 = new Bytwos();
        ByThrees byThrees1 = new ByThrees();
        //Below is an object of the interface series. It can reference any of the objects or classes that implement the Series interface
        Series seriesObjcet;

        //You can only use the method's in the interface when referencing classes.

        //Below is the implementation of the get next method that's implemented in series and what it does is defined in the class
        for (int i = 0; i < 5; i++) {
            System.out.println(bytwos1.getNext());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(byThrees1.getNext());
        }



        for (int i = 0; i < 10; i++) {
            //Below we've referenced the interface object and made it equal to the new object of the bytwo's class
            seriesObjcet = bytwos1;
            //Now you would do seriesObject.getNext() since the interface object is equal to object gettwo's
            System.out.println("By two's" + seriesObjcet.getNext());
            //Below the same thing is being done with the byThrees1 objcet
            seriesObjcet = byThrees1;
            System.out.println("By Threes" + seriesObjcet.getNext());
        }






    }
}
