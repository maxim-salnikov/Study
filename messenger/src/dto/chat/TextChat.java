package dto.chat;

import dto.User;
import dto.chat.api.IChat;
import dto.message.api.IMessage;
import dto.message.api.MessageType;

import java.io.Serializable;
import java.util.Set;

public class TextChat extends AChat implements IChat, Serializable {

    public TextChat() {
        super();
    }

    public TextChat(Set<User> users) {
        super(users);
    }

    @Override
    public void addMessage(IMessage message) {
        if(!MessageType.TEXT.equals(message.getType())){
            throw new IllegalArgumentException("Это только текстовый чат");
        }
        super.addMessage(message);
    }
}
