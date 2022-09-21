
package Homeworks.Lessons11;

public class Homework19 {

    public static int[] addElement(int[] srcArray, int elementToAdd) {
        int[] destArray = new int[srcArray.length + 1];

        for (int i = 0; i < srcArray.length; i++) {
            destArray[i] = srcArray[i];
        }

        destArray[destArray.length - 1] = elementToAdd;
        return destArray;
    }

    public static void main(String args[]) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int addNumber = 7;
        int[] b = addElement(a,addNumber);
        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i]);
        }

    }
}

