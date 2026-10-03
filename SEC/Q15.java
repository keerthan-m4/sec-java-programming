public class Q15 {
    public static void main(String[] args) {
        String sentence = "Java is powerful";

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
}