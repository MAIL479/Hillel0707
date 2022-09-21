package Homeworks.Lesson3;

public class Homework6 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 256) {
            if (number == 0) {
                number = 1;
            } else {
                number = number * 2;
            }
            System.out.println(number);
        }
    }
}