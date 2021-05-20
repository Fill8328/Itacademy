package fill.jma.lesson2;

public class CircleRectangle {
    public void circlRectangle() {
        double b = 9;
        double a = 9;
        double r = 5;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("диагональ прямоугольника с=" + c);
        if (c > r) {
            System.out.println("нужен больше круг");
        } else {
            System.out.println("закроет прямоугольник");
        }
    }
}
