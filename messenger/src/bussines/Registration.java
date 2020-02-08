package bussines;

import dto.User;

import java.util.*;

public class Registration {
    private final Map<String, User> users = new LinkedHashMap<>();

    public User registration(String name, String pass){
        if(users.containsKey(name)){
            throw new IllegalArgumentException("Пользователь с таким именем уже существует");
        }
        return new User((long) (users.size() + 1), name, pass);
    }
}
