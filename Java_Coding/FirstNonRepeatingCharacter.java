import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                System.out.println(
                        "First non-repeating character: " + ch
                );
                break;
            }
        }
    }
}