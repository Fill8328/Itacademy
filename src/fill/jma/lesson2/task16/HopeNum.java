package fill.jma.lesson2.task16;

public class HopeNum {
    public void hope() {
        int Number = 0;
        int range = 100;
        for (int i = 1; i <= range; i++) {
            Number++;
            if (Number % 7 == 0) {
                System.out.println("Hope " + Number);
            }
        }
    }
}
