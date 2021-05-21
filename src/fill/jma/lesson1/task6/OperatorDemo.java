package fill.jma.lesson1.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorDemo {
    public void printSumm() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write you number  ");
        System.out.print("a=");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("b=");
        int b = Integer.parseInt(reader.readLine());
        int c = (a + b) + (a * b);
        System.out.println("(a+b)+(a*b) = " + c);

    }
}
