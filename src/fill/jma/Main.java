package fill.jma;

import fill.jma.lesson3.task18_19_20_22.ArrayButterfly;
import fill.jma.lesson3.task18_19_20_22.PrintArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        PrintArray.printArray(array);
        PrintArray.lastElementArray(array);
        PrintArray.evenElementArray(array);
        PrintArray.maxElementArray(array);
        PrintArray.rePlaceArray(array);
        PrintArray.printArrayRevers(array);
        System.out.println();
        System.out.println();
        ArrayButterfly.butterfly();

        /*Time time = new Time();
        time.time();
        SummNum summNum = new SummNum();
        summNum.summNum();
        OperatorDemo operatorDemo = new OperatorDemo();
        operatorDemo.printSumm();
        CircleRectangle circleRectangle = new CircleRectangle();
        circleRectangle.circlRectangle();
        YouBalanceRub youBalanceRub = new YouBalanceRub();
        youBalanceRub.suffixRub();
        DayOfWeek dayOfWeek = new DayOfWeek();
        dayOfWeek.dayofweek();
        Factorial factorial = new Factorial();
        factorial.factorial();
        Factorialcyclewhile factorialcyclewhile = new Factorialcyclewhile();
        factorialcyclewhile.CycleWhile();
        SummNumber sumNumber = new SummNumber();
        sumNumber.sumNumber();
        HopeNum hopeNum = new HopeNum();
        hopeNum.hope();
        NumberFormat numberFormat = new NumberFormat();
        numberFormat.Format();
        NumberFormatEasy numberFormatEasy = new NumberFormatEasy();
        numberFormatEasy.FormatEasy();
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primenumber();*/


        }
    }
