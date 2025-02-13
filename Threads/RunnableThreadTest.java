package Threads;

class A implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("somthing went wrong" + e);
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("something went wrong" + e);
            }
        }
    }
}

public class RunnableThreadTest {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
