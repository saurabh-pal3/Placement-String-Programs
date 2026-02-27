package S7;

import java.util.HashMap;
import java.util.Scanner;

public class AllCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}// word count