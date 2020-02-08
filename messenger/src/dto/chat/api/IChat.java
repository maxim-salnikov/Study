package dto.chat.api;

import dto.message.api.IMessage;
import dto.savers.api.ISaverChat;

import java.util.List;

public interface IChat {
    long countMessages();
    long countUsers();

    void addMessage(IMessage message);
    void addMessage(IMessage[] message);
    void addMessage(List<IMessage> message);
    List<? extends IMessage> getMessages();
    void save(ISaverChat saver);
}
