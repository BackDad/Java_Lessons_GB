package Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    public String name, lastName;
    public Integer age;
    private String email, mobile;
    public Sex sex;
    public enum Sex {
        MALE, FEMALE, UNKNOWN
    }

    @Override
    public String toString() {
        List<String> objStr = new ArrayList<>();
        objStr.add(name.substring(0, 1).toUpperCase() + name.substring(1));
        objStr.add(lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
        objStr.add(String.format("[%s|%s]", age, sex));
        objStr.add("e-mail:" + email);
        objStr.add("mobile:" + mobile);
        return String.join(" ", objStr);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person SomePerson = (Person) obj;
        if (SomePerson.getEmail() != null && email != null && SomePerson.getEmail().equals(email))
            return true;
        if (SomePerson.getMobile() != null && mobile != null && SomePerson.getMobile().equals(email))
            return true;
        if (SomePerson.getEmail() != null && SomePerson.getMobile() != null) {
            return false;
        }

        if ((SomePerson.email == null && SomePerson.mobile == null && SomePerson.name.equals(name)
                && SomePerson.lastName.equals(lastName) && SomePerson.age.equals(age)
                && SomePerson.sex.equals(sex))
        ) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (email != null) {
            return Objects.hash(email);
        }
        if (mobile != null) {
            return Objects.hash(mobile);
        }
        return Objects.hash(name, lastName, age, sex, mobile, email);
    }

    public void setMobile(String mobile) {
            this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
            this.email = email.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public Person(String name, String lastName, Integer age, Sex gender, String email, String mobile) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = gender;
        setEmail(email);
        setMobile(mobile);
    }

}