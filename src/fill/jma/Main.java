package fill.jma;

import fill.jma.lesson1.OperatorDemo;
import fill.jma.lesson2.CircleRectangle;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OperatorDemo operatorDemo = new OperatorDemo();
        operatorDemo.printSumm();
        CircleRectangle circleRectangle = new CircleRectangle();
        circleRectangle.circlRectangle();
    }
}
