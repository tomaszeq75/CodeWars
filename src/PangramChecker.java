import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PangramChecker {
    public static boolean check(String sentence) {

        int[] ints = sentence.toLowerCase()
                .chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .distinct()
                .toArray();
        if (ints.length == 26) return true;
        return false;
    }

    public static boolean check1(String sentence) {
        return sentence.toLowerCase()
                .chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }

}