package fill.jma.Lesson7.task48;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NymberFindeSummClear {
    public static void nymberFindeSummClear () throws IOException {
        try {
            ArrayList<Integer> collection = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/NymberList"));
            String result = bufferedReader.readLine();
            Integer summ = 0;
            while (result != null) {
                collection.add(Integer.valueOf(result));
                summ += Integer.valueOf(result);
                result = bufferedReader.readLine();
            }
            System.out.println(collection);
            System.out.println(summ);
            Set set = new HashSet();
            set.addAll(collection);
            System.out.println(set);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
