public class PigLatin {
    public static String pigIt(String str) {
        String words[] = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            char c = w.charAt(0);
            String w2 = String.format("%s%s%s", w.substring(1), c, "ay");
            result.append(w2);
            result.append(" ");

            System.out.println(w);
            System.out.println(w2);

        }
        return result.toString();
    }
}

//todo nie działa tak jak powinno