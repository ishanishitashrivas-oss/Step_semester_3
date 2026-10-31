package strings_exceptions.assigment_problems;

public class WarehouseInventoryBalancer {
    public static void main(String[] args) {
        int[] secA = {20, 15, 30};
        int[] secB = {25, 10, 30};
        analyzeInventory(secA, secB);
    }
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null || sectionA.length != sectionB.length) {
            throw new IllegalArgumentException("Inventory storage size boundaries mismatch.");
        }
        int totalA = 0, totalB = 0;
        for (int val : sectionA) totalA += val;
        for (int val : sectionB) totalB += val;
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s\n", totalA, totalB, (totalA == totalB ? "Balanced" : "Not Balanced"));
    }
}
