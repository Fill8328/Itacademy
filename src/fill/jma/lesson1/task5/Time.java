package fill.jma.lesson1.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Time {
    public void time() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write time on seconds:");
        int a = Integer.parseInt(String.valueOf(reader.readLine()));
        System.out.print( a + " sec/" + (a/60) + "  min/" + (a/3600) + "  hour/" + (a/86400) + "  day/" + (a/604800) + "  week/");
    }
}
