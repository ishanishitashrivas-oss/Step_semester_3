package session_3.assigment_problems;

public class BookInventory {
    private String title;
    private String author;
    private int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.println(this.title + " by " + this.author + " - " + this.copiesAvailable + " copies available");
    }

    public static void executeInventoryRun() {
        BookInventory[] inventory = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory book : inventory) {
            book.printEntry();
        }
    }

    public static void main(String[] args) {
        executeInventoryRun();
    }
}
