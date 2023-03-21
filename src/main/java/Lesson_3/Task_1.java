package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6,8,8));
        System.out.println(integers);
        removeDuplicates(integers);
        System.out.println(integers);
    }
    private static void removeDuplicates(List<Integer> source){
        int i = 0;
        while (i<source.size()){
            int j=i+1;
            while (j<source.size()){
                if (source.get(i).equals(source.get(j))){
                    source.remove(j);
                }
                j++;
            }
            i++;
        }
            
        }
    }
