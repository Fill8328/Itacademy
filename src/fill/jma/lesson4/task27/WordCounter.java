package fill.jma.lesson4.task27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter  {
    public static void Delete(String text) {
        int count = 1;
        text.trim();
        String reformText = new String(text).trim().replaceAll("\\s{2,}", " ");
        Pattern p = Pattern.compile("[ ]");
        Matcher m = p.matcher(reformText);
        while (m.find()) {
            count++;
        }
        System.out.println("всего слов " + count);
    }

}


