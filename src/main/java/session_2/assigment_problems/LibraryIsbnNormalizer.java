package session_2.assigment_problems;

public class LibraryIsbnNormalizer {
    public static void main(String[] args) {
        try {
            String sampleInput1 = " pen2026004251 ";
            String sampleInput2 = "12N2026004251";

            System.out.println("Testing Entry 1:");
            String normalized1 = normalizeCode(sampleInput1);
            System.out.println(validateAndFormat(normalized1));

            System.out.println("\nTesting Entry 2:");
            String normalized2 = normalizeCode(sampleInput2);
            System.out.println(validateAndFormat(normalized2));
        } catch (IllegalArgumentException e) {
            System.err.println("Exception handled: " + e.getMessage());
        }
    }

    public static String normalizeCode(String raw) {
        if (raw == null) {
            throw new IllegalArgumentException("Raw input string data reference cannot be null.");
        }
        String cleanString = raw.trim();
        if (cleanString.length() < 3) {
            return cleanString;
        }
        String uppercaseHeader = cleanString.substring(0, 3).toUpperCase();
        String bodySection = cleanString.substring(3);
        return uppercaseHeader + bodySection;
    }

    public static String validateAndFormat(String code) {
        int targetLength = 13;
        if (code.length() != targetLength) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String publisherCode = code.substring(0, 3);
        String printingYear = code.substring(3, 7);
        String catalogNumber = code.substring(7);

        StringBuilder outputFormatter = new StringBuilder("[");
        outputFormatter.append(publisherCode).append("] YEAR: ")
                       .append(printingYear).append(" | CATALOG: ")
                       .append(catalogNumber);

        return outputFormatter.toString();
    }
}
