package week7;

import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<String, String>();
        numbers.put("matti'", "mage");
        numbers.put("mikael", "mixu");
        numbers.put("arto", "arppa");

        System.out.println(numbers.get("mikael"));
    }
}
