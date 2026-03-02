package S23;

public class StringRotation {

    public static boolean canRotate(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(t);
    }

    public static void main(String[] args) {
        System.out.println(canRotate("abcde", "cdeab")); // true
        System.out.println(canRotate("abcde", "abced")); // false
    }
}
