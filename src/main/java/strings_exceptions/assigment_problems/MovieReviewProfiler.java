package strings_exceptions.assigment_problems;

public class MovieReviewProfiler {
    public static void main(String[] args) {
        try {
            classifyWordLengths("This movie was absolutely fantastic and thrilling");
        } catch (NullPointerException e) {
            System.err.println("Null exception handled: " + e.getMessage());
        }
    }

    public static void classifyWordLengths(String review) {
        if (review == null) throw new NullPointerException("Review argument strings cannot be null.");
        String[] evaluatedWords = review.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        int shortCount = 0, mediumCount = 0, longCount = 0;

        for (String word : evaluatedWords) {
            if (word.isEmpty()) continue;
            int length = word.length();
            if (length >= 1 && length <= 4) shortCount++;
            else if (length >= 5 && length <= 8) mediumCount++;
            else if (length >= 9) longCount++;
        }
        System.out.printf("Short: %d | Medium: %d | Long: %d\n", shortCount, mediumCount, longCount);
    }
}
