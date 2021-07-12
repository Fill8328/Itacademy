package fill.jma.TestLessonITA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateArray {
    private static int size = 10;
    private static ArrayList<Integer> array = new ArrayList<>(size);
    private static ArrayList<Integer> generateArray(){
        for (int i = 0; i < size; i++) {
            array.add(ThreadLocalRandom.current().nextInt(-300, 300));
        }
        return array;
    }
    public static void printArray(){
        generateArray();
        System.out.println("Му array " + array);
        System.out.println("Мax in array " + Collections.max(array));
        System.out.println("Min in array " + Collections.min(array));
        System.out.println("index max " + array.indexOf(Collections.max(array)));
        array.set(array.indexOf(Collections.max(array)), ( Collections.min(array)*Collections.max(array)));
        System.out.println("Му new array " + array);
    }
}
