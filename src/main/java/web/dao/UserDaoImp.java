package web.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;


import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @Transactional
//    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        TypedQuery<User> query = (TypedQuery<User>) sessionFactory.getCurrentSession().createQuery("FROM User", User.class);
        return query.getResultList();

    }
}