
@FunctionalInterface
interface Movie {
    void book(int i);
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
        Movie obj = (int i) -> System.out.println("boking inside the lambda expression..." + i);

        obj.book(5);
    }
}
