package fill.jma;

import fill.jma.lesson4.task26.FindComma;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//      Lesson 1-2 task 4-17
        /*
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        Time time = new Time();
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
//      Lesson 3 task 18 19 20 22 23
        /* PrintArray.printArray(array);
        PrintArray.lastElementArray(array);
        PrintArray.evenElementArray(array);
        PrintArray.maxElementArray(array);
        PrintArray.rePlaceArray(array);
        PrintArray.printArrayRevers(array);
        System.out.println();
        System.out.println();
        ArrayButterfly.butterfly();*/
//      Lesson 4 create class

//      Lesson 5
       /* Pattern p = Pattern.compile(" +- +");
        Matcher m = p.matcher("Test - string - test h-h");
        m.find();
        System.out.println(m);
        */
        FindComma findComma = new FindComma();
        FindComma.EnterText();

    }
}
