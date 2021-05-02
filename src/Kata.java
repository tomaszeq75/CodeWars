import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static String createPhoneNumber1(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                IntStream.of(numbers).boxed().toArray());
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder("() -");
        int index = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i > 2) index = 3;
            if (i > 5) index = 4;
            result.insert(i + index, numbers[i]);
        }
        return result.toString();
    }
}