package fill.jma.Lesson6.task41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class BestMark {
    public static void CreateJournalBestMark() {
        ArrayList<Integer> journalBestMark = new ArrayList<>(40);
        for (int i = 0; i < 40; i++) {
            journalBestMark.add(ThreadLocalRandom.current().nextInt(1, 40));
        }
        System.out.println("Class journal mark: " + journalBestMark);
        TreeSet<Integer> set = new TreeSet<>(journalBestMark);
        System.out.println("the best mark of class: " + set.last());
    }
}
