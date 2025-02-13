// Interface in java is way to achive fully abstraction.
// inside the interface we can have only abstract method.
// by default inside the interface all the method are public and abstract.
// we can not craete the iinstane of interface as well.
// at the time implemting the interface to the other class we must override the interface method.
// if we don't want to override the interface method make a class as abstract.
// all the variable inside the interface is by default final and static.

package Interface;

interface Car {
    // all the variable inside the interface is by default final and static.
    // sinsce these are static we can directly call this varibke by using inteface.
    int model = 2023;
    String brand = "toyota";

    // by default all the methods inside the interface are public and abstract.
    void Drive();

    void PlayMusic();
}

class WagnoR implements Car {
    public void Drive() {
        System.out.println("driving......");
    }

    public void PlayMusic() {
        System.out.println("play the music....");
    }
}

public class InterfTest {
    public static void main(String[] args) {
        // Car obj = new Car(); // we can not crate the instance of interface.
        Car obj = new WagnoR();

        obj.Drive();
        obj.PlayMusic();

        // Car.brand = "Tata"; // we can't change the final varibale and inside the
        // interface by default all
        // the varibale is static and final.

        System.out.println(Car.model);
        System.out.println(Car.brand);
    }
}
