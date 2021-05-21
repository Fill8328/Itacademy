package fill.jma.task12;

public class Factorial {
    public void factorial() {
        int sum = 1;
        int i = 1;
        while (i<=10){
            sum = sum * i;
            i++;
        }
        System.out.println(sum);
    }
}
