package week7;

import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> words = new HashMap<String, String>();
    public String translate(String word) {
        return words.get(word);
    }
    public void add(String word, String translation) {
        words.put(word, translation);
    }
    public int amountOfWords() {
        return this.words.size();
    }
}
