package Task_1.service;

import java.util.List;

import Task_1.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}
