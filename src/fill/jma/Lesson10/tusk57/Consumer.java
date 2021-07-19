package fill.jma.Lesson10.tusk57;

import fill.jma.Main;

public class Consumer implements Runnable{
    Thread c;
    String name;
    Consumer(String threadName){
        name=threadName;
        c = new Thread(this, name);
        c.start();
    }


    @Override
    public synchronized void run() {

            int count = 0;
            while (count < 5000) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int random = (int) (Math.random() * 100);
                count = count + random;
                Main.element = Main.element - random;
                System.out.println(Thread.currentThread().getName() + " Count is "+ count);
                System.out.println(" Element is   " + Main.element);
            }
            System.out.println(" finish  " + Main.element);

    }


    public static void allThreadConsumer() throws InterruptedException {
        new Consumer("cOne");
        Thread.sleep(1000);
        new Consumer("cTwo");
        Thread.sleep(1000);
    }

}
