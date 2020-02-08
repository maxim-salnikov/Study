package io;

import java.io.*;

public class IOMain1 {
    public static void main(String[] args) {
        try(OutputStream stream = new FileOutputStream("file_text.txt");
                PrintWriter writer = new PrintWriter(stream)){
            writer.println("Привет запись в файл");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
