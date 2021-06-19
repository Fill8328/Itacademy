package fill.jma.Lesson6.task40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ClearCopy {
    public static void RandomCollection() {
        Random rnd = new Random();
        ArrayList<Integer> collection = new ArrayList<>();
        final int SIZE = 10;
        for (int i = 0; i < 10; i++) {
            collection.add(ThreadLocalRandom.current().nextInt(1,10));
        }
        System.out.println("ArrayList collection: " + collection);
        Set set = new HashSet();
        set.addAll(collection);

        System.out.println("Set collection: " + set);
        set.stream().sorted();
        System.out.println("Set collection: " + set);

    }
}

