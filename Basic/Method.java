package Basic;

// Method in java is a function which is used to behavior of an object.
class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {

        if (cost >= 10) {
            return "pen";
        }
        return "Nothing find at this cost !";
    }
}

public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}
