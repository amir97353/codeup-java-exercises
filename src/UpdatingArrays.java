import java.util.Arrays;
//This is to import the toString method so you can print out the whole array by turning it in to a string
public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Expresso","Iced Coffee","Machiato"};
        String menuString = Arrays.toString(menu);
        //We're using the toString method to change menu you in to a string with all the coffes names inside
        System.out.println(menuString);
        //This will print the entire array as a string
        menu[2] = "Latte";
        System.out.println(menu[2]);

        String[] newMenu = new String[5];
        //The above statement means we made a new string called newMenu that can hold five elements. it does not have values just yet.

        for (int i =0;i< menu.length;i++){
            newMenu[i] =menu[i];
        }
        //Here in the for loop we've updated newMenu to equal the original menu based on the index
        System.out.println(Arrays.toString(newMenu));

        int[] numbers = new int[5];
        Arrays.fill(numbers, 10); // fills the array with the value 10
        //Fills the array with values of ten
        System.out.println(Arrays.toString(numbers));
        //numbers array will now show will now show [10,10,10,10,10]

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean result = Arrays.equals(array1, array2);
        System.out.println(result); // Output: true
        //this compares the two arrays and returns true if they are equal

        int[] number = {10, 5, 20, 15};
        int[] copy = Arrays.copyOf(numbers, number.length); // creates a copy of the original array
        System.out.println(copy);

        int[] numbers3 = {10, 5, 20, 15};
        Arrays.sort(numbers); // sorts the array in ascending order
        //Sorts numbers and strings

    }
}
