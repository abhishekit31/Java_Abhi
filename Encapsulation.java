// Encapsulation in java is conccepts of oops. 
// is like a capsule where inside the capsule there are several medicines 
//esent and no work access outside the class is caled as encapsultion.

// Encapsulation in java is a mechanism which is used for data hiding concepts.
// if we are go to fully encapsulated class so make all the data member as private 
// and provide it by getter and setter method.

class Human {

    private String name;
    private int age; // if you make any variable is private this accesible only isnide this class

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

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setName("Abhishek");
        ;
        obj.setAge(26);
        ;

        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
