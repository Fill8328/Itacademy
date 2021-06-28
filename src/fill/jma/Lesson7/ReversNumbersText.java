package fill.jma.Lesson7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReversNumbersText {
    public static void ReversNumbersText () throws IOException {
        try {
            ArrayList<Integer> collection = new ArrayList<>();
            ArrayList<Integer> collectionTwo = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/NymberList"));
            String result = bufferedReader.readLine();
            Integer summ = 0;
            while (result != null) {
                collection.add(Integer.valueOf(result));
                result = bufferedReader.readLine();
            }
            System.out.println(collection+ "   ");
            while (summ<collection.size()){
                ++summ;
                collectionTwo.add(collection.get(collection.size() - summ));
            }
            System.out.print(collectionTwo);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
