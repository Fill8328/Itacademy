package fill.jma.Lesson7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAndCommaCounter {
    public static void commaCounter() throws IOException {
        try {
            ArrayList<String> collection = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/texte"));
            String result = bufferedReader.readLine();
            while (result != null) {
                collection.add(result);
                result = bufferedReader.readLine();
            }
            int count = 0;

            for (int i = 0; i < collection.size(); i++) {
                Pattern comma = Pattern.compile("[,.!?]");
                Matcher matcher = comma.matcher(collection.get(i));
                collection.get(i);
                while (matcher.find()){
                    count++;
                }
            }
            System.out.println("знаков препинания = " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wordCounter() throws IOException {
        try {
            ArrayList<String> collection = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/texte"));
            String result = bufferedReader.readLine();
            while (result != null) {
                collection.add(result);
                result = bufferedReader.readLine();
            }
            int count = 0;

            for (int i = 0; i < collection.size(); i++) {
                Pattern comma = Pattern.compile("[ ]");
                Matcher matcher = comma.matcher(collection.get(i));
                collection.get(i);
                while (matcher.find()){
                    count++;
                }
            }
            System.out.println("всего слов = " + (count+collection.size()));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


