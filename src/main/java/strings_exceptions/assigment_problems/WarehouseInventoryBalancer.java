package strings_exceptions.assigment_problems;

public class WarehouseInventoryBalancer {
    public static void main(String[] args) {
        try {
            int[] sectionA = {20, 15, 30};
            int[] sectionB = {25, 10, 30};
            analyzeInventory(sectionA, sectionB);
        } catch (Exception e) {
            System.err.println("Generic processing check failed: " + e.getMessage());
        }
    }

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null || sectionA.length != sectionB.length) {
            throw new IllegalArgumentException("Inventory sections must be non-null and equal length.");
        }
        int totalA = 0, totalB = 0;
        int highestQuantity = Integer.MIN_VALUE;
        String locationTag = "";
        int targetIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                locationTag = "Section A";
                targetIndex = i + 1;
            }
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                locationTag = "Section B";
                targetIndex = i + 1;
            }
        }
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)\n", totalA, totalB, status, highestQuantity, locationTag, targetIndex);
    }
}
