package Homeworks.Lesson5;

public class Homework10 {

    public static void main(String[] args) {
        int number = 5;
        for (int step = 0; step < number + 1; step++) {
            for (int star = 0; star < number - step; star++) {
                System.out.print(" ");
            }
            for (int interval = 1; interval <= step; interval++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
