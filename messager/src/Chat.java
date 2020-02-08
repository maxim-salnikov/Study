import api.IChat;
import message.Message;
import message.MessageType;

import java.util.HashSet;
import java.util.List;

public class Chat implements IChat {
    private List<Message> messages;
//    private final Set<User> users = new HashSet<>();

    public Chat() {

    }

    @Override
    public void save(ISaverChat saver) {
        saver.save(this);
    }

//    @Override
//    public void addMesaage(Message<?> message) {
//        if (!MessageType.TEXT.equals(message.getType())){
//            throw new IllegalArgumentException("Только текстовое сообщение");
//        }
//    }
//
//    @Override
//    public void save(ISaverChat saver) {
//
//    }
}
