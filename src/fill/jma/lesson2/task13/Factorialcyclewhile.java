package fill.jma.lesson2.task13;

import java.math.BigInteger;

public class Factorialcyclewhile {
    public void CycleWhile(){
        int ii = 1;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger i = BigInteger.valueOf(1);
        BigInteger summ = BigInteger.valueOf(1);
        do { summ = summ.multiply(i);
            i = i.add(a);
            ii++;
        }
        while (ii <= 25);
            System.out.println(summ);
    }
}
