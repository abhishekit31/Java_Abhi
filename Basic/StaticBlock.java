package Basic;

class Mobile {
    static String name;
    int price;
    String brand;

    // constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("inside the constrcutor");
    }

    // static block - static block is excecuted only once no matter how many objects
    // you have craeted and it is called first at the time of class loading by class
    // loader
    static {
        name = "phoneeeee";
        System.out.println("inside the satic block");
    }

    public void show() {
        System.out.println(name + ":" + price + ":" + brand);
    }
}

public class StaticBlock {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        Mobile.name = "Smart Phone";
        obj1.price = 1500;
        obj1.brand = "Apple";

        Mobile obj2 = new Mobile();
        Mobile.name = "Smart Phone";
        obj2.price = 1000;
        obj2.brand = "Samsung";

        // Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
