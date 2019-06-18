package com.dwf.service;

import com.dwf.model.User;

public class InfoService {

    private static Boolean connection = false;

    private static User user = null;
    
    public static Boolean getConnection() {
        return connection;
    }

    public static void setConnection(Boolean connection) {
        InfoService.connection = connection;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        InfoService.user = user;
    }
    
}
