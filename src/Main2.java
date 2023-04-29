public class Main2 {

    public static void main(String[] args) {

        Shirt shirt1 = new Shirt();
        Pants pants1 = new Pants();
        shirt1.setSize(Shirt.Size.SMALL);
        shirt1.setPrice( 12.55);
        shirt1.setBrand(" Nike");
        shirt1.setColor(" Green");
        shirt1.fold(shirt1);

        pants1.setPrice( 20.55);
        pants1.setBrand(" Puma");
        pants1.setColor(" Purple");
        pants1.fold(shirt1);
// We're using the set size method in product to set the size of the shirt.
//        System.out.println(shirt1.getSize());
//        System.out.println(shirt1.getPrice());

    }

}
