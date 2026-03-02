package S27;



import java.util.HashMap;

public class BeautyOfStringCollection {

    public static void main(String[] args) {

        String s = "aabcb";
        int totalBeauty = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int value : map.values()) {
                    max = Math.max(max, value);
                    min = Math.min(min, value);
                }

                totalBeauty += (max - min);
            }
        }

        System.out.println("Total Beauty (Collection): " + totalBeauty);
    }
}
