package fill.jma.lesson3;

public class PrintArray {
    public static void printArray(int[] array) {
        System.out.print("original master = ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void lastElementArray(int[] array) {
        System.out.print("last matrix element = " + array[array.length - 1]);
    }
}
