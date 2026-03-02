package S22;

import java.util.*;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> usedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (usedChars.contains(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
                usedChars.add(ch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}
