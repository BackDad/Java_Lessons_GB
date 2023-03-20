import java.io.*;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + buildString(6,'a','b') + ANSI_RESET);

        TextOut(); //"TEXT x 100"


    }
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    static String buildString(int n, char c1, char c2){
        String result = "";
        for (int i = 0; i <n/2; i++) {
            result+=c1;
            result+=c2;
        }
        return result;
    }
    //Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
    static void TextOut(){
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("file.txt"), "utf-8"));
            for (int i = 1; i <=100 ; i++) {
                writer.write("TEXT "+i);
                writer.write("\n");

            }
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
}
