package fill.jma.lesson4.task31;

public class WordAdditionTime {

    private String ex = "ABOBA";

    private String foo = "ABOBA";

    public static void TheFirst() {
        long m = System.currentTimeMillis();
        WordAdditionTime wordAdditionTime = new WordAdditionTime();
        for (int i = 0; i < 10000; i++) {
            wordAdditionTime.ex = wordAdditionTime.ex + wordAdditionTime.foo;
        }
        System.out.println("the first method = " + (double) (System.currentTimeMillis() - m) + " milsec");
    }

    public static void TheSecond() {
        long m = System.currentTimeMillis();
        WordAdditionTime wordAdditionTime = new WordAdditionTime();
        StringBuilder stringBuilder = new StringBuilder(wordAdditionTime.ex);
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(wordAdditionTime.ex);
        }
        System.out.println("the second method = " + (double) (System.currentTimeMillis() - m) + " milsec");
    }
}
