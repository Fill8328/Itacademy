package fill.jma.TestLessonITA;

import java.util.Random;

public class GenerateXYZ {
    private static int generateXYZ() {
        Random random = new Random();
        int xyz = random.nextInt(10);
        return xyz;
    }

    public static int calculatedXYZ() {
        int x = generateXYZ();
        int y = generateXYZ();
        int z = generateXYZ();
        System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "z = " + z + "\n");

        int mid = 0;
        if (x == z) {
            System.out.println("X равно Z");
            System.out.println("y = " + y);
            System.out.println("среднее арифметическое x y z равно: ");
            return mid = (x + y + z) / 3;
        }
        if (x > z) {
            System.out.println("X больше Z");
            System.out.println(x + " > " + z);
            System.out.println("x + y = " + x + y);

        } else {
            System.out.println("X меньше Z");
            System.out.println(x + "<" + z + "\n");
            System.out.println("y = " + y);
        }
        System.out.println("среднее арифметическое x y z равно: ");
        return mid = (x + y + z) / 3;
    }
}
