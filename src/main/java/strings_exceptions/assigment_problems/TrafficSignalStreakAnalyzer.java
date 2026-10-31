package strings_exceptions.assigment_problems;

public class TrafficSignalStreakAnalyzer {
    public static void main(String[] args) {
        try {
            findLongestStreak("RRGGGYRR");
            findLongestStreak("RRRRYYGG");
        } catch (RuntimeException e) {
            System.err.println("Tracking error: " + e.getMessage());
        }
    }

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) throw new RuntimeException("Log empty or null.");
        char longestColor = signalLog.charAt(0);
        int maxStreak = 1;
        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    longestColor = currentColor;
                }
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }
        }
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestColor = currentColor;
        }
        System.out.println("Longest Streak: '" + longestColor + "' repeated " + maxStreak + " times");
    }
}
