package fill.jma.Lesson7.task46;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Catalog {
    public Catalog() throws FileNotFoundException {
    }

    public static void catalog() throws IOException {
        FileReader reader = new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/texte");
        int res = reader.read();
        while (res != -1) {
            System.out.print((char) res);
            res = reader.read();
        }
    }

    public static void catalogOne() {
        try {
          //  BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/HelloText/How/Please"));
          //  BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/HelloText/How/Please"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/texte"));
            String result = bufferedReader.readLine();
            while (result != null) {
                System.out.println(result);
                result = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void number() throws IOException {
        BufferedWriter a;
        try {
            a = new BufferedWriter(new BufferedWriter(new FileWriter("/Users/user/Desktop/Itacademy/src/fill/jma/lesson4/text")));
            a.write("ABOBA");
            for (int i = 0; i < 20; i++) {
                a.write(" " + i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); return;
        }
        a.close();
    }

    public static void getNameFile() throws IOException {
        String add = null;
        File f1 = new File("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/HelloText");
        String[] nameFile = f1.list();
    for (int i = 0; i < nameFile.length; i++) {
        System.out.println(nameFile[i]);
        add = nameFile[i];
        File f2 = new File("/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/HelloText" + "/" + add);
        String[] nameFileOne = f2.list();
        for (int j = 0; j < nameFileOne.length; j++) {
            System.out.println("  " + nameFileOne[j]);
        }
    }
}
}

