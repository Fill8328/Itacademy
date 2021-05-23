package fill.jma.lesson2.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFormat {
    public void Format() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(String.valueOf(reader.readLine()));
        int rank = 0;
        int remnant = 0;
        int length = (int) (Math.log10(number) + 1);
        remnant = (length % 3);
        rank = length - remnant;
        int counter = (rank / 3);
        int FerstRank = (int) (number / Math.pow(10, rank));
        if (FerstRank == 0) {
            System.out.print("");
        } else {
            System.out.print(FerstRank + " ");
        }
        int OtherRank = 0;
        while (counter > 0) {
            rank = rank - 3;
            OtherRank = (int) ((number / Math.pow(10, rank)) % 1000);
            if (OtherRank == 0)
                System.out.print("000 ");
            else if (OtherRank < 10) {
                System.out.print("00" + OtherRank + " ");
            } else if (OtherRank <= 99) {
                System.out.print("0" + OtherRank + " ");
            } else {
                System.out.print(OtherRank + " ");
            }
            counter--;
        }
    }
}


