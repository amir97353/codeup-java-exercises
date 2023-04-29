public class Main2 {

    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(Shirt.Size.SMALL,12.99,"Green","Puma");
        shirt1.fold(shirt1);

        Pants pants1 = new Pants(10,10, 10.22,"red","Nike");
        pants1.fold(pants1);

        shirt1.wear();
        pants1.wear();
        //When i call the abstract for the sgirt and pant class is excutes the overidden wear method that's in the Product class. What is actually being done when the overide is happening is in the children classes Pants and shirts







//        shirt1.setSize(Shirt.Size.SMALL);
//        shirt1.setPrice( 12.55);
//        shirt1.setBrand(" Nike");
//        shirt1.setColor(" Green");
//        shirt1.fold(shirt1);
//
//        pants1.setPrice( 20.55);
//        pants1.setBrand(" Puma");
//        pants1.setColor(" Purple");
//        pants1.fold(shirt1);
// We're using the set size method in product to set the size of the shirt.
//        System.out.println(shirt1.getSize());
//        System.out.println(shirt1.getPrice());



    }

}
