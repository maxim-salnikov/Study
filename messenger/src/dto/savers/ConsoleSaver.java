package dto.savers;

import dto.chat.api.IChat;
import dto.message.api.IMessage;
import dto.savers.api.ISaverChat;

import java.util.List;

public class ConsoleSaver implements ISaverChat {
    @Override
    public void save(IChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        for (IMessage message : messages) {
            System.out.println(message);
        }
    }
}
