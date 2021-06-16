package fill.jma.Lesson6.task39;

import java.util.ArrayList;
import java.util.Random;

public class BadMark {
    public static void CreateMarkCollection() {
        Random rnd = new Random();
        ArrayList<Integer> journal = new ArrayList<>(30);
        for (int i = 0; i < 10; i++) {
            int mark = rnd.nextInt(10) + 1;
            journal.add(i, mark);
        }
        System.out.println("Mark of Jone(all mark): " + journal);
        for (int j = 0; j < 10; j++) {
            if (journal.contains(1))
                journal.remove(journal.indexOf(1));
            if (journal.contains(2))
                journal.remove(journal.indexOf(2));
            if (journal.contains(3))
                journal.remove(journal.indexOf(3));
        }
        System.out.println("Mark of Jone(only good mark): " + journal);
    }
}
