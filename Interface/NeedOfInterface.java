package Interface;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile and run via Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile and run via Desktop");
    }
}

class developer {
    public void devApp(Computer com) {
        com.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        developer abhi = new developer();
        abhi.devApp(lap);
    }
}
