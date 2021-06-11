package fill.jma.lesson4.task26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindComma {
    public static void EnterText() throws IOException {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = String.valueOf(reader.readLine());

            Pattern comma = Pattern.compile("[,.!?]");
            Matcher matcher = comma.matcher(number);
            while (matcher.find()){
                count++;
            }
            System.out.println("знаков препинания = " + count);
        }
    }
