// String in java is a sequence of character which is stored in any variable.
// it immutable in java (means once we declare the string later we cann't changed).

class Mobile {
    static String name; // if we make a varibale as static it will reflect all the object
    int price;
    String brand;

    public void show() {
        System.out.println(name + ":" + price + ":" + brand);
    }

    // static method is called without creating an object of class it will call
    // directly by using className and iside the static method we can create only
    // static variable
    static public void show1() {
        System.out.println("inside the static method");
        // System.out.println(name + ":" + price + ":" + brand);
    }

}

public class StaticMethod {
    public static void main(String[] args) {
        String name = new String("Abhishek"); // here the object is crated inside the
        // heap memory.

        // concatenation of string
        System.out.println(name + " kumar");

        System.out.println(name.concat(" Kumar"));

        // if we are trying to create a string with same namein that case the string
        // is stored in a string constnat pool area. Once we declare the str1
        // it will create an object with str1 inside the const pool area and then we
        // declare the str2 so in that case the string not create the new object
        // it will simply pass the reference of str1.

        String str1 = "Goldu";
        String str2 = "Goldu";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        // StringBuffer (Mutable)

        StringBuffer sb = new StringBuffer("Abhishek");
        System.out.println(sb.capacity());

        Mobile obj1 = new Mobile();
        Mobile.name = "Smart Phone";
        obj1.price = 1500;
        obj1.brand = "Apple";

        Mobile obj2 = new Mobile();
        Mobile.name = "Smart Phone";
        obj2.price = 1000;
        obj2.brand = "Samsung";

        // if you want to make name common for all the object simply make the variale as
        // static coz static varible is shared by all the object.
        // static variable is called via className
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // calling static method by using classNMae
        Mobile.show1();
    }
}
