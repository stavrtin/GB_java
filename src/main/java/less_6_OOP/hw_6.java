package less_6_OOP;

import java.util.Arrays;
import java.util.HashSet;

public class hw_6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "One";
        cat1.color = "Blue";
        cat1.age = 3;
        cat1.id = 1;


        Cat cat2 = new Cat();
        cat2.name = "Two";
        cat2.color = "white";
        cat2.age = 3;
        cat2.id = 1;

        Cat cat3 = new Cat();
        cat3.name = "Three";
        cat3.color = "Red";
        cat3.age = 3;
        cat3.id = 3;

        Cat cat4 = new Cat();
        cat4.name = "Two";
        cat4.color = "Blue";
        cat4.age = 3;
        cat4.id = 1;

        System.out.println(cat3);

        var catList = new HashSet<Cat>(Arrays.asList(cat2, cat1, cat3, cat4));
        System.out.println(catList);
        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(cat1.equals(cat2));
        System.out.println(catList);


    }
}
