package session_4.assigment_problems;

class Participant {
    private String name;
    private String teamName;
    private boolean registered;

    public Participant(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.registered = true;
    }

    public Participant(String name) {
        this(name, "Unassigned");
    }

    public void printStatus() {
        System.out.println(this.name + " | " + this.teamName + " | Registered: " + this.registered);
    }
}

public class HackathonRegistration {
    public static void executeRegistrationBatch() {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya"};
        String[] teamNames = {"ByteBusters", "", "CodeCrafters", ""};

        for (int i = 0; i < names.length; i++) {
            Participant participant;
            if (teamNames[i] == null || teamNames[i].trim().isEmpty()) {
                participant = new Participant(names[i]);
            } else {
                participant = new Participant(names[i], teamNames[i]);
            }
            participant.printStatus();
        }
    }

    public static void main(String[] args) {
        executeRegistrationBatch();
    }
}
