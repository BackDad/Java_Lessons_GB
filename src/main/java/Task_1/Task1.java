package Task_1;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String poem = "Мороз и солнце день чудесный, Еще ты дремлешь друг прелестный, Пора красавица проснись";
        SortLetters(poem);
    }
    static void SortLetters(String str) {
        str = SignOff(str);
        String [] words = str.split((" "));
        LinkedList<String> result = new LinkedList<>();
        System.out.println(Arrays.toString(words));
        Map<Integer, List<String>> letter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (String s : words) {
                if (s.length() == i) {
                    letter.put(i, Collections.singletonList(s));
                    if (letter.get(i) != null) {
                        result.add(s);
                    }
                    letter.put(i, result);
                }
            }
            result = new LinkedList<>();
        }
        System.out.println(letter);
    }
    public static String SignOff(String str) {
        return str.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
    }
}