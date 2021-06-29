package fill.jma.Lesson7;

import java.beans.Customizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReversNumbersText {

    public static List<Integer> readIntegersFromFile(String path) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            ArrayList<Integer> collection = new ArrayList<>();

            String result = bufferedReader.readLine();
            while (result != null) {
                collection.add(Integer.valueOf(result));
                result = bufferedReader.readLine();
            }
            return collection;
        } catch (IOException e) {
            throw new RuntimeException();
        }
        catch (NumberFormatException formatException){
            throw new RuntimeException("Uncorrected format data", formatException);
        }
    }

    public static List<Integer> reversList(List<Integer> list) {
        ArrayList<Integer> collectionTwo = new ArrayList<>();
        Integer summ = 0;
        while (summ < list.size()) {
            ++summ;
            collectionTwo.add(list.get(list.size() - summ));
        }
        return collectionTwo;
    }
}
