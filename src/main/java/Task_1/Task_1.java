package Task_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Task_1.Person.Sex;

public class Task_1 {

    public static void main(String[] args) {
        List<Person> ListOfPerson = new ArrayList<>();
        ListOfPerson.add(new Person("Сергей", "Мануковский", 29,Sex.MALE, "manuk_1122@MAIL.RU","+79601253072" ));
        ListOfPerson.add(new Person("Мария", "Севрюкова", 19, Sex.FEMALE, "masha1@MAIL.RU","+88005553535" ));
        ListOfPerson.add(new Person("Константин", "Артуров", 24, Sex.MALE, "Artik@MAIL.RU","+79601235695" ));
        Set<Person> Person_set = new HashSet<Person>(ListOfPerson);
        for (Person person : Person_set) {
            if (person.age >= 20)
                System.out.println(person);

        }
    }

}