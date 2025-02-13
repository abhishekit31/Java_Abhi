package Basic;
// Array in a java is a group of similar types of element that are respresent in 

// a single variable.

// once the size of array is created later on we cann't change the size of it.
// if we declare the size of an array at the times of creation the size is fixed
// we cann't store any element beyond the size of it. If you want to store it will
// throw an arrayOutofBound exception.

class Student {
    String name;
    int roll;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        // 1D Array
        int nums[] = { 2, 4, 5, 3, 9 };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Multidimentional Array

        int numbers[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Array of Object in java

        int num[] = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.roll = 1;
        s1.marks = 88;

        Student s2 = new Student();
        s2.name = "Goldu";
        s2.roll = 2;
        s2.marks = 52;

        Student s3 = new Student();
        s3.name = "Vishu";
        s3.roll = 2;
        s3.marks = 90;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].roll + ":" + students[i].marks);
        }
    }
}
