package fill.jma.Lesson6.task39;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BadMark {
    public static void CreateMarkCollection() {
        ArrayList<Integer> journal = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            journal.add(ThreadLocalRandom.current().nextInt(1, 10));
        }
        System.out.println("Mark of Jone(all mark): " + journal);
        journal.removeIf(n -> (n <= 4));
        System.out.println("Mark of Jone(only good mark): " + journal);
    }

}
