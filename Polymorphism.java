// polymorphism in a java is made upr from two greek word 
// poly -> many && morphism -> forms
// its showing the different different behavioor of its life cycle
class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public void show() {
        System.out.println("in Calc show...");
    }
}

class AdvCalc extends Calc {
    public int mult(int a, int b) {
        return a * b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int res = obj.add(10, 15);
        System.out.println(res);
    }
}
