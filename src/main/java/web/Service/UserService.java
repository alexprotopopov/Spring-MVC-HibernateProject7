package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
