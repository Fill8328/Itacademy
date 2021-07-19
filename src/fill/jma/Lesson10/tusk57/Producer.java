package fill.jma.Lesson10.tusk57;

import fill.jma.Lesson8.task52.ThreadАverage;
import fill.jma.Main;

public class Producer implements Runnable {
    Thread t;
    String name;

    Producer(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public synchronized void run() {
        while (t.isAlive()) {
            int random = (int) (Math.random() * 100);
            if (Main.element < 80) {
                Main.element = Main.element + random;
                System.out.println(Thread.currentThread().getName() + " Now Element is " + Main.element + "We plus " + random);
                if (Main.element > 100){
                    System.out.println("Element > 100");
                }
            }
        }
    }

        public static void allThreadProducer () throws InterruptedException {
            new Producer("pOne");
            Thread.sleep(1000);
            new Producer("pTwo");
            Thread.sleep(1000);
            new Producer("pThree");
            Thread.sleep(1000);
        }
    }

