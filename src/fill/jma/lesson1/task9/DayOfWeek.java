package fill.jma.lesson1.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public void dayofweek() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        int a = Integer.parseInt(reader.readLine());
        System.out.println(a);
    }
}
