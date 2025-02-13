package Threads;

class A extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("somthing went wrong" + e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("something went wrong" + e);
            }
        }
    }
}

public class ThreadsTest {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
