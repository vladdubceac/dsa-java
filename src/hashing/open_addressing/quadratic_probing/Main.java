package hashing.open_addressing.quadratic_probing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertKeyInHashTable("The");
        quadraticProbing.insertKeyInHashTable("quick");
        quadraticProbing.insertKeyInHashTable("brown");
        quadraticProbing.insertKeyInHashTable("fox");
        quadraticProbing.insertKeyInHashTable("over");
        quadraticProbing.insertKeyInHashTable("lazy");
//        quadraticProbing.displayHashTable();
//        quadraticProbing.searchInHashTable("The");
//        quadraticProbing.searchInHashTable("quick");
//        quadraticProbing.searchInHashTable("brown");
//        quadraticProbing.searchInHashTable("fox");
//        quadraticProbing.searchInHashTable("over");
//        quadraticProbing.searchInHashTable("lazy");
//        quadraticProbing.searchInHashTable("over1");
        quadraticProbing.deleteKeyHashTable("fox1");
        quadraticProbing.deleteKeyHashTable("fox");
        quadraticProbing.displayHashTable();
        quadraticProbing.deleteKeyHashTable("fox");
    }
}
