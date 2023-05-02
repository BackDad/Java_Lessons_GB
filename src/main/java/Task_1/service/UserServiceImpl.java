package Task_1.service;

import java.util.List;

import Task_1.model.User;
import Task_1.repository.UserRepository;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }

        UserRepository.saveUser(user);

    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            UserRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            UserRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return UserRepository.getUserList();
    }
}
