// Method overriding in java is inheting a method of super class and changing the implementation in sub class.
// to override the method from super class sub class should re-write the same method signatureof super class.

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a + b + 1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int res = obj.add(10, 15);
        System.out.println(res);
    }
}
