package fill.jma.Lesson6.task40;

import java.util.ArrayList;
import java.util.Random;

public class ClearCopy {
    public static void RandomCollection() {
        Random rnd = new Random();
        ArrayList<Integer> collection = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int num = rnd.nextInt(10) + 1;
            collection.add(i, num);
        }
        collection.stream().iterator();
        System.out.println("Collection " + collection);
        for (Integer element : collection) {

            for (Integer element1 : collection) {
                collection.remove(collection.indexOf(element1));
            }
        }
        System.out.print("\n");
        System.out.println("Mark of Jone(only good mark): " + collection);

    }
}
