package session_2.assigment_problems;

public class AtmPinValidator {
    public static void main(String[] args) {
        try {
            String testPin1 = "482";
            String testPin2 = "4820";

            System.out.println("Testing PIN 1:");
            checkPinLength(testPin1);

            System.out.println("\nTesting PIN 2:");
            checkPinLength(testPin2);
        } catch (NullPointerException e) {
            System.err.println("Exception handled: PIN input string cannot be null.");
        }
    }

    public static void checkPinLength(String pin) {
        if (pin == null) {
            throw new NullPointerException("PIN string is null.");
        }

        int pinLength = pin.length();
        int requiredLength = 4;

        if (pinLength != requiredLength) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }
}
