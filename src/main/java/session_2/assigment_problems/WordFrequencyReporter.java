package session_2.assigment_problems;

import java.util.*;

public class WordFrequencyReporter {
    public static void main(String[] args) {
        try {
            String feedbackParagraph = "The mentor was great, the session was great and clear.";
            printFilteredWordFrequency(feedbackParagraph);
        } catch (NullPointerException e) {
            System.err.println("Exception handled: Content text streams cannot resolve null contexts.");
        }
    }

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null) {
            throw new NullPointerException("Feedback text value is null.");
        }

        Set<String> fillerStopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));
        
        String cleanText = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] separateWords = cleanText.split("\\s+");
        
        Map<String, Integer> wordFrequencyMapping = new HashMap<>();

        for (String activeWord : separateWords) {
            if (activeWord.isEmpty() || fillerStopWords.contains(activeWord)) {
                continue;
            }
            wordFrequencyMapping.put(activeWord, wordFrequencyMapping.getOrDefault(activeWord, 0) + 1);
        }

        List<Map.Entry<String, Integer>> wordSortingList = new ArrayList<>(wordFrequencyMapping.entrySet());
        wordSortingList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<String, Integer> individualEntry : wordSortingList) {
            System.out.println(individualEntry.getKey() + ": " + individualEntry.getValue());
        }
    }
}
