package fill.jma.Lesson8.task54;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadWhritePath implements Runnable  {
    Thread t;
    String name;

    ThreadWhritePath(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread" + " "+ t);
        t.start();
    }

    @Override
    public synchronized void run() {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int average = 0;
        for (int j = 0; j < 10; j++) {
            list.add(j, random.nextInt( 100));
            average += list.get(j)/10;
        }
        appendInt(list, "/Users/user/Desktop/Itacademy/src/fill/jma/Lesson8/task54/DemoText");
        System.out.println(list + "   average this thread is: " + average);
    }
    public static void allThread() throws InterruptedException {
        new ThreadWhritePath("tOne");
        Thread.sleep(1000);
        new ThreadWhritePath("tTwo");
        Thread.sleep(1000);
        new ThreadWhritePath("tThree");
        Thread.sleep(1000);
        new ThreadWhritePath("tFour");
        Thread.sleep(1000);
        new ThreadWhritePath("tFive");
        Thread.sleep(1000);
        new ThreadWhritePath("tSix");
        Thread.sleep(1000);
        new ThreadWhritePath("tSeven");
        Thread.sleep(1000);
        new ThreadWhritePath("tEight");
        Thread.sleep(1000);
        new ThreadWhritePath("tNine");
        Thread.sleep(1000);
        new ThreadWhritePath("tTen");
    }

    public static void appendInt(List<Integer> list, String path) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(String.valueOf(list));
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Ups, failed to write into file: " + path, e);
        }
    }



}
