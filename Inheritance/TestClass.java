package Inheritance;
// Inheritance in a java is a mechanism where child class inherit all the property if parent class

// it is also showing a IS-A realtionship.

public class TestClass {
    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();

        int resAdd = calc.add(10, 20);
        System.out.println(resAdd);

        int resSub = calc.sub(20, 15);
        System.out.println(resSub);

        int resMul = calc.multiply(5, 4);
        System.out.println(resMul);

        int resDiv = calc.division(10, 5);
        System.err.println(resDiv);
    }
}
