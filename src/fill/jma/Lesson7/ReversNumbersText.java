package fill.jma.Lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReversNumbersText {

    public static List<Integer> readIntegersFromFile(String path){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            ArrayList<Integer> collection = new ArrayList<>();

            String result = bufferedReader.readLine();
            while (result != null) {
                collection.add(Integer.valueOf(result));
                result = bufferedReader.readLine();
            }
            return collection;
        }
        catch (IOException e){
                throw new RuntimeException();
        }
    }

//    public static List<Integer> reversListElement (ArrayList<Integer> reversNum){
//        return null;
//    }


    public static List<Integer> reversList (List<Integer> list){
        ArrayList<Integer> collectionTwo = new ArrayList<>();
        Integer summ = 0;
        while (summ<list.size()){
            ++summ;
            collectionTwo.add(list.get(list.size() - summ));
        }
        return collectionTwo;
    }
}
