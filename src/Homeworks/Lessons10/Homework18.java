
import java.util.Arrays;

public class Homework18 {

    public static void main(String[] args) {

        int[] mas = new int[11];

        mas[0] = 0;
        mas[1] = 1;
        mas[2] = 2;
        mas[3] = 3;
        mas[4] = 4;
        mas[5] = 5;
        mas[6] = 6;
        mas[7] = 7;
        mas[8] = 8;
        mas[9] = 9;
        mas[10] = 10;

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}