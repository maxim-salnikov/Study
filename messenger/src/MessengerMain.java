import com.company.Main;
import bussines.Registration;
import bussines.Validation;
import dto.User;
import dto.chat.TextChat;
import dto.savers.ConsoleSaver;
import dto.savers.FileSaver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class MessengerMain {
    Registration regCenter = new Registration();

    public static void main(String[] args) {
//
//
//        Main story = new Main();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите количество пользователей которое будем создавать");
//        int countUser = scanner.nextInt();
        TextChat textChat = new TextChat();

        textChat.save(new ConsoleSaver());
        try {
            textChat.save(new FileSaver(new FileOutputStream("file_name.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public User createUser(){
        String name = "byte@mail.ru";
        if(Validation.validateName(name)){

        }
        String pass = "123";
        if(Validation.validatePass(pass)){

        }
        return regCenter.registration(name, pass);
    }
}
