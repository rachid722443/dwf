package com.dwf.service;

import java.util.List;

import javax.sound.sampled.Port.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.dwf.dao.UserDAO;
import com.dwf.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {
	userDAO.addUser(user);
    }

    public void updateUser(User user) {
	userDAO.updateUser(user);
    }

    public User getUser(String id) {
	return userDAO.getUser(id);
    }

    public void deleteUser(String id) {
	userDAO.deleteUser(id);
    }

    public List<User> getUsers() {
	return userDAO.getUsers();
    }

    @Override
    public Boolean isExist(String id, String password) {
	User user = userDAO.getUser(id, password)!=null ? userDAO.getUser(id, password).get(0) : null;
	Boolean userExist = user!=null;
	InfoService.setConnection(userExist);
	InfoService.setUser(user);
	return userExist;
    }

}
