package com.dwf.service;

import java.util.List;

import com.dwf.model.User;

public interface UserService {

    public void addUser(User team);

    public void updateUser(User team);

    public User getUser(String id);

    public void deleteUser(String id);

    public List<User> getUsers();
    
    public Boolean isExist(String id, String password);

}
