package Abstract;
// Abstract is keyword in java which is used to declare the method as a abstract.

// abstract method is only declare iniside the abstract class.
// if any class is extends by abstract class this is mandotory to overide all the abstract method that is declared by Abstact class.
// we cant create an object of abtract class but we can provide the refrence of abstract class.
// inside the abstract class we can have both abstract and concrete method as well.

abstract class Car {
    public abstract void Drive();

    public void playMusic() {
        System.out.println("play the music...");
    }
}

class WagnoR extends Car {
    public void Drive() {
        System.out.println("start driving......");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Car obj = new Car(); // we cann't create an object of abstract class
        Car obj = new WagnoR();
        obj.Drive();
        obj.playMusic();
    }
}
