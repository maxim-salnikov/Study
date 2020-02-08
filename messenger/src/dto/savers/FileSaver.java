package dto.savers;

import dto.chat.api.IChat;
import dto.message.api.IMessage;
import dto.savers.api.ISaverChat;

import java.io.*;
import java.util.List;

public class FileSaver implements ISaverChat {
    private FileOutputStream stream;

    public FileSaver() throws FileNotFoundException {
        this("default_name.txt");
    }

    public FileSaver(String fileName) throws FileNotFoundException {
        this(new FileOutputStream(fileName));
    }

    public FileSaver(FileOutputStream stream) {
        this.stream = stream;
    }

    @Override
    public void save(IChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        try (PrintWriter writer = new PrintWriter(stream)) {
            for (IMessage message : messages) {
                writer.println(message);
            }
        }
    }
}
