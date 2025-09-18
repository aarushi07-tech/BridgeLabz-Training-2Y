public class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String target = "fox";
        String replacement = "cat";

        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}