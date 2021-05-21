package fill.jma;

import fill.jma.task12.Factorial;
import fill.jma.task13.Factorialcyclewhile;
import fill.jma.task6.OperatorDemo;
import fill.jma.task7.CircleRectangle;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OperatorDemo operatorDemo = new OperatorDemo();
        operatorDemo.printSumm();
        CircleRectangle circleRectangle = new CircleRectangle();
        circleRectangle.circlRectangle();
        Factorial factorial = new Factorial();
        factorial.factorial();
        Factorialcyclewhile factorialcyclewhile = new Factorialcyclewhile();
        factorialcyclewhile.CycleWhile();
    }
}
