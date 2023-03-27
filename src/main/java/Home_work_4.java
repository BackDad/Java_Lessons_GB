import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Home_work_4 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> data = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Intro();
        while (true) {
            String s = sc.nextLine();
            if (s.contains("exit")) break;
            else if (s.contains("~")){
                if (s.split("~").length ==2 && s.contains("print~") && s.split("~")[1] !=null)
                    printData(data,Splitter(s)[1]);
                else if (s.split("~").length ==2 && s.split("~")[1] !=null)
                {
                    addData(Splitter(s)[0],data,Splitter(s)[1]);
                    System.out.print("Done>>>>");
                    printList(data);
            }else System.out.println("wrong operation");}
            else System.out.println("wrong operation");
        }
        System.out.println("Завершение программы....");

    }

    public static void addData (String dataIn , LinkedList<String> data , String position){
        if (position == null || Integer.parseInt(position) > data.size())
            System.out.println("wrong operation");
        else data.add(Integer.parseInt(position),dataIn);
    }
    public static void printData(LinkedList<String> data, String position){
        if(data.size()>Integer.parseInt(position))
        System.out.println(data.get(Integer.parseInt(position)));
        else if (data.size()<Integer.parseInt(position))
        {System.out.println("there is no position in this data");}}

    public static String[] Splitter(String s){
        return s.split("~");
    }
    public static void printList(LinkedList<String> data){
        System.out.println(data);
    }
public static void Intro(){
    System.out.println("Здравтсвуйте! В данной программе есть некоторые недочеты с обработкой строки, но базовый функционал работает ");
    System.out.println("заполнение идет строго по порядку начиная с 0 позиции, иначе ошибка");
    System.out.println("Доступные команды:");
    System.out.println("print~position - возврат содержимого по позиции");
    System.out.println("someString~position -добавляет содержимое по позиции");
    System.out.println("exit- завершение программы");
}
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}