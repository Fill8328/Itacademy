package fill.jma.lesson4.task28;

public class LastLetter {
    public static void WordOfLastLetter(String text) {
        StringBuilder res = new StringBuilder();

        String[] words = text.split("\\b+");

        for (String word : words)
            res.append(word.toCharArray()[word.length() - 1]);
        System.out.println("Result: " + res.toString());
    }

}
