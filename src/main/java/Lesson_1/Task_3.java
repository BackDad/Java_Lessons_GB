
public class Task_3 {
public static void main(String[] args){
    String[] array = {"weqq","weqqwereq","weqqffsdfs","weqqfsfsda"};

    String commonPrefix=findCommonPrefix(array);

    System.out.println(commonPrefix);
}
static String findCommonPrefix(String[] array){
    String firstString = array[0];
    for (int i = 0; i < array.length; i++) {
        if (firstString.length()>array[i].length()){
            firstString = array[i];
        }
    }
    String Result = "";
    first:for  (int index = 0; index<firstString.length(); index++) {
        char firstStringChar = firstString.charAt(index);
        for (int i = 1; i < array.length; i++) {

            String second = array[i];
           char secondStringChar = second.charAt(index);

            if (firstStringChar != secondStringChar) {
                break first;
            }

        }
        Result+=firstString.charAt(index);
    }
    return Result;
}
}




//Напишите метод, который находит самую длинную строку общего префикса среди общего массива строк,
//    если общего префикса нет, вернуть путстую строку
