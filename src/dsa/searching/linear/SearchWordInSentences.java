package dsa.searching.linear;

/*
 * Linear Search to find the first sentence containing a given word.
 */

public class SearchWordInSentences {

    public static String search(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "DSA is important",
                "Searching algorithms"
        };

        System.out.println(search(sentences, "DSA"));
    }
}
