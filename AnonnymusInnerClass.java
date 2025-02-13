abstract class Car {
    public abstract void Drive();
}

// class Tyota extends Car {
// public void Drive() {
// System.out.println("driving the car....");
// }
// }

public class AnonnymusInnerClass {
    public static void main(String[] args) {
        Car obj = new Car() {
            // Anonnymus Inner Class
            public void Drive() {
                System.out.println("Drivind the car.....");
            }
        };
        obj.Drive();
    }
}
