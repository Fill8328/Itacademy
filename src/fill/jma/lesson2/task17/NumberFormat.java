package fill.jma.lesson2.task17;

public class NumberFormat {
    public void Format() {
        int number = 1111200133;
        int rank = 0;
        int remnant = 0;
        int length = (int) (Math.log10(number) + 1);
        //  System.out.println(length);
        remnant = (length % 3);
        rank = length - remnant;
        int counter = (rank / 3);
        int FerstRank = (int) (number / Math.pow(10, rank));
        if (FerstRank == 0) {
            System.out.print("");
        }
        else {
            System.out.print(FerstRank + " ");
        }
        int OtherRank = 0;
        for (; counter > 0; ) {
            rank = rank - 3;
            OtherRank = (int) ((number / Math.pow(10, rank)) % 1000);
            System.out.print(OtherRank + " ");
            counter--;
            //  System.out.println(counter + " counter");
        }
    }
}


