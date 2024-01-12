package trees.trie;

public class Main {
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");

        newTrie.search("API");
        newTrie.search("APIS");
        newTrie.search("AP");
        newTrie.search("APS");
    }
}
