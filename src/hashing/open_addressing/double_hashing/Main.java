package hashing.open_addressing.double_hashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(13);
        doubleHashing.insertKeyInHashTable("The");
        doubleHashing.insertKeyInHashTable("quick");
        doubleHashing.insertKeyInHashTable("brown");
        doubleHashing.insertKeyInHashTable("fox");
        doubleHashing.insertKeyInHashTable("over");
        doubleHashing.insertKeyInHashTable("lazy");
//        doubleHashing.displayHashTable();
        doubleHashing.searchKeyInHashTable("The");
        doubleHashing.searchKeyInHashTable("quick");
        doubleHashing.searchKeyInHashTable("brown");
        doubleHashing.searchKeyInHashTable("fox");
        doubleHashing.searchKeyInHashTable("over");
        doubleHashing.searchKeyInHashTable("lazy");
        doubleHashing.searchKeyInHashTable("TEST");
        doubleHashing.displayHashTable();
        doubleHashing.deleteKeyFromHashTable("fox");
        doubleHashing.deleteKeyFromHashTable("1fox");
        doubleHashing.displayHashTable();
    }
}
