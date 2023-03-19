import javax.swing.*;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3, 3, 2, 4, 1, 2, 6};
        int val = 3;
        printArray(array);
        System.out.println();
        printArray(swap(val, array));

    }

    static int[] swap(int val,  int[] array) {
        int trash = 0;
        int size = array.length;
        int  shift = 1;
        for (int i =0;i <size-shift;i++) {
                while (array[size-shift]== val){
                    shift++;
                }
            if (array[i] == val) {
                trash = array[i];
                array[i] = array[size-shift];
                array[size-shift] = trash;
                shift++;
    }}
    return array; }

    static void printArray(int[] parray) {
        for (int j : parray) {
            System.out.print(j + " ");
        }
    }
}
/* Дан массив nums = [3,2,2,3]и число val = 3
         * Если в массиве есть числа равные заданному,
         * нужно перенести эти элементы в конец массива
         * Таким образом, первые несколько элементов массива должны быть отличны от заданного
         * а остальные равные ему
         */
