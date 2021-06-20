package fill.jma.Lesson6.task41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BestMark {
    public static void CreateJournalBestMark() {
        ArrayList<Integer> journalBestMark = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            journalBestMark.add(ThreadLocalRandom.current().nextInt(1, 10));
        }
        System.out.println("Class journal mark: " + journalBestMark);
        Set set = new HashSet();
        set.addAll(journalBestMark);
        set.stream().sorted();
        journalBestMark.removeAll(journalBestMark);
        journalBestMark.addAll(set);
        System.out.println("the best mark of class: " + journalBestMark.get(journalBestMark.size() - 1));
    }
}
