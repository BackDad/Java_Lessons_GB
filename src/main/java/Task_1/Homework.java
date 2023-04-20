package Task_1;

public class Homework {
    // Создать наследника реализованного класса ГорячийНапиток с дополнительным
    // полем int температура.
    // Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
    // реализовать
    // перегруженный метод getProduct(int name, int volume, int temperature)
    // выдающий продукт соответствующий имени, объему и температуре
    // В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
    // и воспроизвести логику заложенную в программе
    // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
    public static void main(String[] args) throws Exception {
        HotDrinkMachine NewMachine = new HotDrinkMachine();
        NewMachine.addProduct(new HotDrink("Кофе", 170, 95, 0.2));
        NewMachine.addProduct(new HotDrink("Кофе со сливками", 190, 80, 0.35));
        for (Product product : NewMachine.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(NewMachine.getProduct("Кофе"));
        System.out.println(NewMachine.getProduct(80));
        System.out.println(NewMachine.getProduct(0.35  ));


    }
}
