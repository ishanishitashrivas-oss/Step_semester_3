package session_2.assigment_problems;

public class WordReversalEncoder {
    public static void main(String[] args) {
        try {
            String inputSentence = "hello club";
            String encryptedResult = reverseEachWord(inputSentence);
            System.out.println("Original: " + inputSentence);
            System.out.println("Encoded:  " + encryptedResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception handled: " + e.getMessage());
        }
    }

    public static String reverseEachWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence string input cannot be null.");
        }

        String[] wordBlocks = sentence.split(" ");
        StringBuilder completeEncodedSentence = new StringBuilder();

        for (int i = 0; i < wordBlocks.length; i++) {
            String currentWord = wordBlocks[i];
            StringBuilder reversedWordWorker = new StringBuilder(currentWord);
            
            completeEncodedSentence.append(reversedWordWorker.reverse().toString());

            if (i < wordBlocks.length - 1) {
                completeEncodedSentence.append(" ");
            }
        }

        return completeEncodedSentence.toString();
    }
}
