package hashing.open_addressing.double_hashing;

import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int noOfCellsUsedInHashTable;

    // Constructor
    DoubleHashing(int size) {
        hashTable = new String[size];
        noOfCellsUsedInHashTable = 0;
    }

    // HashFunction to be used on Keys
    public int simpleASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    // Creates a new HashTable and does ReHashing
    public void rehashKeys(String newStringToBeInserted) {
        noOfCellsUsedInHashTable = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insertKeyInHashTable(s);
        }
    }

    // Display the hash table
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exist ! ");
            return;
        } else {
            System.out.println("\n----------HashTable------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index : " + i + " . Key : " + hashTable[i]);
            }
        }
        System.out.println("\n");
    }

    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }

        return sum % M;
    }

    public double getLoadFactor() {
        return noOfCellsUsedInHashTable * 1.0 / hashTable.length;
    }

    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int x = simpleASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex = (x + i * y) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println("The word \"" + value + "\" inserted at location : " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is occupied. Trying next empty index ... ");
                }
            }
        }
        noOfCellsUsedInHashTable++;
    }

    public boolean searchKeyInHashTable(String value) {
        int x = simpleASCIIHashFunction(value, hashTable.length);
        int y = secondHashFunction(value, hashTable.length);
        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (x + i * y) % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(value)) {
                hashTable[newIndex] = value;
                System.out.println("The word \"" + value + "\" found at location : " + newIndex);
                return true;
            }
        }
        System.out.println("The word \"" + value + "\" not found in the hash table");
        return false;
    }

    public void deleteKeyFromHashTable(String value) {
        int x = simpleASCIIHashFunction(value, hashTable.length);
        int y = secondHashFunction(value, hashTable.length);
        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (x + i * y) % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(value)) {
                hashTable[newIndex] = null;
                System.out.println("The word \"" + value + "\" successfully deleted from HashTable !");
                return;
            }
        }
        System.out.println("The word \"" + value + "\" not found in the hash table");
    }
}
