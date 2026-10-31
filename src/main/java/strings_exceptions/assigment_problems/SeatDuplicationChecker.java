package strings_exceptions.assigment_problems;

public class SeatDuplicationChecker {
    public static void main(String[] args) {
        try {
            int[] testHall1 = {101, 102, 103, 102, 105};
            int[] testHall2 = {101, 102, 103, 104, 105};
            System.out.println("Testing Hall 1:");
            checkDuplicateSeats(testHall1);
            System.out.println("\nTesting Hall 2:");
            checkDuplicateSeats(testHall2);
        } catch (NullPointerException e) {
            System.err.println("Exception: Seating array cannot be null. " + e.getMessage());
        }
    }

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null) throw new NullPointerException("Seat array pointer is null.");
        boolean duplicateFound = false;
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                }
            }
        }
        if (!duplicateFound) System.out.println("No Duplicate Seats Found");
    }
}
