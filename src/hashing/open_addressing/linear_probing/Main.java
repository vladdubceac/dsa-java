package hashing.open_addressing.linear_probing;

public class Main {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(13);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("quick");
        linearProbing.insertInHashTable("brown");
        linearProbing.insertInHashTable("fox");
        linearProbing.insertInHashTable("over");

        linearProbing.searchHashTable("fox");
        linearProbing.searchHashTable("fox1");

        linearProbing.deleteKeyHashTable("fox");
        linearProbing.deleteKeyHashTable("fox2");

        linearProbing.displayHashTable();
    }
}
