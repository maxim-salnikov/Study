package dto.chat;

import dto.User;
import dto.chat.api.IChat;

import java.util.Set;

public class MediaChat extends AChat implements IChat {

    public MediaChat(Set<User> users) {
        super(users);
    }
}
