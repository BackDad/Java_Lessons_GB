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

    // Необходимо взять код из первого дз и переработать его с учетом обобщений
    // т.е избавиться от классов под каждый тип продукта, заменив единым классом -
    // торговым автоматом

    public static void main(String[] args) throws Exception {
        System.out.println("Hot drinks:");
        VendingMachine<HotDrink> Drinks = new VendingMachine<>();
        Drinks.addProduct(new HotDrink("Горячий шоколад",50,95,0.2));
        Drinks.addProduct(new HotDrink("Зеленый чай",100,85,0.5));
        for (HotDrink product : Drinks.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(Drinks.getProduct(50));
        System.out.println(Drinks.getProduct("Горячий шоколад"));
        System.out.println("\nСнеки:");
        VendingMachine<Bar> Snaks = new VendingMachine<>();
        Snaks.addProduct(new Bar("КЛабсэндвич",100,0.1));
        Snaks.addProduct(new Bar("Круасан",115,0.15));
        for (Bar product : Snaks.getProducts()) {
            System.out.println(product);
        }
    }
}
