package S24;
import java.util.*;

public class FrequencySort
{

    public static Character[] sortByFrequency(String s)
    {

        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store unique characters
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort based on frequency (descending)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Convert to array
        return list.toArray(new Character[0]);
    }

    public static void main(String[] args) {
        String s = "tree";

        Character[] result = sortByFrequency(s);

        System.out.println(Arrays.toString(result));
    }
}
