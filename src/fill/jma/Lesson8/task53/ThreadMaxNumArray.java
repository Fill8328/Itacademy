package fill.jma.Lesson8.task53;

import fill.jma.Lesson8.task52.ThreadАverage;

public class ThreadMaxNumArray extends Thread {
    Thread t;
    String name;

    public ThreadMaxNumArray(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread" + " " + t);
        t.start();
    }

    @Override
    public void run() {
        int max = 0;
        int place = 0;
        int[] array = new int[10];
        System.out.print("original Array = ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
                place = i;
            }
        }
        System.out.println(" max num = " + max);
    }

    public static void allThread() throws InterruptedException {
        new ThreadMaxNumArray("tOne");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tTwo");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tThree");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tFour");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tFive");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tSix");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tSeven");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tEight");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tNine");
        Thread.sleep(1000);
        new ThreadMaxNumArray("tTen");
    }
}