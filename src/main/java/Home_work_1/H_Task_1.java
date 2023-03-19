
public class H_Task_1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(16, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(isLeapYear(2021)); // false
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(2100)); // false
        System.out.println(isLeapYear(2400)); // true

        for (int i :createArray(4,4)){
        System.out.print(i);
        }


        int[] bin_array =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] test_array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println();

        for (int i : bin_array){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : swap_elements(bin_array)){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : mul_el_array(test_array)){
            System.out.print(i+" ");
        }
        int [][] mat = matrix(4);
        System.out.println();
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
            System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            }

        }





    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return 10 <= a + b && a + b <= 20;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x>0;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static int[] createArray(int len, int initalValue) {

        int [] mass = new int[len];
        for (int i = 0; i <=len-1; i++) {
            mass[i]= initalValue;
        }
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return mass;
    }
//    * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//            * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//            С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static int[] swap_elements(int [] array){
        for (int i = 0; i < array.length; i++) {
        if (array[i] == 1){
            array[i]=0;
            }
        else array[i]=1;
        }
        return array;
    }
//    2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static int [] mul_el_array(int [] array){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < 6) {
                array[i] = array[i]*(2);
            }
        }
        return array;
    }
//3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// * * Также заполнить элементы побочной диагонали
private static int[][] matrix(int len){
        int[][] matrix = new int[len][len];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            if (i == len - j + 1) matrix[i][j] = 1;
            else if (i==j) matrix[i][j]=1;
            else matrix[i][j] = 0;
        }
    }
    return matrix;
}

}