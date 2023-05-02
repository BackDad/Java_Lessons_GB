package Task_1.view;

import java.util.List;

import Task_1.controller.UserBalanceController;

// Реализовать систему работы банковского приложения.

// - Создать класс пользователь и соответсвующие классы
// - Реализовать операции зачисления средств пользователю на счет 
//   и списания(У пользователя должно быть отдельное поле - его балланс)
// - Реализовать функции добавления и удаления пользователя

import Task_1.controller.UserController;
import Task_1.model.User;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.saveUser("Сергей", 34);
        userController.saveUser("Антон", 55);

        printUsers(userController.getUserList());

        UserBalanceController userBalanceController = new UserBalanceController();
        userBalanceController.payment(0, 20000);
        userBalanceController.payment(1, 2000);

        printUsers(userController.getUserList());

        userBalanceController.withdrawal(1, 999000);
        printUsers(userController.getUserList());
        // scanner.close();

    }

    public static void printUsers(List<User> userList) {
        int i = 0;
        for (User user : userList) {
            System.out.printf("index: %d %s \n", i, user);
            i++;
        }
    }
}
