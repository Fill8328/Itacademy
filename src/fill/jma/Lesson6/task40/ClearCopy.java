package fill.jma.Lesson6.task40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ClearCopy {
    public static void RandomCollection() {
        Random rnd = new Random();
        ArrayList<Integer> collection = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int num = rnd.nextInt(10) + 1;
            collection.add(i, num);
        }
        System.out.println("ArrayList collection: " + collection);
        Set set = new HashSet();
        set.addAll(collection);

        System.out.println("Set collection: " + set);
        set.stream().sorted();
        System.out.println("Set collection: " + set);

    }
}

