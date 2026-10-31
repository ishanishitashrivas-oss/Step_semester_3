package session_4.assigment_problems;

class MembershipCard {
    private static String libraryName;
    private static String validUntil;
    private String studentName;

    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";
        System.out.println("Library info loaded");
    }

    public MembershipCard(String studentName) {
        this.studentName = studentName;
    }

    public void printConfirmation() {
        System.out.println("Membership card issued: " + this.studentName);
    }
}

public class LibraryCardRegistry {
    public static void executeCardIssuanceBatch() {
        String[] names = {"Ananya", "Rohan", "Priya", "Arjun", "Sneha"};

        for (String name : names) {
            MembershipCard card = new MembershipCard(name);
            card.printConfirmation();
        }
    }

    public static void main(String[] args) {
        executeCardIssuanceBatch();
    }
}
