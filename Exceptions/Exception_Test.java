package Exceptions;

public class Exception_Test {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[4];
        try {
            j = 10 / i;
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Can't devide by zero" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outside the limit" + e);
        }

        System.out.println(j);
        System.out.println("End Code");
    }
}
