// Method overloading in java is a mechanism that provide us to crate a same method
// inside the class with different parameter is known as method overloading.

class Calculator {

    int num = 10; // this is the instance variable and it is stored in heap memory.

    public int add(int n1, int n2) {
        // here n1 and n2 is the local variable becasue it is created iside the add
        // method.
        // here the n1 and n2 is stored in add stack

        System.out.println(num); // it print num = 10
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int data = 20; // the data is stored in the main stack
        System.out.println(data);

        int res = obj.add(10, 15);
        System.out.println("The additionTwo is : " + res);

        int res1 = obj.add(10, 15, 20);
        System.out.println("The additionThree is : " + res1);

        Calculator obj1 = new Calculator();
        obj1.num = 20;
        System.out.println("from obj :" + obj.num); // hereit print num= 10;
        System.out.println("from obj1 :" + obj1.num); // hereit print num= 20;
    }
}