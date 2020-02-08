import api.IChat;
import message.IMessage;

public class ConsoleSaver implements ISaverChat {

    @Override
    public void save(IChat chat) {
        List<IMessage> message = chat.getMessages();
        //foreach
    }
}
