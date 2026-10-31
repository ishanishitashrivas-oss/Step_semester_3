package session_2.assigment_problems;

public class ProductInventoryParser {
    public static void main(String[] args) {
        try {
            String recordLine1 = "Wireless Mouse,WM-2201,150";
            String recordLine2 = "Wireless Mouse,150";

            System.out.println("Parsing Record 1:");
            parseInventoryRecord(recordLine1);

            System.out.println("\nParsing Record 2:");
            parseInventoryRecord(recordLine2);
        } catch (NullPointerException e) {
            System.err.println("Exception handled: CSV input path cannot point to null references.");
        }
    }

    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null) {
            throw new NullPointerException("Input CSV line is null.");
        }

        String[] inventoryFields = csvLine.split(",");
        int expectedFieldCount = 3;

        if (inventoryFields.length != expectedFieldCount) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = inventoryFields;
        String productSku = inventoryFields;
        String productQuantity = inventoryFields;

        System.out.println("Product: " + productName + " | SKU: " + productSku + " | Qty: " + productQuantity);
    }
}
