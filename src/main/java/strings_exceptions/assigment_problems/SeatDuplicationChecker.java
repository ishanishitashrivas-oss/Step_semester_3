package strings_exceptions.assigment_problems;

public class SeatDuplicationChecker {
    public static void main(String[] args) {
        int[] testHall = {101, 102, 103, 102, 105};
        checkDuplicateSeats(testHall);
    }
    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null) throw new NullPointerException("Seat array pointer is null.");
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    return;
                }
            }
        }
        System.out.println("No Duplicate Seats Found");
    }
}
