// Lambda expression is a feature introduced in java-8.
// it is work only with Functional Interface.
// by using lambda expression we can resduce the number of line of code.

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

// class User implements Movie {
// @Override
// public void book() {
// System.out.println("booking......");
// }
// }

public class lambdaExpression {
    public static void main(String[] args) {

        // Movie obj = new User();
        // obj.book();

        // lambda expression
        Calculator obj = (a, b) -> a + b;

        int res = obj.add(5, 5);
        System.err.println(res);
    }
}
