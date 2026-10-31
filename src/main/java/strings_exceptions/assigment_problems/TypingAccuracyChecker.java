package strings_exceptions.assigment_problems;

public class TypingAccuracyChecker {
    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null || original.length() != typed.length()) {
            throw new IllegalArgumentException("Invalid string parameter arguments evaluated.");
        }
        int matches = 0, mismatchPos = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) matches++;
            else if (mismatchPos == -1) mismatchPos = i + 1;
        }
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%\n", matches, original.length(), ((double)matches/original.length())*100);
    }
}
