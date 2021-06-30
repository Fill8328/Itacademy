package fill.jma.Lesson7.task46;

import java.io.*;
import java.util.ArrayList;

public class TotalComander {
    public static void totalCommander() throws IOException {
        int numMenu = 1;
        String root = "/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/HelloText";
        File f1 = new File(root);
        StringBuilder absolutRoad = new StringBuilder();
        absolutRoad.append(root);
        try {
            while (numMenu != 777) {
                String[] nameFile = f1.list();
                ArrayList<String> arrayList = new ArrayList<>();
                System.out.println("chose file");
                if (nameFile.equals(null) ){             //как сделать выход если я пришел в конечный файл?
                    System.out.println("AAAAAA!");
                }
                for (int i = 0; i < nameFile.length; i++) {
                    System.out.println(i + ")" + nameFile[i]);
                    arrayList.add(nameFile[i]);
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int number = Integer.parseInt(String.valueOf(reader.readLine()));
                if (number > nameFile.length) {
                    System.out.println("you chose not correct file, please chose correct file");
                    number = Integer.parseInt(String.valueOf(reader.readLine()));
                }
                String add = arrayList.get(number);
                String road = "/" + add;
                absolutRoad.append(road);
                f1 = new File(String.valueOf(absolutRoad));
                System.out.println(f1);
                BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("if you want to break press 777 else not press other number");
                numMenu = Integer.parseInt(String.valueOf(reader.readLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Good bye");
    }
}
