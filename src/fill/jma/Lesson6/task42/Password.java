package fill.jma.Lesson6.task42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public class Password {

    private static List<String> a;

    public static void Password() throws IOException {
        int length = 0;
        System.out.println("Enter you text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        a = Arrays.asList(word.replaceAll("[,.!?:;]", "").toLowerCase(Locale.ROOT).split(" +"));
        length = a.size();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(length);

        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                }
                linkedHashMap.put(a.get(i), count);
            }
        }
        System.out.println(linkedHashMap);
    }
}
