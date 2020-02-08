package io;

import messenger.dto.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOMain2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User u = new User(1l, ":", "asd");
        users.add(u);
        try(OutputStream stream = new FileOutputStream("file_text.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream)){
//            objectOutputStream.writeObject(u);
            objectOutputStream.writeObject(users);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
