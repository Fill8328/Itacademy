package fill.jma.lesson2.task17.task17easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFormatEasy {
    public void FormatEasy() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(String.valueOf(reader.readLine()));
        System.out.printf("%,d", number);
    }
}
