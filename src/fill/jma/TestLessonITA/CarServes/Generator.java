package fill.jma.TestLessonITA.CarServes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {

    public static Map<Integer, Class> map = new HashMap<>(10);

    public static void appendInt(List<Object> list, String path) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(String.valueOf(list));
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Ups, failed to write into file: " + path, e);
        }
    }

    private String name;
    private String carModel;
    Integer engineCapacity;

    public static void factory() {
        for (int i = 0; i < 10; i++) {
            List<Object> huist = List.of(Serves.getBrand().getName(), Serves.getModel(), Serves.getForce());
            appendInt(huist, "/Users/user/Desktop/Itacademy/src/fill/jma/TestLessonITA/CarServes/result");
            System.out.println(huist);
        }
    }

}
