package strings_exceptions.assigment_problems;

public class MovieReviewProfiler {
    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
    public static void classifyWordLengths(String review) {
        if (review == null) throw new NullPointerException("Review content stream holds null context tracking references.");
        int s = 0, m = 0, l = 0;
        for (String word : review.split("\\s+")) {
            int length = word.replaceAll("[^a-zA-Z]", "").length();
            if (length >= 1 && length <= 4) s++;
            else if (length >= 5 && length <= 8) m++;
            else if (length >= 9) l++;
        }
        System.out.printf("Short: %d | Medium: %d | Long: %d\n", s, m, l);
    }
}
