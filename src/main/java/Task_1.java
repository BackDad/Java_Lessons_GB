public class Task_1 {
    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + buildString(5,'a','b') + ANSI_RESET);
    }
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    static String buildString(int n, char c1, char c2){
        String result = "";
        for (int i = 0; i <n/2+1; i++) {
            result+=c1;
            result+=c2;
        }

        return result;
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
}
