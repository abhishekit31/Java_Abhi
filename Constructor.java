// constructor in java is a special member which is used to initialize
// the data member of class.
// constructor name should be the same as a class name.
// it called each time whenver the instance of class is created.

class Human {

    private String name;
    private int age; // if you make any variable is private this accesible only isnide this class

    public Human() {
        name = "Goldu";
        age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Human obj = new Human();

        // if we don't set the age or name by default it will take tha value from
        // constructor.
        System.out.println(obj.getName() + ":" + obj.getAge()); // Goldu:20

        obj.setName("Abhishek");
        obj.setAge(26);

        System.out.println(obj.getName() + ":" + obj.getAge()); // Abhishek:26
    }
}
