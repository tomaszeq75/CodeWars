import java.util.*;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        String[] wordsTable = words.split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (String w : wordsTable) {
            int position = w.chars().filter(Character::isDigit).findFirst().orElse(0);
            if (position != 0) map.put(position, w);
        }
        return String.join(" ", map.values());
    }

    public static String order1(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> s.replaceAll("\\D+", "")))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
        System.out.println(Order.order("is This Test a"));

    }
}