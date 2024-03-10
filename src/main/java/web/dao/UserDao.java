package web.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
