// Functional interface in a java is a interface that have (SAM) single Abstract Method.
// by using Functional interface we are enable tje lambda expression.

@FunctionalInterface
interface Movie {
    void book();

    // void show();
}

class user implements Movie {

    @Override
    public void book() {
        System.out.println("booking.....");
    }

    // @Override
    // public void show() {
    // System.out.println("show.....");
    // }

}

public class FunctionalInetrface {
    public static void main(String[] args) {
        Movie mov = new user();
        mov.book();
        // mov.show();

        // Anonymous inner class
        // Movie mov1 = new Movie() {
        // public void book() {
        // System.out.println("In Anonymous inner class");
        // }
        // };
        // mov1.book();
    }
}
