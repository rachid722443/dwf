package com.dwf.dao;

import java.util.List;

import com.dwf.model.User;

public interface UserDAO {

    public void addUser(User user);

    public void updateUser(User user);

    public User getUser(String id);

    public void deleteUser(String id);

    public List<User> getUsers();
    
    public List<User> getUser(String id, String password);

}
