package fill.jma.task13;

public class Factorialcyclewhile {
    public void CycleWhile(){
        int i = 1;
        int summ = 1;
        do { summ = summ * i;
            i++;
        }
        while (i <= 25);
            System.out.println(summ);
    }
}
