package fill.jma.lesson3.task18_19_20_22;

public class PrintArray {
    public static void printArray(int[] array) {
        System.out.print("original Array = ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void lastElementArray(int[] array) {
        System.out.print("last matrix element = " + array[array.length - 1]);
    }

    public static void evenElementArray(int[] array) {
        System.out.println("");
        System.out.print("even element array is: ");
        for (int j = 0; j < array.length; j++) {
            if ((j + 1) % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
    }

    public static void maxElementArray(int[] array) {
        System.out.println("");
        int max = 0;
        int place = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                place = i;
            }
        }
        System.out.println("the largest element is: " + max + "\nindex of the maximum matrix element: " + place);
    }

    public static void rePlaceArray(int[] array) {
        int i = 0;
        int temp = 0;
        int length = array.length - 1;
        while (i < length) {
            temp = array[i];
            array[i] = array[length];
            array[length] = temp;
            i++;
            length--;
        }
    }
    public static void printArrayRevers(int []array) {
        System.out.print("Array revers ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" " + array[j]);
        }
    }
}

