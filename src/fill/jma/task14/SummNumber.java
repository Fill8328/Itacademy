package fill.jma.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummNumber {
    public void summNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(String.valueOf(reader.readLine()));
        int Summ = 0;
        int num;
        int i = 0;
        do {
            num = Number % 10;
            Summ = Summ + num;
            Number = Number / 10;
            i++;
        }
        while (i < 50);
        System.out.println(Summ);
    }
}
