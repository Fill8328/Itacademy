package fill.jma.lesson4.task28;

public class LastLetter {
    public static void WordOfLastLetter(String text) {
        StringBuilder res = new StringBuilder();

        String[] words = text.split("\\b+");

        System.out.println(" WORDS " + words[1] + words[2]);
        for (String word : words)
            res.append(word.toCharArray()[word.length() - 1]);
        System.out.println("Result: " + res.toString());
    }

}
