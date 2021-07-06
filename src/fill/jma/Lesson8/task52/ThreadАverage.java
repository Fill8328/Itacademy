package fill.jma.Lesson8.task52;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadАverage implements Runnable{
     Thread t;
     String name;

     ThreadАverage(String threadName){
         name = threadName;
         t = new Thread(this, name);
         System.out.println("New thread" + " "+ t);
         t.start();
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int average = 0;
        for (int j = 0; j < 10; j++) {
            list.add(j, random.nextInt( 100));
            average += list.get(j)/10;
        }
        System.out.println(list + "   average this thread is: " + average);
    }
         public static void allThread() throws InterruptedException {
             new ThreadАverage("tOne");
             Thread.sleep(1000);
             new ThreadАverage("tTwo");
             Thread.sleep(1000);
             new ThreadАverage("tThree");
             Thread.sleep(1000);
             new ThreadАverage("tFour");
             Thread.sleep(1000);
             new ThreadАverage("tFive");
             Thread.sleep(1000);
             new ThreadАverage("tSix");
             Thread.sleep(1000);
             new ThreadАverage("tSeven");
             Thread.sleep(1000);
             new ThreadАverage("tEight");
             Thread.sleep(1000);
             new ThreadАverage("tNine");
             Thread.sleep(1000);
             new ThreadАverage("tTen");
    }
}
