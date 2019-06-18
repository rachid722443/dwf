package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.dwf.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    public void addUser(User user) {
	getCurrentSession().save(user);
    }

    public void updateUser(User user) {
	User userToUpdate = getUser(user.getId());
	userToUpdate.setPassword(user.getPassword());
	getCurrentSession().update(userToUpdate);

    }

    public User getUser(String id) {
	User user = (User) getCurrentSession().createQuery("from User where id like '" + id + "'").list().get(0);
	return user;
    }

    public void deleteUser(String id) {
	User user = getUser(id);
	if (user != null)
	    getCurrentSession().delete(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
	return getCurrentSession().createQuery("from User").list();
    }

    public List<User> getUser(String id, String password) {
	List<User> user = getCurrentSession().createQuery("from User where id like '" + id + "' and password like '" + password + "'").list();
	return CollectionUtils.isEmpty(user) ? null : user;
    }

}
