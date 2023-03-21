
package Home_work_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 8, 8, 16, 88, 14, 12, 21));
        System.out.println(integers);
        removeOddNumber(integers);
        System.out.println(integers); // [1,1,3,5,21]

        ArrayList<String> list = new ArrayList<>(List.of("string", "-s", "-5", "-10", "-12", "my_value","0.24s"));
//        ArrayList<String> list = new ArrayList<>(List.of("3", "4", "5", "10", "-12", "11"));
        System.out.println(list);
        System.out.println(removeNumberFromString(list));

    }

    //Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    private static void removeOddNumber(List<Integer> source) {
        int i = 0;
        while (i < source.size()) {
            if ((source.get(i) % 2) == 0) {
                source.remove(i);
            } else i++;
        }
    }

    //    Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//    Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//    ["string", "s", "my_value"]

    private static List<String> removeNumberFromString(List<String> source) {
        int i = 0;
        List<String> newList = new ArrayList<>();
        while (i < source.size()) {
            newList.add(source.get(i).replaceAll("\\d",""));
            i++;
            newList.remove("-");
            newList.remove("");
        }

        return newList;
    }
}

