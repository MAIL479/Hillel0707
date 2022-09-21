package Homeworks.Lesson3;

public class Homework7 {
    public static void main(String[] args) {
        for (int number = 1; number < 11; number++) {
            String result = String.format("%d*3=%d", number, number * 3);
            System.out.println(result);
        }
    }
}