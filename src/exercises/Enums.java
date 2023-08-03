package exercises;

import java.util.Locale;

public class Enums {


    public static void main(String[] args) {
        /* Exercise 1: Create enum to represent t-shirt sizes from small to extra extra large*/
        System.out.println("Selected TShirt Size: " + TShirtSize.M);

        /* Exercise 2: Remove the above enum from this class and put it as separate file.
                       You should create a separate class of type enum
                       Run this code and should print T Shirt Size: M*/

        /* Exercise 3: invoke .values() method on ThirstSize enum and loop through its values
                          and while looping lowercase each value
                       hint: while you loop through enums invoke .name() to convert enum to string.
                       without it, you can't lowercase */
        for(TShirtSize size : TShirtSize.values()) {
            String sizeLowercase = size.name().toLowerCase();
            System.out.println(sizeLowercase);
        }

    }

}
