// import java.util.*;
// import java.util.function.Function;
// import java.util.stream.Collectors;

// public class NonRepeatingCharacter {

//     public static void main(String[] args) {

//         String str = "swiss";

//         Character result = str.chars()
//                 .mapToObj(c -> (char) c)
//                 .collect(Collectors.groupingBy(
//                         Function.identity(),
//                         LinkedHashMap::new,
//                         Collectors.counting()
//                 ))
//                 .entrySet()
//                 .stream()
//                 .filter(entry -> entry.getValue() == 1)
//                 .map(Map.Entry::getKey)
//                 .findFirst()
//                 .orElse(null);

//         System.out.println("First non-repeating character: " + result);


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(
                        "First non-repeating character: "
                                + entry.getKey()
                );
                break;
            }
        }
    }
}