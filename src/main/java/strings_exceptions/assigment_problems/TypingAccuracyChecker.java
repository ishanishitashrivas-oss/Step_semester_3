package strings_exceptions.assigment_problems;

public class TypingAccuracyChecker {
    public static void main(String[] args) {
        try {
            checkTypingAccuracy("hello world", "hello worlt");
        } catch (IllegalArgumentException e) {
            System.err.println("Exception handled: " + e.getMessage());
        }
    }

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) throw new IllegalArgumentException("Inputs cannot be null.");
        if (original.length() != typed.length()) throw new IllegalArgumentException("Passages must be equal length.");
        
        int totalChars = original.length();
        int matchedChars = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < totalChars; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedChars++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
            }
        }

        double accuracyPercentage = ((double) matchedChars / totalChars) * 100;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%\n", matchedChars, totalChars, accuracyPercentage);
        if (firstMismatchPos != -1) {
            System.out.printf("First Mismatch at position %d ('%s' vs '%s')\n", firstMismatchPos, original.charAt(firstMismatchPos - 1), typed.charAt(firstMismatchPos - 1));
        } else {
            System.out.println("No Mismatches");
        }
    }
}
