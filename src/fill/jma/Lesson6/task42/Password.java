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
        System.out.println("Enter you text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        a = Arrays.asList(word.replaceAll("[,.!?:;]", "").toLowerCase(Locale.ROOT).split(" +"));
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(a.size());


        for (int i = 0; i < a.size(); i++) {
                linkedHashMap.put(a.get(i), linkedHashMap.getOrDefault(a.get(i), 0 ) + 1);
            }
        System.out.println(linkedHashMap);
    }
}
